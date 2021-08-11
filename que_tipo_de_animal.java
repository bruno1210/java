/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class sdad {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
    
    
   
    int tipo, mam, ave, rep, tipom, tipoa;
 
  
    
    {
        
        tipo = 0;
        mam = 0;
        ave = 0;
        rep = 0;
        tipom = 0;
 
        //Primeiro menu de escolha
        System.out.println ("Escolha a classificacao de um animal:");
       System.out.println ("1 - Mamifero");
        System.out.println ("2 - Ave");
        System.out.println ("3 - Reptil");
        
        tipo = s.nextInt();
 
        //Classifica a resposta da pergunta
        if(tipo == 1)
        {
            //Opções para mamíferos
            System.out.println("Escolha uma das opcoes abaixo:");
            System.out.println("1 - Quadrupede");
            System.out.println("2 - Bipede");
            System.out.println("3 - Voador");
            System.out.println("4 - Aquatico");
            mam = s.nextInt();
            if(mam == 1)
            {
                System.out.println("Escolha uma das opcoes abaixo:");
                System.out.println("1 - Carnivoro");
                System.out.println("2 - Herbivoro");
                tipom = s.nextInt();
                if(tipom == 1)
                {
                    System.out.println("O animal escolhido e o leao!");
                }
                else if(tipom == 2)
                {
                    System.out.println("O animal escolhido e o cavalo!");
                }
                else
                {
                    System.out.println("Opcao invalida.");
                }
            }
            else if(mam == 2)
            {
                System.out.println("Escolha uma das opcoes abaixo:");
                System.out.println("1 - Onivoro");
                System.out.println("2 - Frutivoro");
                tipom = s.nextInt();
                if(tipom == 1)
                {
                    System.out.println("O animal escolhido e o homem!");
                }
                else if(tipom == 2)
                {
                    System.out.println("O animal escolhido foi o macaco!");
                }
                else
                {
                    System.out.println("Opcao invalida.");
                }
            }
            else if(mam == 3)
            {
                    System.out.println("O animal escolhido foi o morcego!");
            }
            else if(mam == 4)
            {
                    System.out.println("O animal escolhido foi a baleia!");
            }
            else
            {
                System.out.println("Opcao invalida.");
            }
        }   
 
        else if(tipo == 2)
        {
            //Opções para aves
            System.out.println("Escolha uma das opcoes abaixo:");
            System.out.println("1 - Nao Voadoras");
            System.out.println("2 - Nadadoras");
            System.out.println("3 - De Rapina");
            ave = s.nextInt();
            if(ave == 1)
            {
                System.out.println("Escolha uma das opcoes abaixo:");
                System.out.println("1 - Tropicais");
                System.out.println("2 - Polares");
                tipoa = s.nextInt();
                if(tipoa == 1)
                {
                    System.out.println("O animal escolhido foi o avestruz!");
                }
                else if(tipoa == 2)
                {
                    System.out.println("O animal escolhido foi o pinguim!");
                }
                else
                {
                    System.out.println("Opcao invalida.");
                }
            }
            else if(ave == 2)
            {
                System.out.println("O animal escolhido foi o pato!");
            }
            else if(ave == 3)
            {
                System.out.println("O animal escolhido foi a aguia! ");
            }
            else
            {
                System.out.println ("Opcao invalida. ");
            }
        }
 
        //Opções pra répteis
        else if(tipo == 3)
        {
            System.out.println("Escolha uma das opcoes abaixo:");
            System.out.println("1 - Com casco");
            System.out.println("2 - Carnivoro");
            System.out.println("3 - Sem patas");
            rep = s.nextInt();
            if(rep == 1)
            {
               System.out.println("O animal escolhido foi a tartaruga! ");
            }
            else if(rep == 2)
            {
                System.out.println("O animal escolhido foi um crocodilo! ");
            }
            else if(rep == 3)
            {
                System.out.println("O animal escolhido foi uma cobra! ");
            }
            else
            {
                System.out.println("Opcao invalida.");
            }
        }
 
        
  
        else
        {
            System.out.println("Opcao invalida.");
        }
    }
    }
}
