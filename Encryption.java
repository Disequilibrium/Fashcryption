import java.io.PrintWriter;
import java.security.InvalidKeyException;
import org.apache.commons.codec.digest.DigestUtils;

public class Encryption{

    final private static Twofish_Algorithm twoFish = new Twofish_Algorithm();

    public static String encrypt(String input, Object key){

        //input formatting
        if(input.length() % 16 != 0){
            for(int i = 1; i <= input.length() % 16; i++)
                input += " ";
        }

        //variable declaration
        int blockNum = (int)(input.length() / 16);
        String output = "";
        int index = 0;

        //block by block encryption
        for(int i = 1; i <= blockNum; i++){
            output += new String(twoFish.blockEncrypt(input.getBytes(), index, key));
            index += 16;
        }
	/*
        //encryption validation
        String validInput = decrypt(output, key);
        if(input.equals(validInput))
            return output;
        else //exception handling
            return "Encryption failed.";
    	*/
	return output;
    }

    public static String decrypt(String input, Object key){
		
	//input conditions    
//	if(input.length() % 16 != 0){
//		return "Decryption failed.";
//	}
//	else{
		int blockNum = (int)(input.length() / 16);
		String output = "";
		int index = 0;

		//block by block decryption
		
        	for(int i = 1; i <= blockNum; i++){
            		output += new String(twoFish.blockDecrypt(input.getBytes(), index, key));
            		index += 16;
        	}
		
		return output;
//	}
    }

    public static Object makeKey(String input){

        Object outputKey;
        byte[] keyBytes;

        input = DigestUtils.md5Hex(input).toUpperCase();
        keyBytes = input.getBytes();
	try{
        	outputKey = twoFish.makeKey(keyBytes);
	}
	catch(InvalidKeyException e){
		outputKey = null;
		e.printStackTrace();
	}

        return outputKey;
    }

    public static void main(String[] args){
        String a = "111111111111111122";
        System.out.println(encrypt(a, new Object()));
    }
}
