package string;

/**
 * References
 * 1. https://www.youtube.com/watch?v=1Vvgk_UAC0A
 * 2. https://www.youtube.com/watch?v=bbjitAm5xB0
 * 3. https://muratakkan.medium.com/comparing-string-stringbuffer-and-stringbuilder-in-java-128a08ff2a5f
 * 4.
 */
public class Main {

    public static void main(String[] args) {
        String obj = new String("cdc");  //String object
        String obj1 = "cdc";  //String literal
        String obj2 = obj1;

        System.out.println(obj == obj1);
        System.out.println(obj1 == obj2);
        System.out.println(obj);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" World");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
    }



}
