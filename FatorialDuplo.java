import java.util.Scanner;

public class FatorialDuplo {
    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner(System.in);
            System.out.println("informe um número que seja inteiro e positivo: ");
            numero = ler.nextInt();
        int resultado = FatorialDuplo(numero);
            System.out.println("Resultado: " + resultado);
    }

    public static int FatorialDuplo(int numero) {
        
        do {
        numero *= (numero - 2);
        }   
        while(numero < 1);
        
        if (numero % 2 == 0) {
            return numero * 2;         
        } else {
            return numero * 3;
        }
            
    }
        
}