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
     list.addLast("Camry");
     list.addLast("Bmw");
     ;
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println("Size: " + list.size());



    }
}