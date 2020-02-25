/*
 * # 기억력 게임
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 0
 * 입력2 : 1
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
				System.out.println("게임 종료");
				break;
			}
			
			System.out.println("입력1");
			int num1 = sc.nextInt();
			System.out.println("입력2");
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
			
//			System.out.println("최솟값: " + min);
		}

	}
}
