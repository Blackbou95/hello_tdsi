package src.test.java;

import junit.framework.TestCase;
import src.main.java.MaClasse;

public class MaClasseTest extends TestCase {

  public void testCalculer() throws Exception {
   MaClasse maclasse = new MaClasse();
    assertEquals(2,maclasse.calculer(1,1));
  }
}
