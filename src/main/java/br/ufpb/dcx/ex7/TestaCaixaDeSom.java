package br.ufpb.dcx.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaCaixaDeSom {
    public static void main(String[]args){
        Scanner resp = new Scanner(System.in);
        int contador = 5;
        CaixaDeSom caixaSom = new CaixaDeSom();

        for (int k = 0; k < contador; k++){
            System.out.println("\n1.Adicionar Tambor\n" + "2.Adicionar Cachorro");
            int opcao = resp.nextInt();
            resp.nextLine();
            switch(opcao){
                case 1:
                    System.out.print("Digite o tamanho do Tambor: ");
                    String tamanho = resp.nextLine();

                    System.out.print("Digite a marca do Tambor: ");
                    String marca = resp.nextLine();

                    EmissorDeSom somTambor = new Tambor(tamanho, marca);
                    caixaSom.adicionarEmissor(somTambor);

                    System.out.println("Tambor adicionado");
                    break;
                case 2:
                    System.out.print("Digite o nome do Cachorro: ");
                    String nome = resp.nextLine();

                    EmissorDeSom somCachorro  = new Cachorro(nome);
                    caixaSom.adicionarEmissor(somCachorro);

                    System.out.println("Cachorro adicionado");
                    break;
                default:
                    System.out.println("Código inválido");
                    break;
            }
        }
        if(caixaSom.getEmissores().isEmpty()){
            System.out.println("\nNão há emissores de som.");
        }else{
            System.out.println("\nEmitindo os sons presentes: ");
            caixaSom.tocarTodosOsEmissores();
        }
        System.out.println();
        System.out.println("Programa Finalizado.");
        resp.close();
    }
}
