package canermastan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1- Hesap Makinesi\n2- Ortalama Hesaplama");
		short islem = scanner.nextShort();
		if (islem == 1) {
			Calculator calculator = new Calculator();
			System.out.println("Yapmak istediğiniz işlemi seçin (+ - * /): ");
			String operator = scanner.next();
			System.out.println("1. Sayıyı Giriniz: ");
			double number1 = scanner.nextDouble();
			System.out.println("2. Sayıyı Giriniz: ");
			double number2 = scanner.nextDouble();
			if (operator.equals("+")) {
				System.out.println("Sonuç: " + calculator.topla(number1, number2));
			}
			else if (operator.equals("-")) {
				System.out.println("Sonuç: " + calculator.cikar(number1, number2));
			}
			else if (operator.equals("*")) {
				System.out.println("Sonuç: " + calculator.carp(number1, number2));
			}
			else if (operator.equals("/")) {
				System.out.println("Sonuç: " + calculator.bol(number1, number2));

			}
		}
		else if (islem == 2) {
			System.out.println("Mevcut Değil.");
		}
	}
}
