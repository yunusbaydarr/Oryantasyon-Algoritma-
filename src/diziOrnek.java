
public class diziOrnek {
public static void main(String[] args) {
	double[] myList= {8.24 , 5.2 , 6.8 , 9.2 , 4.72 ,6.9};
	double total=0;
	double enBuyuk=myList[0];
	double enKucuk=myList[0];
	for(double number:myList) {
		if(enBuyuk<number) {
			enBuyuk=number;
			}
		if(enKucuk>number) {
		 	enKucuk=number;
		 			}
		
		 		
		total+=number;  //total=total+number;
		System.out.print( number + " / ");
	}
	System.out.println("\nElemanlar�n Toplam�:" + total);
	System.out.println("Elemanda ki en b�y�k say�:" + enBuyuk);
	System.out.println("Elemanda ki en k���k say�:" + enKucuk);
}
}
