public class P16{
    public static void main(String[] args) {
        int n=5;
        char ch='A';
       for(int i=0;i<n;i++){
        
            for(char a='A';a<=('A'+i);a++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
       }
    }
}
