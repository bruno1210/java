/*Crie um programa de determine se uma pessoa possui uma idade superior a 17 anos. O usuário deverá informar o nome,
ano de nascimento e email da pessoa. É obrigatório utilizar classe para representar a pessoa. */

public static void main(String[] args) {
    

        int data, res;
        String nome, email;
        Scanner s = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        nome = s.nextLine();
        System.out.println("Qual é o seu email?");
        email= s.nextLine();
        System.out.println("Qual é sua data de nascimento? ");
        data = s.nextInt();
        res = 2021 - data;

        if (res > 17) {
        System.out.println("Maior que 17");
            
        } else {
            System.out.println("menor que 17");
            
        }
    }
