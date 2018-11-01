package trees;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

abstract class Node2 implements Comparable<Node2> {
  public  int frequency;
  public  char data;
  public  Node2 left, right;
  public Node2(int freq) {
    frequency = freq;
  }

  public int compareTo(Node2 tree) {
    return frequency - tree.frequency;
  }
}

class HuffmanLeaf extends Node2 {
  public HuffmanLeaf(int freq, char val) {
    super(freq);
    data = val;
  }
}

class HuffmanNode extends Node2 {
  public HuffmanNode(Node2 l, Node2 r) {
    super(l.frequency + r.frequency);
    left = l;
    right = r;
  }
}

class Decoding {
  void decode(String s, Node2 root) {
    char[] sChar = s.toCharArray();
    Node2 current = root;

    StringBuilder res = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (sChar[i] == '0') {
        current = current.left;
      } else if (sChar[i] == '1') {
        current = current.right;
      }
      if (current.left == null && current.right == null) {
        res.append(current.data);
        current = root;
      }
    }

    System.out.println(res.toString());
  }
}

public class HuffmanDecoding {
  public static Node2 buildTree(int[] charFreqs) {

    PriorityQueue<Node2> trees = new PriorityQueue<>();

    for (int i = 0; i < charFreqs.length; i++)
      if (charFreqs[i] > 0)
        trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));

    assert trees.size() > 0;

    while (trees.size() > 1) {
      Node2 a = trees.poll();
      Node2 b = trees.poll();

      trees.offer(new HuffmanNode(a, b));
    }

    return trees.poll();
  }

  public static Map<Character,String> mapA = new HashMap<>();

  public static void printCodes(Node2 tree, StringBuffer prefix) {
    assert tree != null;

    if (tree instanceof HuffmanLeaf) {
      HuffmanLeaf leaf = (HuffmanLeaf)tree;
      mapA.put(leaf.data, prefix.toString());
    } else if (tree instanceof HuffmanNode) {
      HuffmanNode node = (HuffmanNode)tree;

      prefix.append('0');
      printCodes(node.left, prefix);
      prefix.deleteCharAt(prefix.length() - 1);

      prefix.append('1');
      printCodes(node.right, prefix);
      prefix.deleteCharAt(prefix.length() - 1);
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String test= input.next();

    int[] charFreqs = new int[256];
    for (char c : test.toCharArray()) charFreqs[c]++;

    Node2 tree = buildTree(charFreqs);

    printCodes(tree, new StringBuffer());
    StringBuffer s = new StringBuffer();

    for(int i = 0; i < test.length(); i++) {
      char c = test.charAt(i);
      s.append(mapA.get(c));
    }

    Decoding d = new Decoding();
    d.decode(s.toString(), tree);
  }
}
