package com.example.demo.controller;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	void kadaiA() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("現在" + i + "回目のループです");
		}
	}

	void kadaiC() {
		int a = 50;
		int b = 75;
		int c = a + b;
		System.out.println(c);
	}
}