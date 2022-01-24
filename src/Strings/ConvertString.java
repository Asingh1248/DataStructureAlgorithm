package Strings;


/*
 * https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1382156
 */

public class ConvertString {

    public static void main(String[] args) {

        String input="they are playing cricket";
        String output = convertString(input);
        System.out.println(output);

    }

    public static String convertString(String str) {

        StringBuilder sb = new StringBuilder(str);
        //System.out.println(Character.isLowerCase(sb.charAt(0)));

        if(Character.isLowerCase(sb.charAt(0))){
            sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        }

        for(int i=1;i<sb.length();i++){
            if(Character.isSpace(sb.charAt(i-1)) && Character.isLowerCase(sb.charAt(i)) ){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
        }

        return sb.toString();
    }

}
