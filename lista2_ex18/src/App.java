import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite sua data: ");
        String data = ler.nextLine();

        ler.close();

        if(validarData(data)){
            System.out.println("A data e valida!");
        }
        else{
            System.out.println("A data e invalida!");
        }
    }

    public static boolean validarData(String data){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(data);

            return true;
        } catch (ParseException ex){
            return false;
        }
    }
}
