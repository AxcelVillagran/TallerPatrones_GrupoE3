/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoR;

/**
 *
 * @author AVGla
 */
public class NewClass {
    public static void main(String[] args) {
        Asistente h1=new Asistente();
        Tecnico h2=new Tecnico();
        Jefe h3=new Jefe();
        Gerente h4=new Gerente();
        h1.setSiguiente(h2);
        h2.setSiguiente(h3);
        h3.setSiguiente(h4);
        h1.comprobar();
    }
}
