/*
 * # �����̵�[1�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 */
//12:30-12:56

package day_07;

import java.util.Scanner;

public class ArrayEx14 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int[] game = {0,0,2,0,0,0,0};
		
		int check = 0;
		for(int i=0; i<7;i++)
		{
			if(game[i] == 2)
			{
				check = i;
			}
		}
		
		while(true)
		{	
			for(int i=0; i<7;i++)
			{
				System.out.print(game[i]+" ");
			}
			
			System.out.print("����[1] ������[2] �Է�:");
			int dir = sc.nextInt();
			
			if(dir == 1)
			{
				if(check <= 0)
				{
					System.out.println("���� ���"+check);
					break;
				}
				else
				{
					game[check - 1] = 2;
					game[check] = 0 ;
					check--;		//check�� = ���� ������ player�� ��ġ
				}

			}
			
			if(dir == 2)
			{
				if(check>=6)
				{
					System.out.println("���� ���"+check);
					break;
				}
				else
				{
					game[check + 1] = 2;
					game[check] = 0 ;
					check++;		//check�� = ���� ������ player�� ��ġ
				}
			}
			
		}
	}
}
