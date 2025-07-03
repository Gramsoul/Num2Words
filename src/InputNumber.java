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
        String[] words = {
                "cero", "uno", "dos", "tres", "cuatro",
                "cinco", "seis", "siete", "ocho", "nueve",
                "diez", "once", "doce", "trece", "catorce",
                "quince",
        };
        for 
        return data;
    }

    public void Transform(Map<Integer, String> data,int num){

        System.out.println(data.get(num));
    }
}
