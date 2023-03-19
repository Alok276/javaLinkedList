//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
import java.util.Scanner;
import java.util.LinkedList;
class LL3{
    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void print() {
        if (head == null)
            System.out.println("list is empty");

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void search(int data) {
        Node newNode = new Node(data);
        Node currNode = head;
       ALok: for (int i = 0; i < 7; i++)
        {

            if (currNode.data == newNode.data) {
                System.out.println("search found");
                System.exit(0);
            }
            currNode = currNode.next;
        }
        System.out.println("not found");
    }


    public static void main(String args[]) {
        LL3 list = new LL3();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            int x = sc.nextInt();
                list.add(x);
            }
            list.print();
            System.out.println("Enter the number to be searched ");
            int a = sc.nextInt();
            list.search(a);
        }
    }