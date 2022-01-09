import java.util.Scanner;

public class ucakBiletii {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int yas,mesafe;
	double biletFiyat,yasIndirimi;
	System.out.println("Gideceðiniz mesafeyi kilometre türünden giriniz.");
	mesafe=scan.nextInt();
	System.out.println("Yaþýnýzý giriniz");
	yas=scan.nextInt();
	biletFiyat=mesafe*0.38; //km baþýna 0.38tl ödenir.
	if(yas>=18 && yas<=25) {
		yasIndirimi=biletFiyat*20/100; //18-25 yaþ arasý %20 indirim
		biletFiyat-=yasIndirimi;
	} else if(yas>=0 && yas<=5) {
		biletFiyat=0; //0-5 yaþ aralýðýna ücretsiz.
	}else if(yas>=65) {  
		yasIndirimi=biletFiyat*30/100;  //65yaþ üstüne %30 indirim
		biletFiyat-=yasIndirimi;
	}
	System.out.println("Bilet fiyatý:" + biletFiyat + "TL");
}
}
