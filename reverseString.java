
/**
 * Write a description of class reverseString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverseString
{
    public static void main(String[] args){
        System.out.println(reverse("idid"));
    }
    
    public static String reverse(String word){
        if(word.length() == 0){
            return "";
        }
        return word.charAt(word.length() - 1) + word.substring(0,word.length()-1);
    }
}
