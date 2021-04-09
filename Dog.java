package DogScanner;

import java.util.Scanner;

public class Dog {

	Scanner in = new Scanner(System.in);
	
	void dogData() {
		System.out.println("1. Alaskan Malamute");
		System.out.println("2. Anatolian Shepherd Dog");
		System.out.println("3. Affenpinscher");
		System.out.println("4. Boston Terrier");
		System.out.println("Enter the number of corresponding dog: ");
		int dog = in.nextInt();
		if(dog == 1) {
			System.out.println("It is a kind of working dog which is mostly grey in colour and have a medium size.");
		}else if(dog == 2) {
			System.out.println("It is a kind of pastoral dog which is mostly white in colour and have a big size.");
		}else if(dog == 3) {
			System.out.println("It is a kind of toy dog which is mostly black in colour and have a small size.");
		}else if(dog == 4) {
			System.out.println("It is a kind of utility dog which is mostly black and white in colour, it also have a small size.");
			}
		}
	
	void calEat() {
		System.out.println("Enter the weight of the dog(in kg): ");
		double z = in.nextInt();
		double y = (1/z*10)*1000;
		double a = Math.round(y);
		System.out.println("Food needed for a day is around "+a+"g.");
	}
	
	void idealWeight() {
		System.out.println("Enter the starting weight of the dog(in pound): ");
		int d = in.nextInt();
		System.out.println("Enter the Body Condition System(BCS) of the dog: ");
		int e = in.nextInt();
		int f = (d*100)/(100+(e-5)*10);
		System.out.println("Ideal weight: "+f+" pounds.");
	}
	
	void calPrice() {
		System.out.println("The dogs with its corresponding price:");
		String[] dogs = new String[4];
		dogs[0] = "Alaskan Malamute		= RM3300.00";
		dogs[1] = "Anatolian Shepherd Dog 		= RM3800.00";
		dogs[2] = "Affenpinscher    		= RM3000.00";
		dogs[3] = "Boston Terrier       		= RM2800.00";
		for(int j=0; j<dogs.length; j++){
				System.out.println(dogs[j]);
		}
		System.out.println();	
		
		System.out.println("Quantity of dog wanted: ");
		System.out.print("Alaskan Malamute		=");
		int num1 = in.nextInt();
		System.out.print("Anatolian Shepherd Dog 		=");
		int num2 = in.nextInt();
		System.out.print("Affenpinscher    		=");
		int num3 = in.nextInt();
		System.out.print("Boston Terrier       		=");
		int num4 = in.nextInt();
		int sum = ((num1*3300) + (num2*3800) + (num3*3000) + (num4*2800));
		System.out.println("Total Price: RM " + sum);
	}
	void calCost() {
		System.out.println("Enter the price of your selected dog(one dog): ");
		int r = in.nextInt();
		int v = r*10;
		System.out.println("The cost of feeding for this kind of dog is around RM"+v+" a year.");
	}
	
	
	
	
}
