/* JOGO DA ADIVINHAÇÃO. Implemente um projeto em java que tem como objetivo criar um game em que o jogador
deverá adivinhar uma charada com base em uma dica. Caso o mesmo acerte deverá ser exibido uma mensagem de parabéns
para o jogador. Caso o jogador deverá ser exibido uma mensagem de consolo para o jogador. */


 public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String vento;
        System.out.println(" O que é o que é: passa diante do sol e não faz sombra? ");
        System.out.println(" Dica: É responsavel pela maior produção de energia limpa do nordeste.");
        vento = s.next();
        if (vento.equals("vento")) {
            System.out.println("Parabéns, você acertou!");
            
        } else {
            System.out.println("Você errou *-* ");            
        }
    }
