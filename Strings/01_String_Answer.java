public class Solution{
	public static String convertString(String str) {
            // Write your code here
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