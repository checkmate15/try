package calculator;
import java.util.Scanner;
public class income_prog {
	public static void main(String [] args) {
		
		char yn;
		
		Scanner type = new Scanner(System.in);
		System.out.print("Type your name here = ");
		String name = type.nextLine();
		
		System.out.print(name + ", Type your Hourly wage = ");
		 double hw =type.nextDouble();
		
		System.out.print(name + ", Type your daily working Hour = ");
		double dh =type.nextDouble();
		
		double dti = (hw*dh);
		System.out.println(name + ", your daily total income = $"+ dti);
		
		System.out.println("Do u want to Check Your Weekly income yes = y and no = n : ");
		yn =type.next().charAt(0);
		
		
		
		if (yn == 'y'||yn =='Y') {
			System.out.print(name +", Type your weekly working hour = ");
			double wh =type.nextDouble();
			double wti = wh*hw;
			System.out.println(name + ", your weekly total income = $"+ wti);
			
			System.out.println("Do u want to Check Your Monthly income ");
			System.out.println(" yes = y and no = n : ");
			yn =type.next().charAt(0);
			

			if( yn == 'y'|| yn == 'Y') {
				double mh=wh*4;
				double mti = mh*hw;
				System.out.println(name + ", your monthly total income = $"+ mti);
				
				
				System.out.println("Do u want to Check Your Yearly income ");
				System.out.println("yes = y and no = n : ");
				yn =type.next().charAt(0);
				

				if( yn == 'y'|| yn == 'Y') {					
					double yh = mh*12;
					double yti = yh*hw;
					System.out.println(name + ", your yearly total income = $"+ yti);
					
				}else {
					System.out.println(name +", Thank you, see yaa");
				}
			
			}else{
				System.out.println(name +", Thank you, see yaa");
			}
			
		}else{
			System.out.println(name +", Thank you, see yaa");
		}
		
	}

}
