package com.ethohampton.pi_decoder;

import com.ethohampton.pi_decoder.decoding.Decode_Pi;
import com.ethohampton.pi_decoder.decoding.Decode_Pi;

@SuppressWarnings("unused")
public class Pi_Decoder {

	public static String[] piInString;
	public static int[] piNumbers;

	public static void main(String[] args) {
		
		//piInString = Pi.Pi.split(",");// can use Pi or a set of randomly generated numbers
		piInString = Pi.PiRandom.split(", ");
		piNumbers = new int[piInString.length];
		for (int i = 0; i < piInString.length; i++) {
			piNumbers[i] = Integer.parseInt(piInString[i]);

		}
		/*if(args.length > 0){
		 Decode_Pi.passwordToFind = args[0];
		}
		System.out.println(Decode_Pi.decode());*/

		Decode_Pi.findHash("bbbafd",6);
		
	}
}
