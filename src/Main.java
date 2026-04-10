public class Main {
    public static void main(String[] args) {
       // MyList<Integer> list = new MyArrayList<>();
       // System.out.println(list.size());
       // list.add(10);
       // list.add(20);
       // list.add(21);
       // System.out.println(list.size());
       // list.clear();
       // System.out.print(list.size());
        MyList<String> list = new MyArrayList<>();
//        list.add("Apple");
//        list.get(0);
//        System.out.println(list.get(0));
//     list.addLast("Camry");
//     list.addLast("Bmw");
//     ;
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//
//        System.out.println("Size: " + list.size());
//       list.add("1");
//       list.add("5");
//       list.add("7");   // { 1, 2, 3, 4}
//        list.add("3");
//        list.add("3");
//
//        list.add("3");
//
//       list.remove(3);
//        System.out.println(list.size());
//        System.out.println("элемент под индексом 1: " + list.get(1));
//        list.add("bmw");
//        list.add("lexus");
//        list.add("lada");
//        System.out.println(list.indexOf("bmw"));
//        System.out.println(list.lastIndexOf("lada"));
//        System.out.println(list.exists("lexus"));
//        list.add("C");
//        list.add("A");
//        list.add("B");
//
//        System.out.println("До: " + list.get(0) + list.get(1) + list.get(2));
//
//        list.sort();
//
//        System.out.println("После: " + list.get(0) + list.get(1) + list.get(2));
        MyList<String> linkedList = new MyLinkedList<>();

        linkedList.add("BMW");
        linkedList.add("Lexus");
        linkedList.add("Lada");
        System.out.println("Размер: " + linkedList.size());
        System.out.println("первый: " + linkedList.get(0));
        linkedList.remove(1);
        System.out.println("кто второй: " + linkedList.get(1));



    }
}