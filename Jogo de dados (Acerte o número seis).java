/*Implemente um projeto em java que tem como objetivo criar um game em que o jogador deverá jogar um dado dez
vezes. Caso o mesmo acerte o número seis até a décima jogada exiba uma mensagem de parabéns para o jogador. Caso
o jogador não consiga obter o número seis em suas jogadas exiba uma mensagem de consolo para o jogador.*/

   public static void main(String[] args) {

        
        
        int vezes, dado;
        
        Random gerador = new Random();
     
        for (dado = 0; dado < 10 ; dado++) {
        vezes = gerador.nextInt(6) +1 ;

        if ( vezes ==6) {
            System.out.println("Parabéns, você ganhou! ");
            break;
        } else {
            System.out.println("Você não ganhou *-*! ");
            
        }
        }

    }
