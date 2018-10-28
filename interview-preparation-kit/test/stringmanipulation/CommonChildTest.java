package stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

public class CommonChildTest {
  @Test
  public void commonChildTest1() {
    Assert.assertTrue(CommonChild.commonChild("HARRY", "SALLY") == 2);
  }

  @Test
  public void commonChildTest2() {
    Assert.assertTrue(CommonChild.commonChild("AA", "BB") == 0);
  }

  @Test
  public void commonChildTest3() {
    Assert.assertTrue(CommonChild.commonChild("SHINCHAN", "NOHARAAA") == 3);
  }

  @Test
  public void commonChildTest4() {
    Assert.assertTrue(CommonChild.commonChild("ABCDEF", "FBDAMN") == 2);
  }

  @Test
  public void commonChildTest5() {
    Assert.assertTrue(CommonChild.commonChild("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC") == 15);
  }
}
