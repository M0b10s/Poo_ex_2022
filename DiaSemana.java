import java.util.Scanner;
import java.time.*;

public class DiaSemana {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        int dias=0;

        System.out.println("beka");


        dias = (ano - 1900) * 365;
        dias += (ano-1900)/4;

        LocalDate date = LocalDate.of(ano,mes,dia);
        boolean bi = date.isLeapYear();
        System.out.println(dias);

        if(bi && mes == 1 || bi && mes == 2){
            dias -= 1;
        }

        //a)

        dias += date.getDayOfYear();

        //b)

        dias %= 7;

        // c)

        System.out.println("O dia é: " + dias);

        switch(dias){
            case 0: System.out.println("O dia é Dom!");break;
            case 1: System.out.println("O dia é Seg!");break;
            case 2: System.out.println("O dia é Ter!");break;
            case 3: System.out.println("O dia é Qua!");break;
            case 4: System.out.println("O dia é Qui!");break;
            case 5: System.out.println("O dia é Sex!");break;
            case 6: System.out.println("O dia é Sab!");break;
            default: System.out.println("O dia não é!");break;

        }

    }

}
