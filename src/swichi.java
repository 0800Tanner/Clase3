import java.util.Scanner;

public class swichi {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int mes = 0;
        String numTrim = " ";
        System.out.print("Escribir numero del mes: ");
        mes = teclado.nextInt();
        /**   if (mes == 1 )
            mesText = "ENERO";
        if (mes == 2 )
            mesText = "FEBRERO";
        if (mes == 3 )
            mesText = "MARZO";
        if (mes == 4 )
            mesText = "ABRIL";
        if (mes == 5 )
            mesText = "MAYO";
        if (mes == 6 )
            mesText = "JUNIO";
        if (mes == 7 )
            mesText = "JULIO";
        if (mes == 8 )
            mesText = "AGOSTO";
        if (mes == 9 )
            mesText = "SEPTIEMBRE";
        if (mes == 10 )
            mesText = "OCTUBRE";
        if (mes == 11 )
            mesText = "NOVIEMBRE";
        if (mes == 12 )
            mesText = "DICIEMBRE";
         */
        switch(mes){
            case 1: 
            case 2: 
            case 3: numTrim = "1";
            break;
            case 4:
            case 5:
            case 6: numTrim = "2";
            break;
            case 7:
            case 8:
            case 9: numTrim = "3";
            break;
            case 10:
            case 11:
            case 12: numTrim = "4";
            break;
            default: numTrim = "INVALIDO";
        }
        System.out.println("El trimestre elegido es " + numTrim);
        teclado.close();
    }
}
