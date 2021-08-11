
package aula0106;

import java.util.Scanner;

/**
 *
 * @author BRUNO Wilian Cripim da Silva
 */
public class ex5 {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int idade, formal, beneficio, renda, desempregado, mae;
        
        System.out.println("Use 0 para NÃO e 1 para SIM:");
        System.out.println("Você é maior de idade :");
            idade = s.nextInt();
        System.out.println("Você NÃO tem emprego formal");
            formal = s.nextInt();
        System.out.println("Você Não é beneficiário: NÃO recebe benefício previdenciário ou assistencial, seguro-desemprego ou de outro programa de transferência de renda federal que não seja o Bolsa Família.");
            beneficio = s.nextInt();
        System.out.println("Sua renda familiar mensal per capita (por pessoa) é de até meio salário mínimo (R$ 550,00) ou renda familiar mensal total (tudo o que a família recebe) de até três salários mínimos (R$ 3.300,00).");
            renda = s.nextInt();
        System.out.println("Você estar desempregado ou exercer as seguintes atividades: exerce atividade na condição de microempreendedor individual (MEI) ou ser contribuinte individual ou facultativo do Regime Geral de Previdência Social (RGPS) ou ser trabalhador informal inscrito no Cadastro Único para Programas Sociais do Governo Federal (CadÚnico).");
            desempregado = s.nextInt();
        System.out.println("Você é mãe solteira ?");
            mae = s.nextInt (); 
      {
        if (idade == 1 && formal == 1 && beneficio == 1 && renda == 1 && desempregado == 1 && mae == 1)
            System.out.println("Parabéns! Você foi contemplado e receberá 1200.00 reais.");   
        
        else if (idade == 1 && formal == 1 && beneficio == 1 && renda == 1 && desempregado == 1 && mae == 0)
            System.out.println("Parabéns! Você foi contemplado e receberá 600.00 reais."); 
        
        else System.out.println("Você não cumpriu os requisitos para ganhar o auxilio.");
       }
    }
}
