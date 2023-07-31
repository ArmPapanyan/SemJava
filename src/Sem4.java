import java.util.*;

public class Sem4 {
    public static void main(String[] args) {
        Mysteak mysteak = new Mysteak();
        mysteak.push(1);
        mysteak.push(2);
        mysteak.push(3);
        mysteak.push(4);
        mysteak.push(5);
        System.out.println(mysteak.size());
        System.out.println(mysteak.pop());
        System.out.println(mysteak.peak());
        mysteak.pop();
        mysteak.pop();
        mysteak.pop();
        System.out.println(mysteak.empty());
        mysteak.pop();
        System.out.println(mysteak.empty());
    }

    static void task0() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }

    static void task1() {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Input comondu: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text) {
                case "print":
                    System.out.println(linkedList.remove(num));
                    break;
                case "exit":
                    System.out.println("bye! ");
                    work = false;
                    break;
                default:
                    linkedList.add(num, text);
            }
        }
    }


//    static void task2() {
//        LinkedList<String> linkedList = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//        boolean work = true;
//        while (work) {
//            System.out.println("Input comondu: ");
//            String line = scanner.nextLine();
//
//            switch (line) {
//                case "print":
//                    ListIterator listIterator = linkedList.listIterator();
//                    while (listIterator.hasPrevious()) {
//                        System.out.println(listIterator.previous());
//                        break;
//                        /*case "exit":
//                            System.out.println("bye! ");
//                            work = false;
//                            break;
//                        case "revert":
//                            linkedList.removeLast();
//                            break;
//                            default:
//                            linkedList.add(line);
//                    }
//            }
//            }

        static void task2(){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
        }
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        while (!queue.isEmpty()){
System.out.println(queue.poll());
        }
    }
}
