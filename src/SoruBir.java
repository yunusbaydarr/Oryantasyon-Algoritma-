import java.util.Scanner;

public class SoruBir {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
double sayi1;
double sayi2;
char operator;
System.out.println("Birinci say�y� giriniz:");
sayi1=scan.nextInt();
System.out.println("�kinci say�y� giriniz:");
sayi2=scan.nextInt();
System.out.println(" +,-,/,* operat�rlerinden birini giriniz. " );
operator=scan.next().charAt(0);
switch(operator){
case '+' : System.out.println(sayi1+sayi2); 

case '-' : System.out.println(sayi1-sayi2); 

case '*' : System.out.println(sayi1*sayi2); 

case '/' : System.out.println(sayi1/sayi2); 

}

	}

}
