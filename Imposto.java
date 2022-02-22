import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        float salario;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        salario = ler.nextFloat();
        float resultado = calcularDeducao(salario);
        
        while(salario <= 0) {
            System.out.println("informe um salario valido");
            salario = ler.nextFloat();
            salario++;
        }
        
    }
    public static float calcularDeducao(float salario) {

        if (salario > 0 && salario <= 1903.98){
            System.out.println("Você está isento de tarifas!");        
        }else if (salario > 1903.99 && salario <= 2826.65){
            System.out.println("A tarifa a ser paga é de: " + ((salario * 7.5)/100 - 142.80));
        }else if (salario > 2826.66 && salario <= 3751.05){
            System.out.println("A tarifa a ser paga é de: " + ((salario * 15)/100 - 354.80));
        }else if (salario > 3751.06 && salario <= 4664.68){
            System.out.println("A tarifa a ser paga é de: " + ((salario * 22.5)/100 - 636.13));
        }else{
            System.out.println("A tarifa a ser paga é de: " + ((salario * 27.5)/100 - 869.36));
        }
        return salario;

    }
}