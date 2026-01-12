public class video_22{
    public static void main(String[] args){
        int i = 0;

        while(true){
            i++;
            if (i == 10){
                continue;
            }
            System.out.println("");
            System.out.printf("value of i is %d",i);
            if (i == 20){
                break;
            }
        }
    }
}