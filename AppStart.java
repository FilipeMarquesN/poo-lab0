
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AppStart
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Escolha ");
        System.out.println ("S - Pequeno");
        System.out.println ("M - Médio");
        System.out.println ("L - Grande");
        String tamanho = scan.next();
        int numeroDeCopos = 0;
        if(tamanho == "s"){
            tamanho = "S";}else if(tamanho == "m"){
                tamanho = "M";}else if(tamanho == "l"){
                    tamanho ="L";}
                
            
        switch (tamanho) {
            case "S":
                numeroDeCopos+=1;
                System.out.println("Name         : " + Size.SMALL);
                System.out.println("toString()   : " + Size.SMALL.toString());
                System.out.println("Ordem        : " + numeroDeCopos);
                System.out.println("Valor minimo : " + Size.SMALL.getMinValue());
                System.out.println("Valor máximo : " + Size.SMALL.getMinValue());
                System.out.println("Código       : " + Size.SMALL.getCode());
                break;
            case "M":
                numeroDeCopos+=1;
                System.out.println("Name         : " + Size.MEDIUM);
                System.out.println("toString()   : " + Size.MEDIUM.toString());
                System.out.println("Ordem        : " + numeroDeCopos);
                System.out.println("Valor minimo : " + Size.MEDIUM.getMinValue());
                System.out.println("Valor máximo : " + Size.MEDIUM.getMinValue());
                System.out.println("Código       : " + Size.MEDIUM.getCode());
                break;
            case "L":
                numeroDeCopos+=1;
                System.out.println("Name         : " + Size.LARGE);
                System.out.println("toString()   : " + Size.LARGE.toString());
                System.out.println("Ordem        : " + numeroDeCopos);
                System.out.println("Valor minimo : " + Size.LARGE.getMinValue());
                System.out.println("Valor máximo : " + Size.LARGE.getMinValue());
                System.out.println("Código       : " + Size.LARGE.getCode());
                break;
            default:
                System.out.println("Tamanho Invalido");
        }
        
        
    }

}
