import java.util.Scanner;

public class BMExercicio006{
    public static void main(String[] args){
        System.out.println("Digite um valor e veja seu respectivo dia da semana");
        int numdigitado = 1;
        while(numdigitado != 0){
            Scanner sc = new Scanner(System.in);
            numdigitado = sc.nextInt();
            switch (numdigitado){
                case 0 :
                    System.out.println("Fim do programa");
                    break;
                case 1:
                     System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                case 3:
                    System.out.println("Terça-Feira");
                    break;
                case 4:
                    System.out.println("Quarta-Feira");
                    break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                case 6:
                    System.out.println("Sexta-Feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("Valor inválido!");
                    break;
                }
            } 
        }
    }
