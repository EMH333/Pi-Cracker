package com.ethohampton.pi_decoder;

import com.ethohampton.pi_decoder.decoding.Decode_Pi;
import com.ethohampton.pi_decoder.decoding.Decode_Pi;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@SuppressWarnings("unused")
public class Pi_Decoder {

    public static String[] piInString;
    public static int[] piNumbers;

    public static void main(String[] args) {
/*        //piInString = Pi.Pi.split(",");// can use Pi or a set of randomly generated numbers
        piInString = Pi.PiRandom.split(", ");
        piNumbers = new int[piInString.length];
        for (int i = 0; i < piInString.length; i++) {
            piNumbers[i] = Integer.parseInt(piInString[i]);

        }
		*//*if(args.length > 0){
		 Decode_Pi.passwordToFind = args[0];
		}
		System.out.println(Decode_Pi.decode());*//*

        Decode_Pi.findHash("bbbafd", 6);*/

        String password = "osmx";
        byte[] passHash = hashString(password);

        int passwordLength = 4;
        long iterations = 10000000;
		HashSet<String> alreadyFound = new HashSet<>();
        //String pi = encodeInto36(Pi.Pi);
        //ArrayList<String> sections = divideIntoSections(pi, passwordLength);
        for (long i = 0; i < iterations;i++) {
        	String s = "0";
        	while(alreadyFound.contains(s)){
        		s = encodeInto36(String.valueOf(Math.random())).substring(5,passwordLength+5).toLowerCase();
			}
        	alreadyFound.add(s);
            //System.out.println(s);
			if(checkIfMatch(s,passHash)){
				System.out.println("WE FOUND IT!");
				System.out.println(i);
				return;
			}
        }
    }

    private static ArrayList<String> divideIntoSections(String input, int splitLength) {
        int inputLength = input.length();
        ArrayList<String> arrayList = new ArrayList<>();

        int i = inputLength;
        while (i > 0) {
            int beginIndex = Math.max(i - splitLength, 0);
            arrayList.add(0, input.substring(beginIndex, i));
            i -= splitLength;
        }

        return arrayList;
    }

    private static String encodeInto36(String string) {
        string = string.replaceAll("\\.", "");
        string = string.replaceAll(",", "");
        string = string.replaceAll(" ", "");
        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
        return new BigInteger(1, bytes).toString(36);
    }

    private static byte[] hashString(String string) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return md.digest(string.getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;//should never happen
    }

    private static boolean checkIfMatch(String s, byte[] target) {
        byte[] hash = hashString(s);
        return Arrays.equals(hash, target);
    }


}
