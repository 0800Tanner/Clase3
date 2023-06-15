import java.util.Scanner;
public class forgione {
    public static void main(String[] args){

        Scanner sexo = new Scanner(System.in);
        String oracion;
        int vecesrepetidas = 0;
        int maximo = 0;
        char caracter = 0;
        String blank = " ";
        System.out.println("Ingrese la oracion: ");
        oracion = sexo.nextLine();
        for (int i=0;i<oracion.length();i++ ){
            vecesrepetidas= 0;
            for (int j=0;j<oracion.length();j++ ){
                if (oracion.charAt(i)==oracion.charAt(j) && oracion.charAt(i)!= blank.charAt(0)){
                 vecesrepetidas++;
                }
            }
            if (vecesrepetidas>=maximo){
                maximo=vecesrepetidas;
                caracter = oracion.charAt(i);
            }
        }
        System.out.println("El caracter repetido mas veces es: " + caracter);




    }


}
