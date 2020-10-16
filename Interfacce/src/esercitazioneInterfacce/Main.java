package esercitazioneInterfacce;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x;
		float a = 11.5f, b = 7.4f;
		Numero q, c;
		Operazione sub, div, mul, sum;
		
		System.out.println("digitare un numero");
		x = s.nextInt();
		
		q = new Quadrato(x);
		c = new Cubo(x);

		sum = new Sum();
		sub = new Subtraction();
		mul = new Multiplication();
		div = new Division();
		
		sum.apply(a, b);
		sum.stampaVideo();
		sub.apply(a, b);
		sub.stampaVideo();
		mul.apply(a, b);
		mul.stampaVideo();
		div.apply(a, b);
		div.stampaVideo();
		
		s.close();
		
	}

}
