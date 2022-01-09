import java.util.Scanner;

public class delta {
public static void main(String[] args) {
	Scanner oku= new Scanner(System.in);
	int a,b,c;
	System.out.println("a de�erini giriniz (Denklemdeki ikinci dereceden ifadenin katsay�s�):");
	a=oku.nextInt();
	System.out.println("b de�erini giriniz (Denklemdeki birinci dereceden ifadenin katsay�s�):");
	b=oku.nextInt();
	System.out.println("c de�erini giriniz (Denklemdeki sabit say�):");
	c=oku.nextInt();
	
	double delta = deltaHesapla(a, b, c);
	deltaKontrol(delta);
}	
	
public static double deltaHesapla(int a ,int b , int c) {
	double delta= Math.pow(b, 2) - 4 * a * c;
	if(delta>0) {
		double x1= ((-1*b) + Math.sqrt(delta))/(2*a);
		double x2= ((-1*b) - Math.sqrt(delta))/(2*a);
		System.out.println("Birinci k�k�n�z:" + x1 + "\n"+ "�kinci k�k�n�z:" + x2);
	} else if(delta == 0) {
		double x1= ((-1*b) + Math.sqrt(delta))/(2*a);
		System.out.println("Denklemin k�k�:"+ x1);
	}
	return delta;
}
	public static void deltaKontrol(double delta) {
		if(delta>0) {
			System.out.println("�ki reel k�k var");
		}else if(delta==0) {
			System.out.println("�ki e�it k�k var");
		}else {
			System.out.println("Reel k�k yok");
		}
	}
		
   
}
