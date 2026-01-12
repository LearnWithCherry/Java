public class p02{
    public static void main(String [] args){
        int n = 10;
        int i = 1;
        int sum_even = 0;
        while(i <= n){
            if (i % 2 == 0){
                sum_even += i;
            }
            i++;
        }

        System.out.print(sum_even);
    }
}