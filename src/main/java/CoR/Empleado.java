/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoR;

/**
 *
 * @author AVGla
 */
public abstract class Empleado {
    public Empleado siguiente;
    
    public abstract void comprobar();
    
    public void setSiguiente(Empleado sig){
    siguiente=sig;
    }
}
