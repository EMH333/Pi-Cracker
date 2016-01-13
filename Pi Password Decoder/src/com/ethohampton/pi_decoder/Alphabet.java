package com.ethohampton.pi_decoder;

public class Alphabet {
	static int a = 1;
	static int b = 2;
	static int c = 3;
	static int d = 4;
	static int e = 5;
	static int f = 6;
	static int g = 7;
	static int h = 8;
	static int i = 9;
	static int j = 10;
	static int k = 11;
	static int l = 12;
	static int m = 13;
	static int n = 14;
	static int o = 15;
	static int p = 16;
	static int q = 17;
	static int r = 18;
	static int s = 19;
	static int t = 20;
	static int u = 21;
	static int v = 22;
	static int w = 23;
	static int x = 24;
	static int y = 25;
	static int z = 26;
	
	public static String letter;

	public static void findLetter(int num) {
		if (num == a) {
			letter = "a";
		} else if (num == b) {
			letter = "b";
		} else if (num == c) {
			letter = "c";
		} else if (num == d) {
			letter = "d";
		} else if (num == e) {
			letter = "e";
		} else if (num == f) {
			letter = "f";
		} else if (num == g) {
			letter = "g";
		} else if (num == h) {
			letter = "h";
		} else if (num == i) {
			letter = "i";
		} else if (num == j) {
			letter = "j";
		} else if (num == k) {
			letter = "k";
		} else if (num == l) {
			letter = "l";
		} else if (num == m) {
			letter = "m";
		} else if (num == n) {
			letter = "n";
		} else if (num == o) {
			letter = "o";
		} else if (num == p) {
			letter = "p";
		} else if (num == q) {
			letter = "q";
		} else if (num == r) {
			letter = "r";
		} else if (num == s) {
			letter = "s";
		} else if (num == t) {
			letter = "t";
		} else if (num == u) {
			letter = "u";
		} else if (num == v) {
			letter = "v";
		} else if (num == w) {
			letter = "w";
		} else if (num == x) {
			letter = "x";
		} else if (num == y) {
			letter = "y";
		} else if (num == z) {
			letter = "z";
		} else {
			return;
		}

	}
}
