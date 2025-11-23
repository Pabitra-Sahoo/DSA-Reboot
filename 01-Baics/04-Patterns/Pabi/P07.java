public class P07 {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=0;j<6-1-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }

            for(int j=0;j<6-1-i;j++){
                System.out.print(" ");
            }


            System.out.println();
        }

    }
}
