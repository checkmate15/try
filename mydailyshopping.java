package calculator;
import java.util.Scanner;
public class mydailyshopping {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int so =1;
		int si =1;
		int ch = 5;
		int bora=5;
		int soda =1;
		
		System.out.println("how many soda u got = ");
		int sod = input.nextInt();
		
		System.out.println("how many somosa u got = ");
		int s = input.nextInt();
		
		System.out.println("how many singara u got");
		int k = input.nextInt();
		
		int total_soda = soda*sod;
		int total_somosa = so*s;
		int total_singara = si*k;
		int alltotal =(total_somosa+total_singara+ch+bora+total_soda);
		
		System.out.println("total somosa = "+ total_somosa);
		System.out.println("total singara = "+ total_singara);
		System.out.println("total chan = "+ ch);
		System.out.println("total bora = "+ bora);
		System.out.println("all soda = " + total_soda);
		System.out.println("all togethre = "+ alltotal);
		
		
	}

}
