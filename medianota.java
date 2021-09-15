public class media {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
      float nota_1, nota_2, nota_3, nota_4, soma, media;
      String nome;
         System.out.println("Informe o seu nome: ");
         nome = s.next();
         System.out.println("Qual é sua 1º nota? ");
         nota_1 = s.nextFloat();
         System.out.println("Qual é sua 2º nota? ");
         nota_2  = s.nextFloat();
         System.out.println("Qual é sua 3º nota? ");
         nota_3 = s.nextFloat();
         System.out.println("Qual sua 4º nota? ");
         nota_4 = s.nextFloat();
         
         soma = nota_1 + nota_2 + nota_3 + nota_4;
         media = soma / 4;
         System.out.println("Sua média é: " + media);
                   
}
}


/* Exercício: Crie um programa que calcule a média de um aluno para a matéria de matemática. O aluno deve
informar seu nome e as quatro notas da matéria. */
