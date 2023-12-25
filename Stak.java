import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class Stak {
//    //.............STACK implement by LINKED LIST
//    static class  Node{
//        int data;
//        Node next;
//        //constructor
//       public Node (int data){
//           this.data=data;
//           next=null;
//       }
//
//    }
//
//    static class Stack{
//        public static Node head;
//        //stack empty function
//        public static boolean isEmpty(){
//            return  head == null;
//        }
//        //implement push function
//        public static void push(int data){
//            Node newNode = new Node(data);
//            if (isEmpty()){
//                head = newNode;
//                return;
//
//
//            }
//            newNode.next = head;
//            head = newNode;
//        }
//        //pop function
//        public static int pop(){
//            if (isEmpty()){
//                return -1;
//            }
//            int top = head.data;
//            head= head.next;
//            return top;
//        }
//        //peek function
//        public static int peek(){
//            if (isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }
//
//    }

    //.............STACK implement by Array LIST
//    static class Stack{
//       static ArrayList<Integer> list= new ArrayList<>();
//        public static boolean isEmpty(){
//            return list.size() ==0;
//        }
//        //push
//        public static void push(int data){
//            list.add(data);
//        }
//        //pop
//
//        public static int pop(){
//            if(isEmpty()){
//                return-1;
//            }
//            int top = list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return top;
//        }
//        //peek
//        public static int peek(){
//            if(isEmpty()){
//                return-1;
//            }
//           return list.get(list.size()-1);
//
//        }
//    }
//    public static void main(String args[]){
//        Stack s =new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//
//    }
    //................implement collection framework
//    public static void main(String args[]){
//        //ye java ke collection frame work me exit krta he hame bs itni si line likhni he
//        Stack<Integer> s= new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//
//    }
    // PUSH AT THE BOTTOM OF STACK
    public static void main(String args[]) {
        //public static void pushAtBottom (Stack < Integer > s ,int data){

//        if (s.isEmpty()){
//                s.push(data);
//                return;
//            }
//            int temp = s.pop();
//            pushAtBottom(s, data);
//            s.push(temp);
//
//        }
//
//        //ye java ke collection frame work me exit krta he hame bs itni si line likhni he
//        Stack<Integer> stack= new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        pushAtBottom(4, stack);
//
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//           // s.pop();
//        }
//
//    }

//    private static void pushAtBottom(int i, Stack<Integer> stack) {
//    }
//
//    //private static void pushAtBottom(int i, Stack<Integer> s) {
//   // }


        }
    }