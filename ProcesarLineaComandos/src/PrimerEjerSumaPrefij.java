//Primer ejercicio - Andrés López Corrales
public class PrimerEjerSumaPrefij {
    public static void main(String[] args) {

        int [] numeros = new int[args.length];

        //Argumentos escritos
        System.out.println("Argumentos: ");
        for (int i = 0; i < args.length ; i++) {
            numeros[i] = Integer.parseInt(args[i]);
            System.out.println(numeros[i]);
        }

        //Suma prefija
        System.out.println("Suma Prefija: ");
        int temp = 0;
        for (int i = 0; i < args.length ; i++) {
            temp += numeros[i];
            System.out.println(i+1 + ". " +temp);
        }
    }//end main
}