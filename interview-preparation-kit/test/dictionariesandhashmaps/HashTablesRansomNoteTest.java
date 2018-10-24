package dictionariesandhashmaps;

import org.junit.Assert;
import org.junit.Test;

public class HashTablesRansomNoteTest {
  @Test
  public void checkMagazineTest1() {
    String[] magazine = { "give", "me", "one", "grand", "today", "night" };
    String[] note = { "give", "one", "grand", "today" };
    Assert.assertTrue(HashTablesRansomNote.checkMagazine(magazine, note).equals("Yes"));
  }

  @Test
  public void checkMagazineTest2() {
    String[] magazine = { "two", "times", "three", "is", "not", "four" };
    String[] note = { "two", "times", "two", "is", "four" };
    Assert.assertTrue(HashTablesRansomNote.checkMagazine(magazine, note).equals("No"));
  }

  @Test
  public void checkMagazineTest3() {
    String[] magazine = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
    String[] note = {"ivo", "got", "some", "coconuts"};
    Assert.assertTrue(HashTablesRansomNote.checkMagazine(magazine, note).equals("No"));
  }
}
