package com.ethohampton.pi_decoder.testing;

public class TestLooper {
	public static void testloop() {
		int i, j, k, m, n, o;
		String d1, d2, d3, d4, d5, d6;
		String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// First print 1-digit "numbers"
		for (i = 0; i < 36; i++) {
			d1 = digits.substring(i, i + 1);
			System.out.println(d1);
		}

		System.out.println();

		// Next, print 2-digit "numbers"
		for (i = 0; i < 36; i++) {
			d1 = digits.substring(i, i + 1);
			for (j = 0; j < 36; j++) {
				d2 = d1 + digits.substring(j, j + 1);
				System.out.println(d2);
			}
		}

		System.out.println();

		// Now print 3-digit "numbers"
		for (i = 0; i < 36; i++) {
			d1 = digits.substring(i, i + 1);
			for (j = 0; j < 36; j++) {
				d2 = d1 + digits.substring(j, j + 1);
				for (k = 0; k < 36; k++) {
					d3 = d2 + digits.substring(k, k + 1);
					System.out.println(d3);
				}
			}
		}

		System.out.println();

		// Now print 4-digit "numbers"
		for (i = 0; i < 36; i++) {
			d1 = digits.substring(i, i + 1);
			for (j = 0; j < 36; j++) {
				d2 = d1 + digits.substring(j, j + 1);
				for (k = 0; k < 36; k++) {
					d3 = d2 + digits.substring(k, k + 1);
					for (m = 0; m < 36; m++) {
						d4 = d3 + digits.substring(m, m + 1);
						System.out.println(d4);
					}
				}
			}
		}

		System.out.println();

		// Finally, print 5-digit "numbers"
		for (i = 0; i < 36; i++) {
			d1 = digits.substring(i, i + 1);
			for (j = 0; j < 36; j++) {
				d2 = d1 + digits.substring(j, j + 1);
				for (k = 0; k < 36; k++) {
					d3 = d2 + digits.substring(k, k + 1);
					for (m = 0; m < 36; m++) {
						d4 = d3 + digits.substring(m, m + 1);
						for (n = 0; n < 36; n++) {
							d5 = d4 + digits.substring(n, n + 1);
							System.out.println(d5);
						}
					}
				}
			}
		}

		// 6 digits
		for (i = 0; i < 36; i++) {
			d1 = digits.substring(i, i + 1);
			for (j = 0; j < 36; j++) {
				d2 = d1 + digits.substring(j, j + 1);
				for (k = 0; k < 36; k++) {
					d3 = d2 + digits.substring(k, k + 1);
					for (m = 0; m < 36; m++) {
						d4 = d3 + digits.substring(m, m + 1);
						for (n = 0; n < 36; n++) {
							d5 = d4 + digits.substring(n, n + 1);
							for (o = 0; n < 36; o++) {
								d6 = d5 + digits.substring(o, o + 1);
								System.out.println(d6);
							}
						}
					}
				}
			}
		}
	}

}
