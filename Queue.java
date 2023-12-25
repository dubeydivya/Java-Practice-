public class Queue {
    //1. queue ko implement krne ke liye sbse pehle ek static class banani he
    static class Queuee{
        // 2. phir array create krege
        static int arr[];
        static int size;
        static  int rear = -1;
        Queuee(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //performe the function
        //add..enqueue
        public static void add(int data){
            if (rear == size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
           // int[] arr;
            arr[rear]= data;
        }
        //dequeue ...remove
        public static  int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
           // int[] arr;
            int frount = arr[0];
            for (int i = 0; i < rear; i++) {
                arr [i]=arr[i+1];
            }
            rear--;
            return frount;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            // int[] arr;
            return arr[0];



        }
    }
    public static void main(String args[]){
        Queuee queuee=new Queuee(5);
        queuee.add(1);
        queuee.add(2);
        queuee.add(3);
        //1,2,3

        while (!queuee.isEmpty()){
            System.out.println(queuee.peek());
            queuee.remove();
        }

    }
}
