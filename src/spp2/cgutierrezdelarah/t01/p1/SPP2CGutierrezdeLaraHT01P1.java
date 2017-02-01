/*//Cecilia Gutierrez de Lara Hernandez-A01410404-IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.t01.p1;
import java.util.Scanner;
import java.math.*;

/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir variables
        int mat;
        double cal1,cal2,cal3,cal4,cal5,pro;
        String res1="APROBADO",res2="REPROBADO";
        Scanner kb=new Scanner(System.in);
        
        //Pedir datos
        System.out.println("Ingresa tu matricula");
        mat=kb.nextInt();
        System.out.println("Ingresa la calificacion de tu primera materia ");
        cal1=kb.nextDouble();
        System.out.println("Ingresa la calificacion de tu segunda materia");
        cal2=kb.nextDouble();
        System.out.println("Ingresa la calificacion de tu tercer materia");
        cal3=kb.nextDouble();
        System.out.println("Ingresa la calificacion de tu cuarta materia");
        cal4=kb.nextDouble();
        System.out.println("Ingresa la calificacion de tu quinta materia");
        cal5=kb.nextDouble();
        
        //Ecuacion para sacar promedio
        pro=((cal1+cal2+cal3+cal4+cal5)/5);
        
        //Ejecutar programa y mostrar resultados
        System.out.println("Alumno con matricula"+ mat);
        System.out.println("Obtuvo un promedio de"+ pro);
        if (pro>=7.0) 
        System.out.println("Usted esta" +res1);
        else System.out.println("Esta" + res2);
                
    }
    
}
