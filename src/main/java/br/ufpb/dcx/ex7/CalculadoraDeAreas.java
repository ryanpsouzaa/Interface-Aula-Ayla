package br.ufpb.dcx.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeAreas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner resp = new Scanner(System.in);
        List<Figura> listaFiguras = new ArrayList<>();

        boolean repetidor = true;
        while (repetidor) {
            System.out.print("\n1.Adicionar Quadrado\n" + "2.Adicionar Triangulo\n"
                    + "3.Calcular área das figuras presentes\n" + "4.Sair\n");
            int opcao = resp.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = resp.nextDouble();

                    Figura quadrado = new Quadrado(lado);
                    listaFiguras.add(quadrado);

                    System.out.println("Quadrado adicionado.");
                    break;

                case 2:
                    System.out.print("Digite a base do triângulo: ");
                    double base = resp.nextDouble();

                    System.out.print("Digite a altura do triângulo: ");
                    double altura = resp.nextDouble();

                    Figura triangulo = new Triangulo(base, altura);
                    listaFiguras.add(triangulo);

                    System.out.println("Triângulo adicionado.");
                    break;
                case 3:
                    if(listaFiguras.isEmpty()){
                        System.out.println("Não há figuras adicionadas.");
                    }else{
                        for (Figura c : listaFiguras) {
                            System.out.printf("Área: %.2f\n", c.calcularArea());
                    }
                    }
                    break;
                case 4:
                    repetidor = false;
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }
        System.out.println("Programa finalizado");
        resp.close();
    }
}
