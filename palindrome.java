
/**
 * Write a description of class palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class palindrome
{
    public static void main(String[] args){
        System.out.println(isPalindrome("lololl"));
    }
    
    public static boolean isPalindrome(String word){
        if(word.length()==1 || word.length()==0){
            return true;
        }
        if(word.charAt(0)==word.charAt(word.length() - 1)){
            return isPalindrome(word.substring(1,word.length()-1));
        }
        return false;
    }
}
