import java.util.Scanner;

public class ucakBiletii {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int yas,mesafe;
	double biletFiyat,yasIndirimi;
	System.out.println("Gidece�iniz mesafeyi kilometre t�r�nden giriniz.");
	mesafe=scan.nextInt();
	System.out.println("Ya��n�z� giriniz");
	yas=scan.nextInt();
	biletFiyat=mesafe*0.38; //km ba��na 0.38tl �denir.
	if(yas>=18 && yas<=25) {
		yasIndirimi=biletFiyat*20/100; //18-25 ya� aras� %20 indirim
		biletFiyat-=yasIndirimi;
	} else if(yas>=0 && yas<=5) {
		biletFiyat=0; //0-5 ya� aral���na �cretsiz.
	}else if(yas>=65) {  
		yasIndirimi=biletFiyat*30/100;  //65ya� �st�ne %30 indirim
		biletFiyat-=yasIndirimi;
	}
	System.out.println("Bilet fiyat�:" + biletFiyat + "TL");
}
}
