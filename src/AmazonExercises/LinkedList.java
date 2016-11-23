package AmazonExercises;

/**
 * Created by ericl on 11/12/2016.
 */
public class LinkedList {

    protected node head;
    protected node tail;
    protected int listSize;

    class node {
        int value;
        node link;
    }

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public void printNode(node curr) {
        System.out.printf ("%s-> {\"%s\", %s}%n", curr, curr.value, curr.link);
    }

    public void printLinkedList(){
        int count = 0;
        for (node curr = this.head; curr != null; curr = curr.link){
            System.out.printf("%s-> {\"%s\", %s}%n", curr, curr.value, curr.link);
        }
    }

    public void append(int value){
        node temp = new node();
        temp.value = value;
        if(this.tail == null){
            this.head = temp;
            this.tail = temp;
        }
        else{
            this.tail.link = temp;
            this.tail = temp;
            this.tail.link = this.head;
        }
        this.listSize++;
    }

    public void prepend(int value){
        node temp = new node();
        temp.value = value;
        if(this.head == null){
            this.head = temp;
            this.tail = temp;
        }
        else{
            temp.link = this.head;
            this.head = temp;
            this.tail.link = this.head;
        }
        this.listSize++;
    }

    public void insertSort(int value){
        node temp = new node();
    }
}
