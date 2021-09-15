
/* exercício: Crie um programa que calcule o valor de um produto com desconto. Nesse programa o usuário deverá
informar o nome e preço do produto.
Os descontos aplicados ao produto são:
 10%: Produtos que possuam um valor maior que 100,00 reais e um valor menor ou igual a 200,00 reais;
 20%: Produtos que possuam um valor maior que 200,00 reais e um valor menor ou igual a 300,00 reais;
 30%: Produtos que possuam um valor maior que 300,00 reais; */

public class desconto {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
    float valor, desconto;
    String nomeproduto;
    
        System.out.println("Qual é o nome do produto? ");
        nomeproduto = s.next();
        System.out.println("Qual é o valor do produto? ");
        valor = s.nextFloat();
        
        if (valor > 100 & valor <= 200 ) {
            
           desconto = (float) (valor * 0.10);
            System.out.println("O valor do " + nomeproduto +" com 10% de desconto é: " + (valor - desconto));
        }
            
        if (valor > 200 & valor <= 300) {
            
            desconto = (float) (valor * 0.20);
            System.out.println("O valor do "+ nomeproduto + " com 20% de desconto é: " + (valor - desconto));
        }    
            
        if (valor > 300){
            desconto = (float) (valor * 0.30);
            System.out.println("O valor do "+ nomeproduto + " com 30% de desconto é: "+ (valor - desconto));
        }
}
}



