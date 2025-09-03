package br.dev.rafael.macktheater.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        int opcao;

        do{
            System.out.println("\n===== MACK THEATER =====");
            System.out.println("(1) Cadastrar Espetaculo");
            System.out.println("(2) Cadastrar cliente");
            System.out.println("(3) Compra de entradas");
            System.out.println("(4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("Codando");
                    break;
                
                case 2:
                    System.out.println("Codando");
                    break;

                case 3:
                    System.out.println("Codando");
                    break;

                case 4:
                    System.out.println("saindo..");
                    break;
            
                default:
                    System.out.println("Opção invalida, tente novamente");
            }


        } while(opcao != 4);





        
        sc.close();

    }
}


