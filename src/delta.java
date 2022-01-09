import java.util.Scanner;

public class delta {
public static void main(String[] args) {
	Scanner oku= new Scanner(System.in);
	int a,b,c;
	System.out.println("a deðerini giriniz (Denklemdeki ikinci dereceden ifadenin katsayýsý):");
	a=oku.nextInt();
	System.out.println("b deðerini giriniz (Denklemdeki birinci dereceden ifadenin katsayýsý):");
	b=oku.nextInt();
	System.out.println("c deðerini giriniz (Denklemdeki sabit sayý):");
	c=oku.nextInt();
	
	double delta = deltaHesapla(a, b, c);
	deltaKontrol(delta);
}	
	
public static double deltaHesapla(int a ,int b , int c) {
	double delta= Math.pow(b, 2) - 4 * a * c;
	if(delta>0) {
		double x1= ((-1*b) + Math.sqrt(delta))/(2*a);
		double x2= ((-1*b) - Math.sqrt(delta))/(2*a);
		System.out.println("Birinci kökünüz:" + x1 + "\n"+ "Ýkinci kökünüz:" + x2);
	} else if(delta == 0) {
		double x1= ((-1*b) + Math.sqrt(delta))/(2*a);
		System.out.println("Denklemin kökü:"+ x1);
	}
	return delta;
}
	public static void deltaKontrol(double delta) {
		if(delta>0) {
			System.out.println("Ýki reel kök var");
		}else if(delta==0) {
			System.out.println("Ýki eþit kök var");
		}else {
			System.out.println("Reel kök yok");
		}
	}
		
   
}
