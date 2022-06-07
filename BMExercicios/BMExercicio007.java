import java.util.Scanner;

public class BMExercicio007 {
    public static void main(String[] args){
        System.out.println("Informe um número para X");
        Scanner scan = new Scanner(System.in);
        int y = 0;
        int x = scan.nextInt();

        while(y !=1){
            if(x%2 == 0){
                y = x/2;
            }
            else{
                y = (3*x)+1;
            }
            System.out.print(y+" ");
            x = y;
        }
    }
}
