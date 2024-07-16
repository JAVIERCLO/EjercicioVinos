/**
 * Universidad Del Valle de Guatemala
 * Programación orientada a Objetos
 * Ejercicio semana 1 Vinos
 * Javier Alejandro Chávez León
 * 23132
 */

/**
 * Clase Principal La Giraldilla
 */
public Class LaGiraldilla {
    /**
     * Método principal que ejecuta el programa.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        //Creacion de un vino
        Vino vino1 = new Vino("Chateau Margaux",2015,"tinto",3,10,7,600,40,3,6,12,5,6);

        //Llamar al metodo que muestra informacion del vino
        vino1.showInfo();

        //Creación de un suministrador
        Suministrador proveedor = new Suministrador("nombre","pais",14);
        
        //Llamar al metodo que muestra informacion del proveedor
        proveedor.showInfo();

        //Mostrar si se debe hacer un pedido o no
        vino1.pedir();
    }
}