import java.util.Scanner;

public class tekToplam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sayi;
	int toplam = 0;
	int topla=0;
	System.out.println("Bir tam say� giriniz:");
	sayi=sc.nextInt();
	for(int i=0 ; i<=sayi ; i++) {
		
		if(i%2==1) {
			toplam=toplam+i;
			
		
		}
		else if(i%2==0){
			topla=topla+i;
		}
		System.out.println("Girdi�iniz say�ya kadar olan tek say�lar�n toplam�:" + toplam);
		System.out.println("Girdi�iniz say�ya kadar olan �ift say�lar�n toplam�:" + topla);
	}
	
}
}
