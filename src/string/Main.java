package string;

public class Main {

    public static void main(String[] args) {
        String obj = new String("cdc");  //String object
        String obj1 = "cdc";  //String literal
        String obj2 = obj1;

        System.out.println(obj == obj1);
        System.out.println(obj1 == obj2);
        System.out.println(obj);
    }



}
