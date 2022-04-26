import java.util.Scanner;

public class HeladoSergio {
    public static void main(String[] args) {
        String[] tipo = {"cono", "tarrina"};
        String[] sabor={"fresa","nata","chocolate","naranja","limon","pistacho"};
        String saboresHelado = "| ";
        int cont = 0;
        double precio=0;
        System.out.println("Bienvenid@. ¿De que forma quiere su helado? (cono/tarrina): ");
        String tipoHelado = new Scanner(System.in).nextLine();
        tipoHelado = tipoHelado.toLowerCase();
        if(tipoHelado.equals(tipo[0])){
            precio += 1.10;
            while(cont<3){
                System.out.println("¿Que sabor quiere para su cono? (Fresa - Nata - Chocolate - Naranja - Limon - Pistacho): ");
                String helado = new Scanner(System.in).nextLine();
                helado = helado.toLowerCase();
                if(helado.equals(sabor[0]) || helado.equals(sabor[1]) || helado.equals(sabor[2]) || helado.equals(sabor[3]) || helado.equals(sabor[4]) || helado.equals(sabor[5])){
                    saboresHelado += helado + " | ";
                    cont +=1;
                    if(precio==1.10){
                        precio += 1.10;
                    }else{
                        precio += 0.55;
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
            precio += 0.55;
            while(cont<3){
                System.out.println("¿Que sabor quiere para su tarrina? (Fresa - Nata - Chocolate - Naranja - Limon - Pistacho): ");
                String helado = new Scanner(System.in).nextLine();
                helado = helado.toLowerCase();
                if(helado.equals(sabor[0]) || helado.equals(sabor[1]) || helado.equals(sabor[2]) || helado.equals(sabor[3]) || helado.equals(sabor[4]) || helado.equals(sabor[5])){
                    saboresHelado += helado + " | ";
                    cont +=1;
                    if (precio == 0.55){
                        precio += 1.10;
                    }else{
                        precio += 0.55;
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
            System.out.println("¿Con cuanto desea pagar?: ");
            double ingreso = new Scanner(System.in).nextDouble();
            double vuelta = ingreso - precio;
            do{
                System.out.println("¿Con cuanto desea pagar?: ");
                double ingresoo = new Scanner(System.in).nextDouble();
                vuelta = ingresoo - precio;
                ingreso = ingresoo;
            }
            while(ingreso < precio);
            if(vuelta > 0){
                System.out.println("Su vuelta es de: " + String.format("%.2f", vuelta) + " euros. Gracias por confiar en nosotros.");
            }else{
                System.out.println("Lo sentimos, ha ingresado menos dinero del debido.");
            }
        }   
    }
}