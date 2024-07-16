/**
 * Universidad Del Valle de Guatemala
 * Programación orientada a Objetos
 * Ejercicio semana 1 Vinos
 * Javier Alejandro Chávez León
 * 23132
 */

/**
 * Clase Suministrador
 */
Class Suministrador{
    //Atributos
    private String nombre;
    private String pais;
    private int tEntrega; //dias

    /**
     * Constructor de suministrador
     * @param nombre El nombre del suministrador
     * @param pais El pais del suministrador
     * @param tEntrega El tiempo de entrega en días
     */
    public Suministrador(String nombre, String pais, int tEntrega){
        this.nombre = nombre;
        this.pais = pais;
        this.tEntrega = tEntrega;
    }
    /**
     * set & get para cada atributo
     */
    //nombre-----------------------------------
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //pais-------------------------------------
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.nombre = pais;
    }
    //Tiempo de entrega-------------------------
    public int tEntrega(){
        return tEntrega;
    }
    public void setTEntrega(int tEntrega){
        this.nombre = tEntrega;
    }

    /**
     * Método para mostrar la informacion del Suministrador
     */
    public void showInfo(){
        System.out.println("El nombre del suministrador es: " + nombre);
        System.out.println("El país del suministrador es: " + pais);
        System.out.println("El tiempo de entrega del suministrador es: " + tEntrega);
    }
}