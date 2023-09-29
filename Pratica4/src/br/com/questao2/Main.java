package br.com.questao2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<String>();
        Scanner ler = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome: ");
            String nome = ler.nextLine();
            System.out.println("Informe o telefone: ");
            String telefone = ler.nextLine();
            System.out.println("Informe o e-mail: ");
            String email = ler.nextLine();
            Dados dados = new Dados(nome, telefone, email);
            dq.add(nome);
            dq.add(telefone);
            dq.add(email);
        }

        for (Iterator itr = dq.iterator(); itr.hasNext(); ) {
            System.out.println(itr.next() + " ");
        }

        System.out.println(" ");
        System.out.println(" ********* ");
        System.out.println(" ");

        for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
            System.out.println(itr.next() + " ");
        }
    }
}