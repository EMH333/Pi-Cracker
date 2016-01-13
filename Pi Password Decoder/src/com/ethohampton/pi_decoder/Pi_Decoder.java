package com.ethohampton.pi_decoder;

public class Pi_Decoder {

	public String passwordToFind;
	public long trysToFindPass;
	public static String[] piInString;
	public static int[] piNumbers;

	public static void main(String[] args) {

		piInString = Pi.Pi.split(",");
		piNumbers = new int[1024];
		for (int i = 0; i < piInString.length; i++) {
			piNumbers[i] = Integer.parseInt(piInString[i]);

		}

		for (int i = 0; i < piNumbers.length; i++) {
			int v = piNumbers[i];
			int oldRange = (999 - 0);
			int newRange = (24 - 0);
			int newValue = (((v - 0) * newRange) / oldRange) + 0;
			piNumbers[i] = newValue;
			System.out.println(piNumbers[i]);
		}

	}
}
