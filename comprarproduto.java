/* exercício: Crie um programa que valide se o usuário poderá comprar um produto informado, isto é, se ele possui
dinheiro suficiente para comprar os produtos. O usuário de verá informar seu nome, quanto possui de dinheiro, o
nome do produto, o valor do produto e a quantidade do mesmo. Crie uma saída de dados que utilize todos os dados
informados. */

public class comprarproduto {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       String nomeusuario, nomeproduto;
       int quantidade;
       float dinheiro, valor, valortotal;
       
            System.out.println("Qual é seu nome? ");
            nomeusuario = s.next();
            System.out.println("Quanto voce tem de dinheiro? ");
            dinheiro = s.nextFloat();
            System.out.println("Qual é o nome do produto? ");
            nomeproduto = s.next();
            System.out.println("Quanto vale o produto? ");
            valor = s.nextFloat();
            System.out.println("Qual é a quantidade do pruduto? ");
            quantidade = s.nextInt();
             
            valortotal = valor * quantidade;
            
            if ( valortotal <= dinheiro){
                System.out.println("pode comprar");
              } else {
                System.out.println(" Não pode comprar");
            }
    
}
}
