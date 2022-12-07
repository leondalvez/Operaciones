/*

Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class OperacionServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        Operacion o1 = new Operacion();
        
        System.out.println("Por favor ingrese los dos números con los que desea operar");
        o1.setNumero1(leer.nextDouble());
        o1.setNumero2(leer.nextDouble());
        
        return o1;
        
    }
    
    public void suma(Operacion o1){
        
        Double resultado = o1.getNumero1() + o1.getNumero2();
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public void resta(Operacion o1){
        
        Double resultado = o1.getNumero1() - o1.getNumero2();
        
        System.out.println("El resultado de la resta es: " + resultado);
    }
    
    public void multiplicacion(Operacion o1){
        
        if(o1.getNumero1() != 0 && o1.getNumero2() != 0){    
        Double resultado = o1.getNumero1() * o1.getNumero2();
        System.out.println("El resultado de la multiplicación es: " + resultado);    
        }
        else{
        System.out.println("Todo número multiplicado por 0 da 0");
        }
    }
    
    public void division(Operacion o1){
        
        if(o1.getNumero1() != 0 && o1.getNumero2() != 0){    
        Double resultado = o1.getNumero1() / o1.getNumero2();
        System.out.println("El resultado de la división es: " + resultado);    
        }
        else{
        System.out.println("Dividir por 0 da error");
        }
    }
    
    

}
