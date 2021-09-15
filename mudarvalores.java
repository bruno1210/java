/* Crie um programa que troque os valores que estão armazenados nas variáveis nome1 e nome2. A
variável nome1 armazenara o valor “mestre do universo”. A variável nome2 receberá um valor informado pelo
usuário. Altere os valores das variáveis e exiba a soma da variável nome1 com o valor da variável nome2. */

public class troquevalores {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
    
   String nome_1 = "mestre do universo";
   String nome_2;
   
        System.out.println("o valor da primeira var1 é: " + nome_1);
        System.out.println("mude o valor da var1");
        nome_1 = s.next();
        System.out.println("Informe o nome da 2º var");
        nome_2 = s.next();
        System.out.println(nome_1 +" "+ nome_2);
}
    
}
