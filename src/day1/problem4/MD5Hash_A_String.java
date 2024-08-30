package day1.problem4;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

public class MD5Hash_A_String {
	public static void main(String[] args) throws NoSuchAlgorithmException {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter alphanumeric string ");
		String s = sc.next();

		String hash = hash(s);
		System.out.println(hash);

	}

	private static String hash(String s) throws NoSuchAlgorithmException {

		MessageDigest md = MessageDigest.getInstance("MD5");

		byte[] digest = md.digest(s.getBytes());
		System.out.println(Arrays.toString(digest));
		BigInteger bigInteger=new BigInteger(1,digest);

		return bigInteger.toString(16);
	}
}
