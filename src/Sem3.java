import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sem3 {
    public static void main(String[] args){

     task3();

    }
    static void task0(){
        String s1 = " hello";
        String s2 = "hello";
        String s4 = "h" + "e"+ "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h','e','l','l','o'});


        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s1.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));
    }
    static void task1(List<Integer> list){
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    static List<Integer> creatList( int size , int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }
    static void task2(){
        List list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        list.add(222);
        list.add("hi");
        list.add(111);
        list.add("privet");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
        Object o = iterator.next();
        if(o instanceof Integer){
            iterator.remove();
        }
        }
        System.out.println(list);
    }
    static void task3(){
      List<List<String>> bookShope = new ArrayList<>();
      addBook("fantastica"," Marsianin" , bookShope);
        addBook("fantastica"," Marsianin" , bookShope);
        addBook("roman"," Master i Morgarita" , bookShope);
        addBook("roman"," Evgeni Onegin" , bookShope);
        addBook("classica"," Pushkin" , bookShope);

        System.out.println(bookShope);
    }
    static void addBook(String ganre,String bookName , List<List<String>> bookShope ){
        for (int i = 0; i <bookShope.size() ; i++) {
           if( bookShope.get(i).get(0).equals(ganre)){
               bookShope.get(i).add(bookName);
               return;
           }
        }
        List<String> list =new ArrayList<>();
        list.add(ganre);
        list.add(bookName);
        bookShope.add(list);
    }
}
