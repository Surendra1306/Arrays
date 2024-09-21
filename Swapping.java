package Dsa_Arrays;

public class Swapping {

	public static void main(String[] args) {
		int x = 5;
		int y = 6;
		
		System.out.println("x=" +x+ ", y=" +y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("x=" +x+ ", y=" +y);
	}
}
