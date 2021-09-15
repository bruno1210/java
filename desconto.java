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
