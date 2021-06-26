package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		File file = new File("\\D:\\test2");
		PrintStream print = new PrintStream(file);
		print.println("У меня здорово получается!");
		print.println(777);
		print.printf("Hello %s, Word %d","Amigo", 23);
		file.toString();
		print.close();
	}
}
