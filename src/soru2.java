import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		double vize,finall;
		double ortalama;
		Scanner sc = new Scanner(System.in);
System.out.println("Vize notunuzu giriniz:");
	vize=sc.nextInt();
 System.out.println("Final notunuzu giriniz:");
 	finall=sc.nextInt();
 	ortalama=(vize*40/100)+(finall*60/100);
 	if(ortalama>=0 &&ortalama<50) {
 		System.out.println("Harf notunuz: FF \n" + "Ortalamanýz: " + ortalama);
 	}
 	else if(ortalama>=50 & ortalama<65) {
 		System.out.println("Harf notunuz: DD \n" + "Ortalamanýz:" + ortalama);
 	}else if(ortalama>=65 & ortalama<70) {
 		System.out.println("Harf notunuz: DC \n" + "Ortalamanýz:" + ortalama);
 	}else if(ortalama>=70 & ortalama<75) {
 		System.out.println("Harf notunuz: CC \n" + "Ortalamanýz:" + ortalama);
 	}else if(ortalama>=75 & ortalama<80) {
 		System.out.println("Harf notunuz: CB \n" + "Ortalamanýz:" + ortalama);
 	}else if(ortalama>=80 & ortalama<85) {
 		System.out.println("Harf notunuz: BB \n" + "Ortalamanýz:" + ortalama);
 	}else if(ortalama>=85 & ortalama<90) {
 		System.out.println("Harf notunuz: BA \n" + "Ortalamanýz:" + ortalama);
 	}else if(ortalama>=90 & ortalama<=100) {
 		System.out.println("Harf notunuz: AA \n" + "Ortalamanýz:" + ortalama);
 	}else {
 		System.out.println("Geçersiz not giriþi...");
 	}
 	
	
	
	}

}
