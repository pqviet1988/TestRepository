package myAnswers;

public class Decoder {

	public static char [] convertToCharArray (int [] message)
	{
		char [] re = new char [message.length];
		for (int i = 0; i<message.length; i++)
		{
			re[i] = (char)message[i];
		}
		
		return re;
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  message = {82, 96, 103, 103, 27, 95, 106, 105, 96, 28};
		final int key = 5;
		
		System.out.println("Decoding: ");
		for (int i = 0; i<message.length; i++)
		{
			message[i] += key;
		}
		
		//java.util.Arrays.toString(message);
		String DecodedString = String.valueOf(convertToCharArray(message));
		System.out.println(DecodedString);
		
		System.out.println("\nEncoding:");
		for (int i = 0; i<message.length; i++)
		{
			message[i] -= key;
		}
		
		String EncodedString = String.valueOf(convertToCharArray(message));
		System.out.println(EncodedString);
	}
	 */
}
