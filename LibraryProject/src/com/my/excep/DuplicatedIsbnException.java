package com.my.excep;

public class DuplicatedIsbnException extends Exception {
	public DuplicatedIsbnException() {
		super("DuplicatedIsbnException:���� ���� ���� �� �����ϴ�.");
	}
	public void myMethod() {
		System.out.println("try another isbn...");
	}
}
