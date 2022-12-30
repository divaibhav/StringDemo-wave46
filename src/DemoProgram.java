import java.util.Scanner;

public class DemoProgram {
    //accept n no of string from user and return an array of those strings
    // where n - is dependent on size
    public String[] getStringArray(int size){
        String[] list = new String[size];
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" enter " + size + " strings");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextLine();
        }
        return list;
    }
    // find length of all the String in an array
    public int lengthOfString(String str){
      return str.length();
    }
    // will do that there only, make all the strings


    //find all the string starting with J
    // get the arr process it, print the strings starting with J
    // get the string check if it starts with J , return true or false
    public boolean isStartsWithGivenString(String prefix, String actualString){
        return actualString.startsWith(prefix);
    }
    //count all the vowels
    //count vowels of 1 string
    // or count vowels of all string, by getting an array
    public int countVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if(isVowel(character)){
                count++;
            }
        }
        return count;
    }
    public  boolean isVowel(char letter) {
        //compare it with a e i o u
       switch (letter){
           case 'a':
           case 'A':
           case 'e':
           case 'E':
           case 'i':
           case 'I':
           case 'o':
           case 'O':
           case 'u':
           case 'U':
               return true;

       }
       return false;

    }

    public static void main(String[] args) {
        DemoProgram demoProgram = new DemoProgram();
        // get strings from user
        String[] stringArray = demoProgram.getStringArray(5);
        int countVowels = 0;
        // process the array, by using from loop
        for (int i = 0; i < stringArray.length; i++) {
            //System.out.println("length of " + stringArray[i] + " is = " + demoProgram.lengthOfString(stringArray[i]));
            System.out.println("length of " + stringArray[i] + " is = " + stringArray[i].length());
            System.out.println(stringArray[i].toUpperCase());
            if(stringArray[i].startsWith("J")){
                System.out.println("String starting with J => " + stringArray[i]);
            }
            countVowels = countVowels + demoProgram.countVowels(stringArray[i]);


        }
        System.out.println("countVowels = " + countVowels);
        String str = "abc, def, ijk, lmn";
        String[] splitInStringArray = str.split(",");
        for (int i = 0; i < splitInStringArray.length; i++) {
            System.out.println(splitInStringArray[i].trim());
        }

    }

}
