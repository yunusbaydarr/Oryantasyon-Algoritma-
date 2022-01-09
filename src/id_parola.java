import java.util.Scanner;

public class id_parola {
public static void main(String[] args) {
	Scanner Scan= new Scanner(System.in);
	String k_adý;
	String þifre;
	System.out.println("k_adý giriniz:");
	k_adý=Scan.nextLine();
	System.out.println("þifre giriniz:");
	þifre =Scan.nextLine();
	if(k_adý.equals("yunusbaydarr")&& þifre.equals("123456")){
		System.out.println("baþarýlý bir þekilde giriþ yaptýnýz");
	}
	else {
	System.out.println("Kullanýcý adý veya parola hatalý");
		
	}
}
}
