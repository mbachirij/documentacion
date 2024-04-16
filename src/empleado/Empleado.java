/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 * Clase que representa a un empleado.
 * 
 * @version 1.0
 * @author Mohammed_Bachiri_Jabbouri
 */

public class Empleado {
    private int id;
    private String nombre;
    private String cargo;

    /**
     * Constructor de la clase Empleado.
     * @param id El ID del empleado.
     * @param nombre El nombre del empleado.
     * @param cargo El cargo del empleado.
     */
    public Empleado(int id, String nombre, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    /**
     * Obtiene el ID del empleado.
     * @return El ID del empleado.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    } 
 
    /**
     * Obtiene el cargo del empleado.
     * @return El cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

}
