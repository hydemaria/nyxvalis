package CadastroDeDevotos;

/*Ritual de Codificação – Cadastro de Devotos em Nyxvalis
Objetivo final: criar um sistema em Java que permita cadastrar
devotos e listar os consagrados, com um menu interativo.
 */

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        // entrada do ussuario
        Scanner caixaDeTexto = new Scanner(System.in);

        // arrays pra salvar o nome dos devotos
        String [] devotos = new String[13]; // 13 eh um numero sagrado nesse universo

        // pra saber qnts devotos ja foram cadastrados
        int contador = 0;


        // varivel pra controlar o funcionamento do menu
        boolean circuloAberto = true;

        while (circuloAberto) {
            System.out.println("\n🔮 MENU DO CÍRCULO 🔮");
            System.out.println("1 - Consagrar novo devoto");
            System.out.println("2 - Revelar os nomes consagrados");
            System.out.println("3 - Encerrar o círculo");
            System.out.print("Escolha uma opção: ");

            int opcao = caixaDeTexto.nextInt();
            caixaDeTexto.nextLine(); // limpa o buffer e impede afetar nas opçoes futuras

            switch (opcao){
                case 1:
                    if (contador < devotos.length) {
                        System.out.println("Digite o nome do novo devoto: ");
                        String nome = caixaDeTexto.nextLine(); // aq vai ler o nome digitado
                        devotos [contador] = nome; // guarda no array na posiçao atual
                        contador++; //aumenta o contador
                        System.out.println("O devoto consagrado com sucesso sob o céu de Nyxvalis!");
                    } else {
                        System.out.println("O circulo está completo. Nenhum novo devoto pode ser consagrado!");
                    }
                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("Ainda nenhum nome ecoa no circulo. Nenhum novo devoto foi consagrado.");
                    } else {
                        System.out.println("Nomes sagrados consagrados sob a benção de Nixvalis: ");
                        for (int i = 0; i < contador; i++) {
                            System.out.println("- " + devotos[i]);
                        }
                    }
                    break;

                case 3:
                    circuloAberto = false;
                    System.out.println("Encerrando o circulo... ");
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente.");
            }




        }

    }
}

