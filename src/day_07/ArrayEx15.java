/*
 * # ���� ����
 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
 * 2. ������ ���߸� back�� �ش� ���ڸ� ������,
 *    back�� ��� ���� ä������ ������ ����ȴ�.
 * ��)
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * �Է�1 : 0
 * �Է�2 : 1
 * 
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
 */
//01:01 -01;38

package day_07;

import java.util.Scanner;
import java.util.Random;

public class ArrayEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		int i = 0;
		while(i < 1000) 
		{
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		
		for(int j=0; j<10; j++) 
		{
			System.out.print(j + " ");
		}
		
		System.out.println(" ");
		
		
		
		int check1 = 0;
		int check2 = 0;
		int min = 10;
		
		int count = 0;
		while(true)
		{
			System.out.println("count = " + count);
			
			for (i=0; i<10; i++)
			{
				System.out.print(front[i] + " ");
			}
			System.out.println(" ");
			for (i=0; i<10; i++)
			{
				System.out.print(back[i] + " ");
			}
			System.out.println(" ");
			
			if(count == 5) {
				System.out.println("���� ����");
				break;
			}
			
			System.out.println("�Է�1");
			int num1 = sc.nextInt();
			System.out.println("�Է�2");
			int num2 = sc.nextInt();
			
			if((front[num1]) == (front[num2]))
			{
				back[num1] = front[num1];
				back[num2] = front[num2];
				count ++;
			}

//			for (i=0; i<10; i++)
//			{
//				if(back[i] <min)
//				{
//					min = back[i];				
//				}
//			}
			
//			System.out.println("�ּڰ�: " + min);
		}

	}
}
