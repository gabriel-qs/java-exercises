/*1. Write a Java program to print 'Hello' on screen and your name on a separate line.*/

import java.util.Scanner;

public class Hello {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = input.nextLine();

		System.out.println("Hello!");
		System.out.println(nome);
	}
}
