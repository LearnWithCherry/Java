public class problem2{
    public static void main(String[] args){
            char grade = 'B';
            grade = (char)(grade + 8);
            System.out.println("Fake Grade: "+grade);

            grade = (char)(grade - 8);
            System.out.println("Real Grade: "+grade);
    }
}