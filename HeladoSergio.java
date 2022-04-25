import java.util.Scanner;
public class HeladoSergio {

    
    public static void main(String[] args) {
        System.out.println("Buenos días, desea el helado en cono o en tarrina:");
        String envase = new Scanner(System.in).nextLine();
        String respuesta1 = "Si";
        
        System.out.println("Tenemos los siguientes sabores: Fresa, nata, chocolate, naranja y limón. Elija uno: ");
        String sabor1 = new Scanner(System.in).nextLine();
        System.out.println("¿Desea algún sabor más?");
        String responde = new Scanner(System.in).nextLine();
            if(responde.equalsIgnoreCase(respuesta1)){
                System.out.println("¿Qué otro sabor desea? Fresa, nata, chocolate, naranja y limón. Elija uno: ");
                String sabor2 = new Scanner(System.in).nextLine();
                System.out.println("¿Desea algún otro sabor?");
                String responde2 = new Scanner (System.in).nextLine();
                if(responde2.equalsIgnoreCase(respuesta1)){
                   System.out.println("¿Qué otro sabor desea? Fresa, nata, chocolate, naranja y limón. Elija uno: ");
                    String sabor3 = new Scanner(System.in).nextLine();
                    System.out.println("Aquí tiene su " + envase + "con los siguientes sabores: " + sabor1 + ", " + sabor2 + " y " + sabor3);
                }else{
                    System.out.println("Aquí tiene su " + envase + "con los siguientes sabores: " + sabor1 + " y " + sabor2);
                }
            }else{
                System.out.println("Aquí tiene su " + envase + "con los siguientes sabores: " + sabor1);
        }
    }
}