//linked list sample program--Hard code
public class LL {
    Node head;
    private int size;
    LL() // constructor
    {
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next= null;
            size++;
        }
    }
    // add -first-----------------------------------------
    public void addFirst(String data)
    {
        Node newNode= new Node(data);
        if(head== null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }
    //add-last-------------------------------------------
    public void addLast(String data)
    {
        Node newNode= new Node(data);
        if(head== null){
            head = newNode;
            return;

        }
        Node currNode= head;
        while(currNode.next !=null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //printlist--------------------------------------
public void printList()
{
    if(head == null)
    {
        System.out.println("list is empty");
    }
    Node currNode = head;
    while (currNode != null) {
        System.out.print(currNode.data +"->");
        currNode = currNode.next;
    }
    System.out.println("NULL");
}
//delete first-----------------------------------------
    public void deleteFirst() {
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head= head.next;
    }
//delete last------------------------------------------
    public void deleteLast() {
        if(head== null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head= null;
            return;
        }
        Node secondLast = head;
        Node lastNode= head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next= null;
    }
    //size-------------------------------------------
public int getSize()
{
    return size;
}
//main function----------------------------------------
    public static void main(String args[]){
        LL list= new LL();
        list.addFirst("A");
        list.addFirst("is");
list.printList();
list.addLast("list");
list.printList();

list.addFirst("this");
list.printList();

list.deleteFirst();
list.deleteLast();
list.printList();
System.out.println(list.getSize());
list.addFirst("this");
        System.out.println(list.getSize());//
    }
}