import java.util.Scanner;

public class id_parola {
public static void main(String[] args) {
	Scanner Scan= new Scanner(System.in);
	String k_ad�;
	String �ifre;
	System.out.println("k_ad� giriniz:");
	k_ad�=Scan.nextLine();
	System.out.println("�ifre giriniz:");
	�ifre =Scan.nextLine();
	if(k_ad�.equals("yunusbaydarr")&& �ifre.equals("123456")){
		System.out.println("ba�ar�l� bir �ekilde giri� yapt�n�z");
	}
	else {
	System.out.println("Kullan�c� ad� veya parola hatal�");
		
	}
}
}
