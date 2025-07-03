import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputNumber {
    public void run(Scanner sc){
        System.out.println("Numero:");
        int num = sc.nextInt();
        ReadNumber readNumber = new ReadNumber();
        readNumber.Transform(readNumber.Dictionary(), num);
    }
}

class ReadNumber{
    public Map<Integer, String> Dictionary(){
        Map<Integer, String> data = new HashMap<>();
        String[] unidades = {
                "cero", "uno", "dos", "tres", "cuatro",
                "cinco", "seis", "siete", "ocho", "nueve"
        };
        String[] ecepciones = {
                "once", "doce", "trece", "catorce", "quince"
        };
        String[] decenas = {
                "diez", "veinte", "treinta", "cuarenta", "cincuenta",
                "sesenta", "setenta", "ochenta", "noventa"
        };
        String[] centenas = {
                "cien", "ciento", "cientos", "quinientos"
        };

        return data;
    }

    public void Transform(Map<Integer, String> data,int num){

        System.out.println(data.get(num));
    }
}
