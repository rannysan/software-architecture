package com.br.students.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    private static boolean run = true;
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> arlist = new List<String>();

    public static void main(String[] args) {
        while (run) {
            System.out.println("Menu");
            System.out.println("Digite 1 para inserir o estudante ");
            System.out.println("Digite 2 para imprimir a lista ");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Digite o nome do aluno: ");

                String name = scanner.nextLine();
                if (!arlist.contains(name)) {
                    arlist.add(name);
                } else {
                    System.out.println("O aluno já esta cadastrado!");
                }

            } else if (option.equals("2")) {
                System.out.println("Listando ...");
                for (String student : arlist) {
                    System.out.println(student);
                }
                run = false;
            } else {
                System.out.println("Digite uma opção válida");
            }
        }
        scanner.close();
    }
}
