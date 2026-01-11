public class video_14{
    public static void main(String[] args){
        String a = "Rajat"; // string 

        String l = a.toLowerCase(); // converting into lower
        System.out.println(l);

        String g = a.toUpperCase(); // converting ito upper
        System.out.println(g);

        int len = a.length(); // getting the length of the stirng using length method
        System.out.println(len);

        String nonTrimmedString= "       Rajat       "; // will remove the extra space 
        System.out.println(nonTrimmedString.trim());

        System.out.println(a.substring(0)); // print from the given index(0,1,2,3....n)
        System.out.println(a.substring(0,5)); //Starg from the start to end but end index is excluded (end index will not print)

        System.out.println(a.replace("Rajat","Cherry")); // replace a new sptring with give changes original string will remain the same a new string will return (immutable) (replace all the given words not only first)
        
        System.out.println(a.startsWith("r")); // will return weather the given string starts with true or false (output is in boolean form, case sensitive)

        System.out.println(a.endsWith("t")); // will return weather the given string ends with  true or false (output is in boolean form, case sensitive)

        System.out.println(a.charAt(4)); // return the char at given index 
       
        System.out.println(a.indexOf("R")); // return the index of given char (first only)
        System.out.println(a.indexOf("t", 2)); // return the index of given char , number (index) from which it will start finding  (Not found -1)

        System.out.println(a.lastIndexOf("R")); // return the last index of given char 
        System.out.println(a.lastIndexOf("R",2)); // return the last index of given char (start from index base)
    
        System.out.println(a.equals("rajat")); // will return weather the string are same or not (case sensitive)

        System.out.println(a.equalsIgnoreCase("rajat")); // will return t/f if the string are same (ignore case (L\G))
        
        /* 
            Escape Sequence char
                \n - new line 
                \t - tab
                \' - add quote
                \\ - add slash
        */

        System.out.println("My \nname \tis \"Rajat\"");



    }
}
