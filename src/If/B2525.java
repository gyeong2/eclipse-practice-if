package If;
import java.util.Scanner;

public class B2525 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		int h = input.nextInt(); //�ð�
		int m = input.nextInt(); //��
		int s = input.nextInt(); //�ʿ� �ð�
		
		m += s;
		
		if(m >= 60) { //���� ���� 60�� ������
			while(m >= 60) {
				h++; //�ð��� �߰�
				m -= 60;
			}
		}
		
		if(h >= 24) { //���� �ð��� 24�� ������
			h -= 24;
		}
		
		System.out.println(h+" "+m);
	}
}
