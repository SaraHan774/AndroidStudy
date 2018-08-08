package manager;

import menu.*;
import java.util.Scanner;

public class SandwichManagement {
	private Sandwich[] sandwich;
	private int cnt;
	
	public SandwichManagement() {
		sandwich = new Sandwich[10];
	}
	
	public int addOrder() {
		Scanner s = new Scanner(System.in);
		System.out.println("1)��Ƽ ������ġ  2)��Ű�������ƺ�ī�� ������ġ");
		int menu = s.nextInt();
		
		Sandwich ss = null;
		switch (menu) {
		case 1:
			ss = new ItalianBLTSandwich();
			break;
		case 2:
			ss = new TurkeyBaconAvocadoSandwich();
			break;
		default:
			System.out.println("1,2 �߿� ���");
		}
		System.out.println("������ �Է����ּ���.");
		int amount = s.nextInt();
		
		ss.setAmount(amount);
		ss.prepareIngredient();
		sandwich[cnt] = ss;
		return ++cnt;
	} 
	public void printOrderList() {
		for (int i = 0; i < cnt; i++) {
			sandwich[i].printInfo();
		}
	}
	public void serveOrder() {
		Sandwich order = sandwich[0];
		for(int i = 1; i < cnt; i++) {
			sandwich[i-1] = sandwich[i];
		}
		cnt--;
		System.out.print("�����Ǵ� ������ġ: ");
		order.printInfo();
	}
}
