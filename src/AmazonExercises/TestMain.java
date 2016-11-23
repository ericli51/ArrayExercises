package AmazonExercises;

/**
 * Created by ericl on 11/3/2016.
 */

public class TestMain {

     public static void testLinkedList(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(1);
        testLinkedList.append(2);
        testLinkedList.append(3);
        testLinkedList.prepend(1);
        testLinkedList.prepend(2);
        testLinkedList.prepend(3);
        testLinkedList.printLinkedList();
    }

    public static void testBinaryTree(){
        BinaryTree testTree = new BinaryTree();
        int i = 0;
        for (i = 0; i < 10; i++){
            testTree.insertTree(i);
        }
    }

    public static void testRecursion(int n){
        RecursionTest recur = new RecursionTest();
        System.out.println("Total: " + recur.fibonocci(n));
    }

    public static void main (String[] args){
        //findRandomNumber();
        //int[] randIntArray = generateRandomArray();
        //int[] sortedIntArray = generateSortedArray();
        testLinkedList();
        //testBinaryTree();
        //testRecursion(7);
    }
}
