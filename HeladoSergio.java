import java.util.Scanner;

public class HeladoSergio {
    public static void main(String[] args) {
        String[] tipo = {"cono", "tarrina"};
        String[] sabor={"fresa","nata","chocolate","naranja","limon"};
        String saboresHelado = "| ";
        int cont = 0;
        double precio=0;
        
        System.out.println("Bienvenid@. ¿De que forma quiere su helado? (cono/tarrina): ");
        String tipoHelado = new Scanner(System.in).nextLine();
        tipoHelado = tipoHelado.toLowerCase();
        if(tipoHelado.equals(tipo[0])){
            precio += 1;
            while(cont<3){
                System.out.println("¿Que sabor quiere para su cono? (Fresa - Nata - Chocolate - Naranja - Limon): ");
                String helado = new Scanner(System.in).nextLine();
                helado = helado.toLowerCase();
                if(helado.equals(sabor[0]) || helado.equals(sabor[1]) || helado.equals(sabor[2]) || helado.equals(sabor[3]) || helado.equals(sabor[4])){
                    saboresHelado += helado + " | ";
                    cont +=1;
                    if(precio==1){
                        precio += 1;
                    }else{
                        precio += 0.50;
                    }
                    if(cont<3){
                        System.out.println("¿Quiere otro sabor? (si/no)");
                        String decision = new Scanner(System.in).nextLine();
                        decision = decision.toLowerCase();
                        if (decision.equals("no")){
                            cont=3;
                        }else if(!decision.equals("si") && !decision.equals("no")){
                            System.out.println("Error en la entrada.");
                        }
                    }
                }else{
                    System.out.println("Lo siento no tenemos ese sabor disponible.");
                }
            }
        }else if(tipoHelado.equals(tipo[1])){
            precio += 0.50;
            while(cont<3){
                System.out.println("¿Que sabor quiere para su tarrina? (Fresa - Nata - Chocolate - Naranja - Limon): ");
                String helado = new Scanner(System.in).nextLine();
                helado = helado.toLowerCase();
                if(helado.equals(sabor[0]) || helado.equals(sabor[1]) || helado.equals(sabor[2]) || helado.equals(sabor[3]) || helado.equals(sabor[4])){
                    saboresHelado += helado + " | ";
                    cont +=1;
                    if (precio == 0.50){
                        precio += 1;
                    }else{
                        precio += 0.50;
                    }
                    if(cont<3){
                        System.out.println("¿Quiere otro sabor? (si/no)");
                        String decision = new Scanner(System.in).nextLine();
                        decision = decision.toLowerCase();
                    if (decision.equals("no")){
                        cont=3;
                    }else if(!decision.equals("si") && !decision.equals("no")){
                        System.out.println("Error en la entrada");
                    }
                    }
                }else{
                    System.out.println("Lo siento no tenemos ese sabor disponible.");
                }
            }
        }else{
            System.out.println("Valor incorrecto.");
        }
        if(tipoHelado.equals(tipo[0]) || tipoHelado.equals(tipo[1])){
            System.out.println("***********************************");
            System.out.println("Aquí tiene su helado");
            System.out.println(tipoHelado + " con sabor(es): " + saboresHelado);
            System.out.println("Precio: " + precio + " euros");
        }   
    }
}