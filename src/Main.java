import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        int numberOfElements =0;
        try {
            numberOfElements = Integer.parseInt(is.readLine());
        }
        catch (IOException ex){
            System.out.println("Wrong value of elements");
        }
        linkedList linkedlist = new linkedList();
        for(int i = 0 ; i < numberOfElements;i++){
            linkedlist.InsertNode(i);
            System.out.print(linkedlist.size + "Size ");
        }
        linkedlist.InsertNode(12,0);
        linkedlist.DeleteNode(12);
        linkedlist.DeleteNode(11);
        linkedlist.displayLinkedList();
    }
}