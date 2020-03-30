package ShivaKumar_115508_TASK19;

import java.util.Scanner;
public class UserMainCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a[] = new int[20];
	    int n = sc.nextInt();
	    for (int i = 0; i < n; i++) {
	      a[i] = sc.nextInt();
	    }
	    System.out.println(addEvenOdd(a));

	}
	public static int addEvenOdd(int[] a) {
	    int n1 = 0, n2 = 0;
	    for (int i = 0; i < a.length; i++)
	      if (a[i] % 2 == 0)
	        n1 += (a[i] * a[i]);
	      else
	        n2 += (a[i] * a[i] * a[i]);
	    return n1 + n2;
	  }
}

