import java.security.InvalidKeyException;

public class Test{
    public static void main(String[] args) throws InvalidKeyException{

        Twofish_Algorithm twofish = new Twofish_Algorithm();
        String inputText1 = "";
        String inputText2 = "";

            inputText1 += "Gas the Kikes!!!";

            inputText1 += "Race war now!!!!";

        String outputText1, outputText2;
        byte[] keyByte = "8fbd6e29736ba50103d82cedd5262b43".getBytes();

        Object finalKey1 = twofish.makeKey(keyByte);
        outputText1 = new String(Twofish_Algorithm.blockEncrypt(inputText1.getBytes(), 0, finalKey1));
        outputText2 = new String(Twofish_Algorithm.blockEncrypt(inputText1.getBytes(), 16, finalKey1));
        System.out.println(outputText1);
        System.out.println(outputText2);

        outputText1 = new String(Twofish_Algorithm.blockDecrypt(outputText1.getBytes(), 0, finalKey1));
        outputText2 = new String(Twofish_Algorithm.blockDecrypt(outputText2.getBytes(), 0, finalKey1));
        System.out.println(outputText1);
        System.out.println(outputText2);
        System.out.println(inputText1);
        System.out.println(outputText1 + outputText2);
    }
}
