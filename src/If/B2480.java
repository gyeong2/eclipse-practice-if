package If;
import java.util.Scanner;

public class B2480 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		int f = input.nextInt(); //ù��° �ֻ���
		int s = input.nextInt(); //�ι�° �ֻ���
		int t = input.nextInt(); //����° �ֻ���
		
		if(f==s && s==t) {//������ ���� ���� ���
			System.out.println(10000+f*1000);
		}
		else if(f==s || s==t) { //�ΰ��� ���� ���� ���
			System.out.println(1000+s*100);
		}
		else if(f==t) { //�ΰ��� ���� ���� ���2
			System.out.println(1000+f*100);
		}
		else {
			System.out.println(Math.max(Math.max(f, s), t) *100);
		}
	}
}
