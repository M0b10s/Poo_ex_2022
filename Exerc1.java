import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args){

        System.out.println("beka");
        maior();
        System.out.println(ex2());

    }

    public static void maior(){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //sc.close();

        if(num1 > num2) System.out.println("É " + num1);
        else System.out.println("É " + num2);

        System.out.println("É " + Math.max(num1,num2) + "!");

    }

    public static int ex2(){

        int soma = 0,val=0;
        Scanner ine = new Scanner(System.in);

        for(int i = 0;i<10;i++){
            val = ine.nextInt();
            soma += val;
        }

        //in.close();

        return soma;
    }


}
