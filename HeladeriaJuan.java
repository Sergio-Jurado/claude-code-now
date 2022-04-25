import java.util.Scanner;

public class HeladeriaJuan {
    public static void main(String[] args) {
        double precio=0.0;
        String[] tarrina=new String[3];
        String[] cono=new String[3];
        int contador=0;
        boolean conoBucle=true;
        boolean tarrinaBucle=true;

        System.out.println("Bienvenido a la heladería. ¿Quieres un cono o una tarrina?: ");
        String respuesta=new Scanner(System.in).nextLine();
        String respuestaFormateada = respuesta.toLowerCase();
        switch(respuestaFormateada){
            case "cono": 
                precio+=1;
                int ordenSabores=0;
                do{
                    System.out.println("Introduce un sabor: (Fresa - Nata - Chocolate - Naranja - Limón)");
                    String saborCono=new Scanner(System.in).nextLine();
                    String saborConoFormat=saborCono.toLowerCase();
                    switch(saborConoFormat){
                        case "fresa":
                            cono[ordenSabores]="fresa";
                            ordenSabores++;
                            if(precio==1){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "nata":
                            cono[ordenSabores]="nata";
                            ordenSabores++;
                            if(precio==1){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "chocolate":
                            cono[ordenSabores]="chocolate";
                            ordenSabores++;
                            if(precio==1){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "naranja":
                            cono[ordenSabores]="naranja";
                            ordenSabores++;
                            if(precio==1){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "limon":
                            cono[ordenSabores]="limon";
                            ordenSabores++;
                            if(precio==1){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "limón":
                            cono[ordenSabores]="limón";
                            ordenSabores++;
                            if(precio==1){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        default:
                            System.out.println("Sabor no disponible.");
                            break;
                    }
                    System.out.println("¿Quiéres añadir otro sabor? (1=Sí || 0=No)");
                    int repetirCono=new Scanner(System.in).nextInt();
                    if(repetirCono==1 && contador==3){
                        System.out.println("Has alcanzado el límite de sabores.");
                        conoBucle=false;
                    }
                    if(repetirCono==0){
                        conoBucle=false;
                    }
                }while(conoBucle);
                System.out.println("Cono de sabores: "+cono.toString()+" Precio: "+precio+"€");
                break;
            case "tarrina":
                precio+=0.50;
                int tarrinaSabores=0;
                do{
                    System.out.println("Introduce un sabor: (Fresa - Nata - Chocolate - Naranja - Limón)");
                    String saborTarrina=new Scanner(System.in).nextLine();
                    String saborTarrinaFormat=saborTarrina.toLowerCase();
                    switch(saborTarrinaFormat){
                        case "fresa":
                            cono[tarrinaSabores]="fresa";
                            tarrinaSabores++;
                            if(precio==0.50){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "nata":
                            tarrina[tarrinaSabores]="nata";
                            tarrinaSabores++;
                            if(precio==0.50){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "chocolate":
                            tarrina[tarrinaSabores]="chocolate";
                            tarrinaSabores++;
                            if(precio==0.50){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "naranja":
                            tarrina[tarrinaSabores]="naranja";
                            tarrinaSabores++;
                            if(precio==0.50){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "limon":
                            tarrina[tarrinaSabores]="limon";
                            tarrinaSabores++;
                            if(precio==0.50){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        case "limón":
                            tarrina[tarrinaSabores]="limón";
                            tarrinaSabores++;
                            if(precio==0.50){
                                precio+=1;;
                            }else{
                                precio+=0.50;
                            }
                            contador++;
                            break;
                        default:
                            System.out.println("Sabor no disponible.");
                            break;
                    }
                    System.out.println("¿Quiéres añadir otro sabor? (1=Sí || 0=No)");
                    int repetirTarrina=new Scanner(System.in).nextInt();
                    if(repetirTarrina==1 && contador==3){
                        System.out.println("Has alcanzado el límite de sabores.");
                        tarrinaBucle=false;
                    }
                    if(repetirTarrina==0){
                        tarrinaBucle=false;
                    }
                }while(tarrinaBucle);
                System.out.println("Tarrina de sabores: "+tarrina.toString()+" Precio: "+precio+"€");
                break;
            default:
                System.out.println("Solo tenemos conos y tarrinas.");
                break;
        }
    }
}