import java.util.Scanner;

public class SoruBir {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
double sayi1;
double sayi2;
char operator;
System.out.println("Birinci sayýyý giriniz:");
sayi1=scan.nextInt();
System.out.println("Ýkinci sayýyý giriniz:");
sayi2=scan.nextInt();
System.out.println(" +,-,/,* operatörlerinden birini giriniz. " );
operator=scan.next().charAt(0);
switch(operator){
case '+' : System.out.println(sayi1+sayi2); 

case '-' : System.out.println(sayi1-sayi2); 

case '*' : System.out.println(sayi1*sayi2); 

case '/' : System.out.println(sayi1/sayi2); 

}

	}

}
