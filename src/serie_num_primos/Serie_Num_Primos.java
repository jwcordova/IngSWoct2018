import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Serie_Num_Primos {

    public static void main(String[] args) throws FileNotFoundException{
        PrintStream file = new PrintStream("Resultado.txt");
        Scanner e = new Scanner(System.in);
        System.out.print("Serie de Numeros Primos \n");
        System.out.print("Ingresa el numero de elementos de la serie: ");
        int numIng = e.nextInt();
        int c = 1;
        int p = 2;
        int d = 2;
        int sum = 0;
        while (c <= numIng) {
            if (p % d == 0) {
                if (p == d) {
                    System.out.print(p + ", ");
                    file.print(p + ", ");
                    c++;
                    sum=sum+p;
                }
                d = 2;
                p++;
            } else {
                d++;
            }
        }
        System.out.print("\nLa suma de la Serie de Numeros Primos es:\t" + sum );
        System.out.print("\nAhora los resultados seran generados en un archivo .txt");
        
        file.print("\r\n" + "La suma de la Serie de Numeros Primos es:\t" + sum);
      }
}
