package array.logic;

import java.util.Scanner;

public class ReverseNumberArray {

	public static void main(String[] args) {
		System.out.println("enter 5 numbers in array to reverse print it");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int i = 0;
		while (i < array.length) {
			array[i] = sc.nextInt();
			i++;
		}

		int left = 0, right = array.length - 1;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		
		i = 0;
		while(i < array.length){
			System.out.println(array[i]);
			i++;
		}
	}
}
