package estruturasrepetiçao;

public class BreakContinue {
    public static void breakcontinue(String[] args) {
        
        for (int numero = 1; numero <= 5; numero++) {
            /* if (numero == 3)
                break; */

            //---------------------------------
        
            if (numero == 3)
                continue;
            
            System.out.println(numero);
        }
    }
}
