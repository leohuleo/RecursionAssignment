
/**
 * Write a description of class starTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class starTriangle
{
    public static void main(String[] args){
        reverseTriangle(5);
    }
    
    public static void triangle(int n){
        if(n > 0){
        printStars(n);
        triangle(n-1);
        }
    }
    
    public static void reverseTriangle(int n){
        if(n==1){
            printStars(1);
        }else{
        reverseTriangle(n-1);
        printStars(n);
        }
    }
    
    public static void printStars(int n){
        for (int i = 0; i < n; i++){
        System.out.print("*");
        }
        System.out.println(""); 
    }
}
