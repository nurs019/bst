public class Main {
    public static void main(String[] args) {
        BST<Integer, String> MyBinary = new BST<>();

        MyBinary.put(0, "Nurs");
        MyBinary.put(1, "Yerlan");
        MyBinary.put(2, "Nazarbayev");
        MyBinary.put(3, "Obama");
        MyBinary.put(4, "Putin");

        System.out.println(MyBinary.get(0));
        System.out.println(MyBinary.get(1));

        MyBinary.delete(4);

        System.out.println(MyBinary.get(0) + " " + MyBinary.get(2));

        for (Integer key : MyBinary.iterator()) {
            System.out.println(key + " " + MyBinary.get(key));
        }
    }

}
