import java.util.Scanner;

public class tekToplam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sayi;
	int toplam = 0;
	int topla=0;
	System.out.println("Bir tam sayý giriniz:");
	sayi=sc.nextInt();
	for(int i=0 ; i<=sayi ; i++) {
		
		if(i%2==1) {
			toplam=toplam+i;
			
		
		}
		else if(i%2==0){
			topla=topla+i;
		}
		System.out.println("Girdiðiniz sayýya kadar olan tek sayýlarýn toplamý:" + toplam);
		System.out.println("Girdiðiniz sayýya kadar olan çift sayýlarýn toplamý:" + topla);
	}
	
}
}
