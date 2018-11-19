package tom.com;

import java.util.Random;
import java.util.Scanner;

public class Guess3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = new Random().nextInt(10)+1;
		System.out.println(num);
		System.out.println("Please enter number:");
		int guess = scanner.nextInt();
		int i =0;
		for(i=0;i<2;i++){
			if(num!=guess) {
				System.out.println("no");
				guess = scanner.nextInt();
				
			}else {
				System.out.println("yes");
			}
		}
		System.out.println("finish");

	}

}
