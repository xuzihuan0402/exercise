package tom.com;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = new Random().nextInt(100);
		System.out.print("ϵͳ�Ѳ���һ��������֣�0~99���������Ƕ��٣�");
		int num1 = scanner.nextInt();
		if (num1 >= 0 && num1 <= 99) {
			int i;
			int count = 0;
			for (i = 0; i < 100; i++) {
				count++;
	                if (num1 > num) {
	                	System.out.println("���µ�����̫���ˣ��ٲ£�");
	                	num1 = scanner.nextInt();
	                } else if (num1 < num) {
	                	System.out.println("���µ�����̫С�ˣ��ٲ£�");
	                	num1 = scanner.nextInt();
	                } else {
	                	System.out.println("��ϲ�㣬�¶��ˣ�");
	                	System.out.println("��һ������" + count + "��");
	                	int count1 = count + 1;
	                	if (count1 == 1) {
	                		System.out.println("��̫�����ˣ�һ�ξͲ¶ԣ�");
	                	} else if (count1 >= 2 && count1 <= 6) {
	                		System.out.println("��ܴ�����");
	                	} else if (count1 > 6) {
	                		System.out.println("sb,��������ô��Σ�");
	                		break;
	                	}
	                }
			}

	        } else {
	        	System.out.println("zz,������0~99������");
	        }
	    }
	
		
	}
		 
	

