
package aula0106;
import java.util.Scanner;
/**
 * @author BRUNO Wilia Crispim  da Silva
 */
public class ex3 {
    public static void main (String [] args ){
        Scanner s = new Scanner (System.in);
      int x1, x2, x3;
      System.out.println("Informe o primeiro número: ");
      x1 = s.nextInt();
      System.out.println("Informe o segundo número: ");
      x2 = s.nextInt();
      System.out.println("Informe o terceiro número: ");
      x3 = s.nextInt();
      int aux;
      if (x1 > x2) {
          aux = x2;
          x2 = x1;
          x1 = aux;
      }
      if (x1 > x3) {
          aux = x2;
          x2 = x1;
          x1 = aux;
      } else if (x2 > x3) {
          aux = x2;
          x2 = x3;
          x3 = aux;
      }
      System.out.println(x1 + " " + x2 + " " + x3);      
      }
    }
