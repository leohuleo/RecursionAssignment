public class euclid
{
    public static void main(String[] args){
        System.out.println(euclidAlgo(7,9));
    }
    
    public static int euclidAlgo(int n1, int n2){
        if(n1 == n2){
            return n1;
        }
        if(n1 > n2){
            return euclidAlgo(n1 - n2,n2);
        }
        return euclidAlgo(n2 - n1,n1);
    }
}
