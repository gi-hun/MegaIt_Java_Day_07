/*
 * # �� ��ü�ϱ�[2�ܰ�] 
 */
// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
// ��    1) �ε���1 �Է� : 1
//		   �ε���2 �Է� : 3
//		  {10, 40, 30, 20, 50}
// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
// ��    2) ��1 �Է� : 40
//        ��2 �Է� : 20
//		  {10, 20, 30, 40, 50}
// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
// ��    3) �й�1 �Է� : 1002
//        �й�2 �Է� : 1003
//		 {87, 45, 11, 98, 23}
//12:00-12:15

package day_07;

import java.util.Scanner;

public class ArrayEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println("�ε���1 �Է�");
		int idx1 = sc.nextInt();
		System.out.println("�ε���2 �Է�");
		int idx2 = sc.nextInt();
		
		int check1 = 0;
		int check2 = 0;
		
		for(int i=0; i<5;i++)
		{
			if(i==idx1)
			{
				check1 = i;
			}
			if(i==idx2)
			{
				check2 = i;
			}
		}
		
		int temp = 0;
		
		temp = arr[check1];
		arr[check1] = arr[check2];
		arr[check2] = temp;
		
		for(int i=0; i<5;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		System.out.println("��1 �Է�");
		idx1 = sc.nextInt();
		System.out.println("��2 �Է�");
		idx2 = sc.nextInt();
		
		for(int i=0; i<5;i++)
		{
			if(arr[i]==idx1)
			{
				check1 = i;
			}
			if(arr[i]==idx2)
			{
				check2 = i;
			}
		}
		
		temp = arr[check1];
		arr[check1] = arr[check2];
		arr[check2] = temp;
		
		for(int i=0; i<5;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
		System.out.println("1.�й��� �Է����ּ���");
		int id1 = sc.nextInt();
		System.out.println("2.�й��� �Է����ּ���");
		int id2 = sc.nextInt();
		
		int[] id = {1001, 1002, 1003, 1004, 1005};
		int[] score  = {  87,   11,   45,   98,   23};
		
		check1 = 0;
		check2 = 0;
		temp = 0;
		
		for(int i=0; i<5; i++)
		{
			if(id1 == id[i])
			{
				check1 = i;
			}
			if(id2 == id[i])
			{
				check2 = i;
			}
		}
		
		temp = score[check1];
        score[check1] = score[check2];
		score[check2] = temp;
		
		for(int i=0; i<5; i++)
		{
			System.out.print(score[i] + " ");
		}
		
	}
}
