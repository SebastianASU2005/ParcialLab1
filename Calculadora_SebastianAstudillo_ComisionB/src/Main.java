import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaracion de variables y ingreso de numeros por teclado
        Scanner leer=new Scanner(System.in);
        boolean bucle=true;
        System.out.println("Ingrese el primer numero");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2=leer.nextInt();
        //Bucle while para repetir infinitamente la calculadora hasta qee ingrese la opcion 5
        while (bucle) {
            //Logica para la selccion de las opciones
            System.out.println("Ingrese la opcion que desea");
            System.out.println("1.suma,2.resta,3.multiplicacion,4.division,5.salir");
            int elecion=leer.nextInt();
            //switch que realiza una operacion dependiendo de la opcion elejida
            switch (elecion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de los numeros es igual a: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de los numeros es igual a: " + resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion de los numeros es igual a: " + multiplicacion);
                    break;
                case 4:
                    //Validacion del segundo numero para no hacer division por 0
                    //de ser el caso ingresar un nuevo numero
                    while (num2==0) {
                        if (num2 == 0) {
                            System.out.println("No se puede dividir por 0");
                            System.out.println("Cambie el valor del segundo numero");
                            num2 = leer.nextInt();
                        }
                    }
                    double division=num1/num2;
                    System.out.println("La division de los numeros es igual a: "+division);
                    break;
                case 5:
                    bucle=false;
                    System.out.println("Muchas gracias por usar el programa");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
