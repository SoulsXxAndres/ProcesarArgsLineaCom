//Segundo ejercicio - Andrés López Corrales
public class SegundoEjerSumaPrefij {
    public static void main(String[] args) {

        //Numero que queremos alcanzar
        int x = Integer.parseInt(args[0]);
        System.out.println("Número a llegar: " + x );

        //Argumentos del arreglo a
        int [] a = new int[args.length-1];

        for (int i = 1; i <args.length ; i++) {
            a[i-1]=Integer.parseInt(args[i]);
            System.out.print(a[i-1]+ " ");
        }

        //Ver si 2 elementos llegan al numero que queremos alcanzar
        boolean bien = false;

        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                bien = a[i] + a[j] == x; //if-else simplificado
            }
        }

        //Ver sí "si" o "no" dentro del arreglo  de argumentos se llega al numero por alcanzar
        System.out.print("\nResultado: ");
        if (bien){
            System.out.print("Sí");
        } else {
            System.out.print("No");
        }
    }//end main
}
