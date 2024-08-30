package day1.problem8;

public class Find_HexaCode_Embedded_In_String {
	public static void main(String[] args) {

		String os="RAMABC";

		String hexacode="414243";

		boolean b = find_HexaCode_In_String(os,hexacode);
		System.out.println(b);

		convert_AScii_To_Hexa(os);



	}

	private static void convert_AScii_To_Hexa(String os)
	{
		StringBuffer sb=new StringBuffer();
		char[] ch = os.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			sb.append(Integer.toHexString(ch[i]));
		}
		System.out.println(sb);
	}

	private static boolean find_HexaCode_In_String(String os, String hexacode)
	{

		StringBuffer sb=new StringBuffer();
		for(int i=0;i<hexacode.length();i+=2)
		{
			String substring = hexacode.substring(i,i+2);
			sb.append((char)Integer.parseInt(substring,16));
		}

		if(os.contains(sb))
			return true;
		else
			return false;
	}
}
