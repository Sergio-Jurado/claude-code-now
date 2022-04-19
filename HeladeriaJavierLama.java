/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package heladeriajavierlama;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class HeladeriaJavierLama {

    
    public static void main(String[] args) {
        System.out.println("Bienvenido a la heladeria.");
        String[] tipo = {"cono", "tarrina"};
        Set<String> sabores = new HashSet<>();
        sabores.add("fresa");
        sabores.add("chocolate");
        sabores.add("nata");
        sabores.add("naranja");
        sabores.add("limon");
        String saboresHelado = "";
        int maxSabores = 0;
        double precio=0;
        
        System.out.println("¿De que forma quiere su helado? (cono/tarrina)");
        String tipoHelado = new Scanner(System.in).nextLine();
        tipoHelado = tipoHelado.toLowerCase();
        if(tipoHelado.equals(tipo[0])){
            precio += 1;
            while(maxSabores<3){
                System.out.println("¿Que sabor quiere para su helado? (Fresa - Nata - Chocolate - Naranja - Limon)");
                String helado = new Scanner(System.in).nextLine();
                helado = helado.toLowerCase();
                if(sabores.contains(helado)){
                    saboresHelado += helado + ", ";
                    maxSabores +=1;
                    if(precio==1){
                        precio += 1;
                    }else{
                        precio += 0.50;
                    }
                    if(maxSabores<3){
                        System.out.println("¿Quiere otro sabor? (si/no)");
                        String decision = new Scanner(System.in).nextLine();
                        decision = decision.toLowerCase();
                        if (decision.equals("no")){
                            maxSabores=3;
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
            while(maxSabores<3){
                System.out.println("¿Que sabor quiere para su helado? (Fresa - Nata - Chocolate - Naranja - Limon)");
                String helado = new Scanner(System.in).nextLine();
                helado = helado.toLowerCase();
                if(sabores.contains(helado)){
                    saboresHelado += helado + " | ";
                    maxSabores +=1;
                    if (precio == 0.50){
                        precio += 1;
                    }else{
                        precio += 0.50;
                    }
                    if(maxSabores<3){
                        System.out.println("¿Quiere otro sabor? (si/no)");
                        String decision = new Scanner(System.in).nextLine();
                        decision = decision.toLowerCase();
                    if (decision.equals("no")){
                        maxSabores=3;
                    }else if(!decision.equals("si") && !decision.equals("no")){
                        System.out.println("Error en la entrada");
                    }
                    }
                }else{
                    System.out.println("Lo siento no tenemos ese sabor disponible.");
                }
            }
        }else{
            System.out.println("Forma equivocada");
        }
        System.out.println("***********************************");
        System.out.println("Aqui tiene su helado");
        System.out.println(tipoHelado + ": " + saboresHelado);
        System.out.println("Precio total: " + precio);
    }

}
