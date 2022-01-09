// Mükemmel sayý: Kendisi hariç tam bölenlerinin toplamý kendisine eþit sayýlar.
import java.util.Scanner;

public class mukemmelSayi {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int number;
	int toplam = 0;
	
	System.out.println("Bir tam sayý giriniz: ");
	number = read.nextInt();
	for (int i = 1 ; i<number; i++) {
		if(number % i == 0) {
			toplam = toplam + i;
		}
	}
	if(toplam== number) {
		System.out.println("Girmiþ olduðunuz " + number + " sayýsý Mükemmel bir sayýdýr.");
	} else {
		System.out.println("Girmiþ olduðunuz " + number + " sayýsý Mükemmel sayý deðildir.");
	}
	
}
}
