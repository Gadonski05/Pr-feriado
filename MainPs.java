import java.util.Scanner;

public class MainPs {
    
    public static void main(String[] args) {
        
        Posto bomba = new Posto("Gasolina", 6.0, 150.0);

        bomba.Abastece(100);
        bomba.MostraInf();
        bomba.AbasteceLit(15);
        bomba.MostraInf();
    }
}
