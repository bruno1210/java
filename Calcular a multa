
package aula0106;
import java.util.Scanner;
/**
 * @author BRUNO Wilian Crispim da Silva
1. Informe 50 reais se estiver até 10km/h acima;
2. Informe 100 reais se estiver entre 11km/h a 30km/h acima;
3. Informe 300 reais se estiver acima de 31km/h acima;
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);       
       int velo, limite;     
    System.out.println ("Informe o limite maximo da pista ");
        limite = s.nextInt();
     System.out.println("Informe a velocidade do carro");
        velo = s.nextInt();
     if (velo >= limite + 31)
         System.out.println ("Você recebeu uma multa de 300 reais ");
     else if (velo >= limite + 11 && velo <= limite + 30)
        System.out.println ("Você recebeu uma multa de 100 reais ");
     else if (velo >= limite + 10 &&  velo <= limite +20)
          System.out.println("Você recebeu uma multa de 50 reais ");
     else if (velo < limite)
             System.out.println ("Você não recebeu nenhuma multa");
                }       
        }
