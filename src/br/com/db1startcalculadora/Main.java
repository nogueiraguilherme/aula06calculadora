package br.com.db1startcalculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner op = new Scanner(System.in);

		int n1;
		int n2;
		int choose;
		double calculo;

		System.out.println("Digite o primeiro número:");
		n1 = op.nextInt();
		System.out.println("Digite o segundo número:");
		n2 = op.nextInt();

		System.out.println("Qual operação desejada?");
		System.out.println("1 = Somar");
		System.out.println("2 = Subtrair");
		System.out.println("3 = Multiplicar");
		System.out.println("4 = Dividir");
		System.out.println("5 = Sair");
		choose = op.nextInt();
		calculo = 0;
		switch (choose) {
		case 1:
			calculo = calc.somar(n1, n2);
			break;
		case 2:
			calculo = calc.subtratir(n1, n2);
			break;
		case 3:
			calculo = calc.multiplicar(n1, n2);
			break;
		case 4:
			calculo = calc.divirdir(n1, n2);
			break;
		case 5:
			break;
		}

		System.out.println("Resultado: " + calculo);

	} 

}
