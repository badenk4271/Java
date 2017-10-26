/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1alejandro;
import java.util.Scanner;//Esta libreria toma datos que digita el usuario por consola paso 1

/**
 *
 * @author LAB01
 */
public class EntradaDatos
{
  public static void main (String[] args)
  {
    //Aqui estamos creando el objeto escaner paso 2 este paso se crea una vez (public)
   Scanner sc=new Scanner(System.in); //aca se crea el lector
   //pedimos los datos al usuario - paso 3
   System.out.println("Por favor ingrese su nombre");
   
   String nombre= sc.nextLine();//Aqui se lee el nombre y se almacena paso 4
   
   System.out.println("Bienvenido" +nombre+ "Por favor digite la edad");//procesando los datos en este caso, lo imprimimos paso 5
   int edad=sc.nextInt();
   System.out.println("Usted tiene" +edad+ "años");
   
  } 
}
