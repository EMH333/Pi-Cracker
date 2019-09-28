package com.ethohampton.pi_decoder;

public class Alphabet {
	final static int a = 1;
	final static int b = 2;
	final static int c = 3;
	final static int d = 4;
	final static int e = 5;
	final static int f = 6;
	final static int g = 7;
	final static int h = 8;
	final static int i = 9;
	final static int j = 10;
	final static int k = 11;
	final static int l = 12;
	final static int m = 13;
	final static int n = 14;
	final static int o = 15;
	final static int p = 16;
	final static int q = 17;
	final static int r = 18;
	final static int s = 19;
	final static int t = 20;
	final static int u = 21;
	final static int v = 22;
	final static int w = 23;
	final static int x = 24;
	final static int y = 25;
	final static int z = 26;

	public static String letter;

	public static String findLetter(int num) {
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
			letter = "-";
		}
		return letter;

	}
}
