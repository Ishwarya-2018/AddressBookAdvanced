package com.blbz.advancd.addresbook.utility;

import java.util.Scanner;

public class InputUtils {
	private static Scanner sc = new Scanner(System.in);

	public static int getInt() {
		return sc.nextInt();
	}

	public static Long getLong() {
		return sc.nextLong();
	}

	public static String getString() {
		return sc.next();
	}

	public static float getFloat() {
		return sc.nextFloat();
	}

	public static String getLineString() {
		return sc.nextLine();
	}
}
