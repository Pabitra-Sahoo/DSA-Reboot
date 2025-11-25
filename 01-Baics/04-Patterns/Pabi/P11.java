public class P11 {
    public static void main(String[] args) {
        int prnt ;
        for (int i = 1; i <= 5; i++) {
            if(i%2==0){
                prnt=0;
            }
            else{
                prnt=1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(prnt + " ");
                prnt = 1 - prnt;
            }
            System.out.println();
        }
    }
}
