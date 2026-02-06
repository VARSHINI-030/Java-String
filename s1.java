
public class s1 {

    public static void main(String[] args) {
        String greet = "Hello World";
        int length = greet.length();
        for (int i = 0; i < length; i++) {
            System.out.println(greet.charAt(i));
        }
        String s2 = "Hello ";
        s2 = s2 + "World";
        System.out.println(s2);

        String s3 = "Arun";
        String s4 = s3.substring(1, 3);
        System.out.println(s4);
    }

}
