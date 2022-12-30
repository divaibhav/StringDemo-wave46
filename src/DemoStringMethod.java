public class DemoStringMethod {
    public static void main(String[] args) {
        String myName = "VAIBHAV";
        /*char firstChar = myName.charAt(0);*/
        int count = 0;
        myName = myName.toLowerCase();
        for (int i = 0; i < myName.length(); i++) {
            char letter = myName.charAt(i);
           if(isVowel(letter)){
               count++;
           }
        }
        System.out.println("no of vowels in name = " + myName.toUpperCase() + " is = " + count);

        String sample = "Java Programming";
        String sub = sample.substring(1);
        System.out.println("sub = " + sub);
        String sub2 = sample.substring(3,10);
        System.out.println("sub2 = " + sub2);

    }

    public static boolean isVowel(char letter) {
        //compare it with a e i o u
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
          return true;
        }
        return false;

    }
}
//count vowels in my name