package calculator;

import java.util.ArrayList;
public class prac {
	public static void main(String[] args) {
		
	//for(int s = 0; s >-5 ; s--){
		//System.out.println("print " + s);
			
	//	}
	
	   //int a = 2;
		//while(a<5) {
			//System.out.println(a);
			//a++;
		//}
		
		
		//enhance for loop
	 String array[] = {"apu", "Sourav", "adnan"};
	// System.out.println("my  length is "+ array.length);
	 
	 
	 for (String s: array) {
		// System.out.println("My name is "+ s);
	 }
	
	 
		//do while
		
//		int z = 10;
	//	do {
	//		System.out.println("my number is "+ z)
		//	z++;
			
		//}while (z<25);
	
		ArrayList <String> arraylist = new ArrayList<> ();
		//arraylist.add("apu" );
		 
		for(int b=0; b<5; b++) {
			arraylist.add("apu" );
			System.out.println(arraylist.size());
			System.out.println(arraylist.get(0));
		}
		//System.out.println(arraylist.size());
		//System.out.println(arraylist.get());
		
		
		
		
	}
}
