package If;
import java.util.Scanner;

public class B2525 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		int h = input.nextInt();
		int m = input.nextInt();
		int s = input.nextInt(); //필요시간
		
		m += s;
		
		if(m >= 60) {
			while(m >= 60) {
				h++;
				m -= 60;
			}
		}
		
		if(h >= 24) {
			h-=24;
		}
		
		System.out.println(h+" "+m);
	}
}
