import java.util.Scanner;

public class Ex_Oper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int time = scanner.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�" + minute + "�� " + second + "���Դϴ�.");

	}

}