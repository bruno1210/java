
package View;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ProvaQ2 {
    
    public static void main (String [] args ){
        Scanner s = new Scanner (System.in);
        double juros, valor, valor1;
        int mes, consignado, correntista;
        float totalmes;
        int banco;
      
        
            System.out.println("Emprestimo Bancario");
            System.out.println("Informe o valor do Emprestimo");
                valor = s.nextDouble();
            System.out.println("Informe em quantos meses é o finaciamento");
                mes = s.nextInt();
                System.out.println("Escolhar um banco:"
                + " Banco do Brasil (1) --- Banco da Caixa Econômica Federal (2) ---"
                + "  Banco Itaú (3) --- Banco Santader (4) --- Banco Bradesco (5) ");
                banco = s.nextInt();
            System.out.println("O emprestimo é consignado ? SIM (1)  NÃO (2)");
                consignado = s.nextInt();
            System.out.println("Você é correntista do banco? SIM (1) NÃO (2)");
                correntista = s.nextInt();
            
        
                // Banco do Brasil
    if (banco == 1 && consignado == 2 && correntista == 2 ){
            juros = (valor * 3.06 /100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor total é:" + valor1);
        }
        else if (banco == 1 && consignado == 1 && correntista == 2) {
            
            juros = (valor * 2.96 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }  
        else if (banco == 1 && consignado == 1 && correntista == 1){   
             juros = (valor * 2.91 / 100) * mes;
             valor1 = valor + juros;
             totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
             System.out.println("O valor final é:" + valor1);
        }     
                /// Banco da Caixa
    if (banco == 2 && consignado == 2 && correntista == 2){
            juros = (valor * 3.32 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }   
        else if (banco == 2 && consignado == 1 && correntista == 2){
            juros = (valor * 3.22 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1); 
        }
        else if (banco == 2 && consignado == 1 && correntista == 1){
            juros = (valor * 3.17 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }
                // Banco Itaú
    if (banco == 3 && consignado == 2 && correntista == 2){
            juros = (valor * 3.70 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);    
        }
        else if(banco == 3 && consignado == 1 && correntista == 2){
            juros = (valor * 3.6 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" +valor1);
        }
        else if(banco == 3 && consignado == 1 && correntista == 1){
            juros = (valor * 3.55 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }
                // Banco Santander
    if (banco == 4 && consignado == 2 && correntista == 2){
            juros = (valor * 4.28 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }
        else if(banco == 4 && consignado == 1 && correntista == 2){
            juros = (valor * 4.18 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }
        else if(banco == 4 && consignado == 1 && correntista == 1){
            juros = (valor * 4.13 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }
                // Banco Bradesci
    if (banco == 5 && consignado == 2 && correntista == 2){
            juros = (valor * 4.96 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }
        else if(banco == 5 && consignado == 1 && correntista == 2){
            juros = (valor * 4.86 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        }
        else if(banco == 5 && consignado == 1 && correntista == 1){
            juros = (valor * 4.81 / 100) * mes;
            valor1 = valor + juros;
            totalmes = (float) (valor1 / mes);
          
            System.out.println("O valor a ser pago por mes é : " + totalmes);
            System.out.println("A diferença do emprestimo para o juros é : " + juros);
            System.out.println("O valor final é:" + valor1);
        
    
         }
    }
          
}
