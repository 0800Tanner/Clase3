
import java.util.Scanner;
public class clase4   {

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int total = 0;
        int numUsuario = 0;
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;

        do {
            System.out.print("Para parar el programa escriba 0, si no ingrese otro numero: ");
            numUsuario=teclado.nextInt();
            if (numUsuario == 0)
                break;
            if (numUsuario==3)
                continue;
            total += numUsuario;
            if(numUsuario > numeroMayor)
                numeroMayor = numUsuario;
            if (numUsuario < numeroMenor)
                numeroMenor = numUsuario;
        } while (numUsuario!= 0);
        System.out.println("La suma total es: " + total) ;
        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es: " + numeroMenor);
        teclado.close();




    }
}
