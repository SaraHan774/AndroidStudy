package com.my.dispatch;

import com.my.vo.Book;
//import com.my.vo.Magazine;
import java.util.Scanner;
import com.my.manager.*;

/**	Library program for managing books
 * 
 * @author puzzlepcs
 * input, delete, modify, view list and search books, terminate program
 * 
 * Program sequence
 * 		launch -> loop(menu -> choose -> execute) -> terminate
 * 
 * ��Ӱ� �������̵� ������ Ȱ���� ���α׷�.
 * 		Upcasting (��ü�� ����Ÿ������ ����ȯ ������.)
 * 		
 * 
 */

public class BookTest {
	public static void main(String[] args) {
		String mainMenu = "1)��ȸ   2)�Է�  3)����  4)����  5)�˻�  6)����";
		IManager man = new ListManager();
		boolean flag = true;
		int key;
		int index = 0;
		Scanner s = new Scanner(System.in);
		
		while(flag) {
			System.out.println(mainMenu);
			key = s.nextInt();
			switch (key) {
			case 1:		// ��ȸ
				man.list();
				break;
			case 2:		// �Է�
				man.insert();
				break;
			case 3:		// ����
				man.update();
				break;
			case 4:		// ����
				man.delete();
				break;
			case 5:		// �˻�
				man.find();
				break;
			case 6:		// ����
				flag = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("1~6������ ���ڸ� �Է��� �ּ���.");
				break;
			}
		}
	}
}
	
