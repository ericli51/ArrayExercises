package AmazonExercises;

/**
 * Created by ericl on 11/19/2016.
 */
public class RecursionTest {
    public int fibonocci(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else {
            System.out.println((n-1) + " + " + (n-2));
            return (fibonocci (n-1) + fibonocci (n-2));
        }
    }
}
