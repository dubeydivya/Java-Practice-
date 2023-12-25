import java.util.ArrayList;
public class ArryList {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();

       // ......eshe bhi hum munltiple data type ki list create kr skte he

       // ArrayList<String> list1=new ArrayList<String>();
       // ArrayList<booleans> list2=new ArrayList<booleans>();


        //.....Operation.1..Add element
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//output->0, 1, 2, 3


        //.....Operation.2..Get element
        //Get element me hum index se get krte he
        int element= list.get(0);
        System.out.println(element);//output -> 0 qki zero index me 0 store he



        //.....Operation.3..to add element in between
        list.add(1, 1);
        System.out.println(list);//output....0, 1, 2, 3


        //.....Operation.4..Set element
        list.set(0, 5);
        System.out.println(list);//output..




    }
}
