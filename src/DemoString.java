public class DemoString {
    public static void main(String[] args) {
        String name = "John";
        String first = "john";
        if(name.equals(first)){
            System.out.println("same");
        }else {
            System.out.println("different");
        }
        String s1 = new String("John");
        String s2 = new String("John");
        if(s1.equals(s2)){
            System.out.println("same");
        }else {
            System.out.println("different");
        }
    }
}
