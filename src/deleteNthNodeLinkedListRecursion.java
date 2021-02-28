import java.util.Scanner;

public class deleteNthNodeLinkedListRecursion {
    public static class Node{
        int data;
        Node next;
    }

    public static Node deleteNode(Node start, int k){
        //additional base case
        if (k < 1)
            return start;
        //additional base case
        if (start == null)
            return null;
        //main base case (start needs to be deleted)
        if (k==1){
            Node res = start.next;
            return  res;
        }
        start.next = deleteNode(start.next, k-1);
        return start;
    }

    //Utility function to insert a node at the beginning
    public static Node push(Node head_ref, int new_data){
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    public static void printList(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Node head = null;
        head=push(head,3);
        head=push(head,2);
        head=push(head,6);
        head=push(head,5);
        head=push(head,11);
        head=push(head,10);
        head=push(head,15);
        head=push(head,12);

        System.out.println("Original Linked List: ");
        printList(head);

        System.out.println("Please input index to delete out of Linked List: ");
        Scanner input = new Scanner(System.in);
        int nodeToDelete = input.nextInt();

        head = deleteNode(head, nodeToDelete);

        System.out.println("Modified Linked List: ");
        printList(head);

    }
}
