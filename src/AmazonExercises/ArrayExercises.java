package AmazonExercises;

/**
 * Created by ericl on 11/14/2016.
 */
public class ArrayExercises {
    public static void findRandomNumber(){
        int flag = 0;
        int random = (int)(Math.random()*100 + 1);
        //System.out.println(random);
        int[] intArray = new int[99];
        int i;
        for (i = 1; i < intArray.length; i++) {
            if (i == random && flag == 0) {
                flag = 1;
            }
            if (flag == 1){
                intArray[i-1] = i+1;
            }
            else{
                intArray[i-1] = i;
            }
        }
        intArray[i-1]=i+1;


        //for (int j = 0; j < intArray.length; j++){
        //    System.out.print(intArray[j] + " ");
        //}
    }

    public static int[] generateRandomArray(){
        int[] temp = new int[100];
        for (int i = 0; i < temp.length; i++){
            temp[i] = (int)(Math.random())*temp.length + 1;
        }
        return temp;
    }

    public static int[] generateSortedArray(){
        int[] temp = new int[100];
        for (int i = 0; i < temp.length; i++){
            temp[i] = i;
        }
        return temp;
    }
}
