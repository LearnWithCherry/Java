public class variable{
    public static void main(String[] args){
        // String name = "Rajat";
        int age = 30;
        // String Realname = name; // copy name into realname

        // premitive types
        byte num = 20;
        int phone = 85804;
        long phone2 = 78945612306449L; // L to store long vlaues
        float pi = 3.144F; // to mark float 
        char letter = '@';
        boolean adult = true;

        // non premitive types
        // String name = "Rajat Bhardwaj";
        // System.out.println(name.length()); // "length" to find length

        // string 
        // contitation 
        // String name1 = "Rajat";
        // String name2 = "Bhardwaj";
        // String name3 = name1+" "+name2;
        // System.out.println(name3);

        // ChatAt
        // String name = "Rajat";
        // System.out.println(name.charAt(0)); 

        // replace 
        String name = "Rajat";
        String name1 = name.replace('a','A');
        String name2 = name1.replace('j','J');
        String name3 = name2.replace('t','T');
        System.out.println(name3);

    }
}
