package com.gta.array;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 5, 4, 3, 4 };

		numbers = insertInt(numbers, 2, 0);
		
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}

	public static int[] removeInt(int[] numbers, int value) {
		int[] temp = new int[numbers.length];
		
		for(int i = 0, j = 0; i < numbers.length; i++, j++)
		{
			if(numbers[i] != value)
			{
				temp[j] = numbers[i];
			}
			else
			{
				j--;
			}
		}
		return temp;
	}

	public static int[] insertInt(int[] numbers, int value, int position) {
		int[] temp = new int[numbers.length+1];
		
		for(int i = 0, j = 0; i < numbers.length; i++, j++)
		{
			if(j == position)
			{
				temp[j] = value;
				i--;
			}
			else
			{
				temp[j] = numbers[i];
			}
		}
		return temp;
	}
}
