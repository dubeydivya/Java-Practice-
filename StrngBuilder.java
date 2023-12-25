import java.util.*;

//public class StringDeclars {
//    public static void main(String args[]) {
        //String declare
//        String name="Divya";
//        String  fullname="divya dubey";
//        String detail="my name is divya dubey";
//        System.out.println(name +"" +fullname+""+detail);

        // user ask to input
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println("your namr is : "+name);
        //SOME IMP STRING FUNCTION
        //Concatenation
//        String firstName="Divya";
//        String lastNane="Dubey";
//        String fullName=firstName+" " +lastNane;
//
//
//        System.out.println(fullName);
        // length
//        String firstName="Divya";
//        String lastNane="Dubey";
//        String fullName=firstName+" " +lastNane;
//
//        System.out.println(fullName.length());
//  CharAt
//        String firstName="Divya";
//        String lastNane="Dubey";
//        String fullName=firstName+lastNane;
//
//        System.out.println(fullName.length());
//
//        //CharAt
//        for (int i=0; i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//        }
        //.campareTo
//        String name1="Divya";
//       String name2="Divya1";
        //apply the method compare To
//        if (name1.compareTo(name2)==0){
//            System.out.println("string are equal");
//        }else {
//            System.out.println("string are not equal");
//        }
        //SUBSTRING
//        String s="My name is Divya";
//        String name=s.substring(8, s.length());
//        //name = s.toString();
//
//        System.out.println(name);

        //take an array of string input from the user and find the comulative(combined) length of
        // all those string

//        Scanner sc =new Scanner(System.in);
//        int size=sc.nextInt();
//                // declare the string of arrays
//        String array[] =new String[size];
//        int totLength = 0;
//
//        for (int i=0; i<size; i++){
//            array[i] = sc.next();
//            totLength += array[i].length();
//
//        }
//        System.out.println(totLength);
//
//      }
//
//    }
//
//......................STRING BUILDER..............................
public class StrngBuilder{
    public static void main(String args[]){
        //declare the StringBuilder
      //  StringBuilder sb =new StringBuilder("tonny");

       // System.out.println(sb);
//  function on string builder

        //char at index 0
      //  System.out.println(sb.charAt(0));

        //set char at index0..isme hum index dosara koi or element bhi set kr skte he
//        sb.setCharAt(0, 'p');
//        System.out.println(sb);

        //inset function use krna he EX-tonny->Stonny

//        sb.insert(0, 'S');
//        System.out.println(sb);
//        //output Stonny
//
//        sb.insert(2, 'g');
//        System.out.println(sb);
//        //output Stgonny



        //delete the extra 'n'
//        sb.delete(2, 3);
//      System.out.println(sb);

//        sb.delete(2, 4);
//        System.out.println(sb);

        //.......................2 nd example...........................

//        StringBuilder sb=new StringBuilder("h");
//        sb.append("e");
//        sb.append("l");
//        sb.append("l");
//        sb.append("o");
//        System.out.println(sb);
//        System.out.println(sb.length());

        //QUESTION ...REVERSE STRING

//        StringBuilder sb=new StringBuilder("hello");
//        for (int i=0; i<sb.length()/2; i++){
//            int front= i;
//            int back =sb.length()- 1- i;//5-1-0 >4
//
//            char frontChar = sb.charAt(front);
//            char backChar = sb.charAt(back);
//
//            sb.setCharAt(front, backChar);
//            sb.setCharAt(back , frontChar);
//        }
//        System.out.println(sb);
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
