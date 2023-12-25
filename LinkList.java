import java.util.*;

public class LinkList {
//    Node head;
//    //size function
//    private int size;
//    //constructor
//    LinkList(){
//        this.size=0;
//    }
//    //create node
//    class Node {
//        String data;
//        Node next;
//
//
//        //create construction
//        Node(String data){
//            this.data = data;
//            this.next = null;
//            size++;
//        }
//    }
//
//    // perform operation
//
//    //1.add - first, last
//    //add first operation ka mtlb he hame koi linkedlist di he usme hame node add krna he
//    // first position pr
//    //create function
//    public void addFirst(String data){
//        Node newNode = new Node(data);
//      //  Node head;
//        if(head == null){
//            head =newNode;
//            return;
//        }
//        newNode.next=head;
//        head =newNode;
//
//    }
//    //addLast function
//    public void addLast(String data){
//        Node newNode = null;
//        if(head == null){
//            head =newNode;
//            return;
//    }
//        Node currNode = head;
//        while (currNode.next !=null){
//            currNode= currNode.next;
//        }
//        currNode.next =newNode;
//    }
//    //print
//    public void printList(){
//        if (head == null){
//            System.out.println("list is empty");
//            return;
//        }
//
//        Node currNode = head;
//        while (currNode !=null){
//            System.out.print(currNode.data + " -> ");
//            currNode= currNode.next;
//
//    }
//
//        System.out.println("Null");
//    }
//// delete function
//    public void deleteFirst(){
//        if(head== null){
//            System.out.println("The list is empty");
//            return;
//        }
//        size--;
//        head =head.next;
//    }
//    //delete last
//    public void deleteLast() {
//        if (head == null) {
//            System.out.println("The list is empty");
//            return;
//
//        }
//        size--;
//        if (head.next == null){
//            head=null;
//            return;
//        }
//        Node secondLast = head;
//        Node lastNode = head.next;
//        while (lastNode.next != null){
//            lastNode=lastNode.next;
//            secondLast=secondLast.next;
//        }
//        secondLast.next =null;
//    }
//    //size function
//
//
//    public int getSize() {
//        return size;
//    }
//
//    public static void main(String args[]){
//        LinkList list= new LinkList();
//        list.addFirst("a");
//        list.addFirst("is");
//        list.printList();
//
//        list.addLast("list");
//        list.printList();
//
//        list.addFirst("this");
//        list.printList();
//
//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();
//
//        list.getSize();
//        list.printList();
//        System.out.println(list.getSize());
//        list.addFirst("this");
//        System.out.println(list.getSize());
//
//
//    }
//}
//...................YE HUMNE SCKRETCH SE KIYA HE LINKED LIST KA CODE
//..............................................................
//AB HUM COLLECTION FRAMWORK SE KUCH OPRATION USE KRKE FAST AND ESAY WAY ME KRTE HE

    public static void main(String args[]){
        //linkedlist syntax
        LinkedList<String> list =new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        //size
        System.out.println(list.size());

        //print
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ->");
        }
        System.out.println("null");
    }
}