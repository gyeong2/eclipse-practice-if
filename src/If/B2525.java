package If;
import java.util.Scanner;

public class B2525 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		int h = input.nextInt(); //시간
		int m = input.nextInt(); //분
		int s = input.nextInt(); //필요 시간
		
		m += s;
		
		if(m >= 60) { //만약 분이 60을 넘으면
			while(m >= 60) {
				h++; //시간을 추가
				m -= 60;
			}
		}
		
		if(h >= 24) { //만약 시간이 24를 넘으면
			h -= 24;
		}
		
		System.out.println(h+" "+m);
	}
}
