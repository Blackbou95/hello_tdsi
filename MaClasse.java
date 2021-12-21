public class MaClasse {

  public static int calculer(int a, int b) {
    int res = a + b;
    System.out.println(res);
    if (a == 0) {
      res = b * 2;
    } 
    
    if (b == 0) {
      res = a * a;     
    }
    return res; 
  }
}
