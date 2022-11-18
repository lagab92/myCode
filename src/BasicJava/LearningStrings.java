package BasicJava;

public class LearningStrings {
    public static void main(String[] args) {
         // string is a class and also a data type     when you call a string you can
        // just use the String name instead of the class that was typed in
        String s = "hello";
        System.out.println(s.length()); // length will count the character in the data type value


        System.out.println(s+"my name is java ");    // this is called concatenation or concat

         // anathor way to do concat
        String s2= "what's up"   ;
        System.out.println(s+ s2);
        // or
        System.out.println(s.concat(s2));


        // trim()
        System.out.println(s2.trim());  // trim remove the whitespaces before and after the string

        // tolowercase()
        System.out.println(s.toLowerCase()) ;

         // toluppercase()
        System.out.println(s.toUpperCase());

        // substring= return a part of the string
        System.out.println(s.substring(2));
        System.out.println(s2.substring(7));
        System.out.println(s2.substring(2,4));  // what's up


        // equal()
        String s3 = "home";
        String s4 = "home";
        System.out.println(s3.equals(s4));

        //  casting

        
        








    }





}
