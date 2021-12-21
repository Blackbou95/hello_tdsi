import junit.framework.*;

public class MaClasseTest extends TestCase {

  public void testCalculer() throws Exception {
   MaClasse maclasse = new MaClasse(); 
    assertEquals(2,maclasse.calculer(1,1));
  }
}
