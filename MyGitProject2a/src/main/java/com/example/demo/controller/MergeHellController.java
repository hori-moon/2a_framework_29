package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	public static void kadaiB() {
		Random rnd = new Random();

		System.out.println(rnd.nextInt(100));
	}
}