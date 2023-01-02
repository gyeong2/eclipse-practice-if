package If;
import java.util.Scanner;

public class B2480 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		int f = input.nextInt(); //첫번째 주사위
		int s = input.nextInt(); //두번째 주사위
		int t = input.nextInt(); //세번째 주사위
		
		if(f==s && s==t) {//세개의 눈이 같은 경우
			System.out.println(10000+f*1000);
		}
		else if(f==s || s==t) { //두개의 눈이 같은 경우
			System.out.println(1000+s*100);
		}
		else if(f==t) { //두개의 눈이 같은 경우2
			System.out.println(1000+f*100);
		}
		else {
			System.out.println(Math.max(Math.max(f, s), t) *100);
		}
	}
}
