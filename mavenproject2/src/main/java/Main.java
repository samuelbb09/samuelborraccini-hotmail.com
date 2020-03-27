import java.util.Scanner;
import java.util.Random;
 
public class Main {
    
    
    
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
     
           
            String[] nombres = new String[] {"samuel", "carlos", "alfredo"};
        Perros golden = new Perros("loco", 10, 25);
        golden.nombre = nombres[Main.numeror()];
        //golden.nombre = golden.nombreselec();
        System.out.println(golden.nombre);
}
    public static int numeror(){
        int valor =  (int)(Math.random() * (2 - 0 + 1) + 0);
        return valor;
    }
}
