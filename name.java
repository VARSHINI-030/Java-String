
public class name {

    public static void main(String[] args) {
        String name = "Varshini";
        String str = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            str = str + name.charAt(i);
        }
        System.out.println(str);
    }
}
