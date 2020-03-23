package com.br.students.list;

import java.util.*;
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
            showMenu();
            String option = scanner.nextLine();

            if (option.equals("1")) {
                addStudent();
            } else if (option.equals("2")) {
                listStudents();
            } else {
                System.out.println("Digite uma opção válida");
            }
        }
        scanner.close();
    }

    private static  void showMenu() {
        System.out.println("Menu");
        System.out.println("Digite 1 para inserir o estudante ");
        System.out.println("Digite 2 para imprimir a lista ");
    }

    private static void addStudent() {
        System.out.println("Digite o nome do aluno: ");

        String name = scanner.nextLine();
        if (!arlist.contains(name)) {
            arlist.add(name);
        } else {
            System.out.println("O aluno já esta cadastrado!");
        }
    }

    private static void listStudents() {
        System.out.println("Listando ...");
        arlist.forEach(System.out::println);
    }
}
