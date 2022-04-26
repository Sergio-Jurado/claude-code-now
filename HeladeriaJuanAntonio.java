
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class HeladeriaJuanAntonio {
   public static void main(String[] args) {
        String sabores[]={"fresa","nata","chocolate","naranja","limón" };
        System.out.println("¿Que desea tarrina o cono?");
        String manera=new Scanner(System.in).nextLine();
       String forma = manera.toLowerCase();
        switch(forma){
            case "tarrina":
                int j=0;
                for(int i=0;i<3;i++){
                    System.out.println("¿Que sabor desea? "+sabores[0]+" "+sabores[1]+" "+sabores[2]+" "+sabores[3]+" "+sabores[4]+" ");
                    String sabor=new Scanner(System.in).nextLine();
                    j++;
                    System.out.println("¿Desea algun sabor mas?");
                    
                    String respuesta=new Scanner(System.in).nextLine();
                    String respuestaa=respuesta.toLowerCase();
                    String respuesta1="si";
                    String respuesta2="no";
                    if(respuestaa.equals(respuesta2)){
                        System.out.println("Gracias por su pedido");
                        i=3;
                        if(j==1){
                            System.out.println("El precio es de 2 euros");
                        }
                        if(j==2){
                            System.out.println("El precio es de 2.5 euros");
                        }
                     
                    } else if(i==3){
                        if(i==3){
                        System.out.println("");
                        
                        if(j==3){
                            System.out.println("El precio es de 3 euros");
                        }

                    }}
                    
                }
            case "cono":
                int p=0;
                for(int i=0;i<3;i++){
                    System.out.println("¿Que sabor desea? "+sabores[0]+" "+sabores[1]+" "+sabores[2]+" "+sabores[3]+" "+sabores[4]+" ");
                    String sabor=new Scanner(System.in).nextLine();
                    p++;
                    System.out.println("¿Desea algun sabor mas?");
                    
                    String respuesta=new Scanner(System.in).nextLine();
                    String respuesta1="si";
                    String respuesta2="no";
                    if(respuesta.equals(respuesta2)){
                        System.out.println("Gracias por su pedido");
                        i=3;
                        if(p==1){
                            System.out.println("El precio es de 1.5 euros");                        }
                        if(p==2){
                            System.out.println("El precio es de 2 euros");
                        }
                        if(p==3){
                            System.out.println("El precio es de 2.5 euros");
                        }
                        
                    } else if(i==3){
                        if(i==3){
                        System.out.println("");
                        if(p==2){
                            System.out.println("El precio es de 2 euros");
                        }
                        if(p==3){
                            System.out.println("El precio es de 2.5 euros");
                        }

                    }}
                    
                }
                    
    }
    }   
}
