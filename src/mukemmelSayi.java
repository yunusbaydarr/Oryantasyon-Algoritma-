// M�kemmel say�: Kendisi hari� tam b�lenlerinin toplam� kendisine e�it say�lar.
import java.util.Scanner;

public class mukemmelSayi {
public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	int number;
	int toplam = 0;
	
	System.out.println("Bir tam say� giriniz: ");
	number = read.nextInt();
	for (int i = 1 ; i<number; i++) {
		if(number % i == 0) {
			toplam = toplam + i;
		}
	}
	if(toplam== number) {
		System.out.println("Girmi� oldu�unuz " + number + " say�s� M�kemmel bir say�d�r.");
	} else {
		System.out.println("Girmi� oldu�unuz " + number + " say�s� M�kemmel say� de�ildir.");
	}
	
}
}
