public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to hackerrank");
        System.out.println("Ciphered: " + CipherDecipher.cipher("Welcome to hackerrank"));
       System.out.println("DECiphered: " + CipherDecipher.decipher("K78A82R69K67A72*79T42E77O67L69w3"));

        System.out.println("Ciphered: " + CipherDecipher.cipher("Hi! How are You?"));
        System.out.println("DECiphered: " + CipherDecipher.decipher("?85O121*69R65*87O104*33I1043"));
    }
}