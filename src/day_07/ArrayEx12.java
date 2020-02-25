/*
 * # 값 교체하기[2단계] 
 */
// 문제 1) 인덱스 2개를 입력받아 값 교체하기
// 예    1) 인덱스1 입력 : 1
//		   인덱스2 입력 : 3
//		  {10, 40, 30, 20, 50}
// 문제 2) 값 2개를 입력받아 값 교체하기
// 예    2) 값1 입력 : 40
//        값2 입력 : 20
//		  {10, 20, 30, 40, 50}
// 문제 3) 학번 2개를 입력받아 성적 교체하기
// 예    3) 학번1 입력 : 1002
//        학번2 입력 : 1003
//		 {87, 45, 11, 98, 23}
//12:00-12:15

package day_07;

import java.util.Scanner;

public class ArrayEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.println("인덱스1 입력");
		int idx1 = sc.nextInt();
		System.out.println("인덱스2 입력");
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
		System.out.println("값1 입력");
		idx1 = sc.nextInt();
		System.out.println("값2 입력");
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
		
		System.out.println("1.학번을 입력해주세요");
		int id1 = sc.nextInt();
		System.out.println("2.학번을 입력해주세요");
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
