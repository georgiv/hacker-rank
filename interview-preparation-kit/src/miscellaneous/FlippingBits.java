package miscellaneous;

public class FlippingBits {
  static long flippingBits(long n) {
    int[] bits = new int[32];

    char[] charBits = Long.toBinaryString(n).toCharArray();
    for (int i = charBits.length - 1, j = bits.length - 1; i >= 0; i--, j--) {
      bits[j] = charBits[i] - 48;
    }

    for (int i = 0; i < bits.length; i++) {
      if (bits[i] == 0) bits[i] = 1;
      else bits[i] = 0;
    }

    long res = 0;

    for (int i = bits.length - 1, j = 0; i >= 0 ; i--, j++) {
      res += (long) Math.pow(bits[i] * 2, j);
    }

    if (bits[bits.length - 1] == 0) res -= 1;

    return res;
  }
}
