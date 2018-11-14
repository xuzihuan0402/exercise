package tom.com;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = new Random().nextInt(100);
		System.out.print("系统已产生一个随机数字（0~99），请问是多少？");
		int num1 = scanner.nextInt();
		if (num1 >= 0 && num1 <= 99) {
			int i;
			int count = 0;
			for (i = 0; i < 100; i++) {
				count++;
	                if (num1 > num) {
	                	System.out.println("您猜的数字太大了！再猜！");
	                	num1 = scanner.nextInt();
	                } else if (num1 < num) {
	                	System.out.println("您猜的数字太小了！再猜！");
	                	num1 = scanner.nextInt();
	                } else {
	                	System.out.println("恭喜你，猜对了！");
	                	System.out.println("你一共猜了" + count + "次");
	                	int count1 = count + 1;
	                	if (count1 == 1) {
	                		System.out.println("你太厉害了，一次就猜对！");
	                	} else if (count1 >= 2 && count1 <= 6) {
	                		System.out.println("你很聪明！");
	                	} else if (count1 > 6) {
	                		System.out.println("sb,滚！猜这么多次！");
	                		break;
	                	}
	                }
			}

	        } else {
	        	System.out.println("zz,请输入0~99的整数");
	        }
	    }
	
		
	}
		 
	

