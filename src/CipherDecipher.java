
public class CipherDecipher {

    /*String Upper to Lower & Visaversa
    Reverse the String
    Replace Spaces of string with Star Character
    Replace Character in Even positions with Ascii values
    Append the integer 3 at the last of the String
    */
    public static String cipher(String normal){
        try {
            Integer.parseInt(normal);
            return null;
        }catch (NumberFormatException e){
        }

        StringBuilder sb = new StringBuilder();
        for(char c : normal.toCharArray())
           { char ic = c;
           if (c != ' '){ ic = upperLower(c);}
           else ic = '*';
           sb.append(ic);
           }

        ///Second
        sb.reverse();
        String halfCiphered = sb.toString();
        sb = new StringBuilder();
        //Forth Step
        for(int i =0; i<halfCiphered.length(); i++){
            char cc = halfCiphered.charAt(i);
            int in =(int) cc;
            if(i%2==1 ){
                sb.append(in);
            }
            else sb.append(cc);
        }
        sb.append(3);
        return sb.toString();
    }

    private static char upperLower(char c){
       return  Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
    }

    public static String decipher(String ciphered){
        //First
        ciphered = ciphered.substring(0,ciphered.length()-1);

        StringBuilder sb = new StringBuilder();
        //Second convert Ascii values back to char in even positions
        for(int i=0; i<ciphered.length(); i++) {
            char cc = ciphered.charAt(i);
            char convchar = cc;
            if (Character.isDigit(cc)) {
                if (cc == '1') {
                    int in = Integer.parseInt(String.valueOf(cc) + ciphered.charAt(i + 1) + ciphered.charAt(i + 2));
                    i = i + 2;
                    convchar = (char) in;
                } else {
                    int in = Integer.parseInt(String.valueOf(cc) + ciphered.charAt(i + 1));
                    i = i + 1;
                    convchar = (char) in;
                }
                sb.append(convchar);
            } else sb.append(cc);
        }
        sb.reverse();
        String halfDeCiphered = sb.toString();
        sb = new StringBuilder();
        for(char c : halfDeCiphered.toCharArray()) {
            char ic = c;
            if (c != '*'){ ic = upperLower(c);}
            else ic = ' ';
            sb.append(ic);
        }

        return sb.toString();
    }
}
