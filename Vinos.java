/**
 * Universidad Del Valle de Guatemala
 * Programación orientada a Objetos
 * Ejercicio semana 1 Vinos
 * Javier Alejandro Chávez León
 * 23132
 */

/**
 * Clase Vinos
 */
Class Vinos{
    //atributos
    private String nombre;
    private String cosecha;
    private String tipo;
    private int dispo_min;
    private int dispo_max;
    private int dispo_real;
    private float precio;
    private int ventasActuales;
    private int ventas23;
    private int ventas22;
    private int ventas21;
    private int ventas20;
    private int ventas19;
    private boolean pedido;
    /**
     * Constructor de vinos
     * @param nombre El nombre del vino
     * @param cosecha La cosecha del vino
     * @param tipo El tipo de vino
     * @param dispo_min Disponibilidad minima del vino
     * @param dispo_max Disponibilidad maxima del vino
     * @param dispo_real Disponibilidad real del vino
     * @param precio El precio del vino en dolares
     * @param ventasActuales Las ventas de este año
     * @param ventas23 Las ventas de 2023
     * @param ventas22 Las ventas de 2022
     * @param ventas21 Las ventas de 2021
     * @param ventas20 Las ventas de 2020
     * @param ventas19 Las ventas de 2019
     * @param pedido Verdadero representa pedir y falso representa no pedir
     */

    public Vino(String nombre, String cosecha, String tipo, int dispo_min, int dispo_max, int dispo_real, float precio, int ventasActuales, int ventas23, int ventas22, int ventas21, int ventas20, int ventas 19){
        this.nombre = nombre;
        this.cosecha = cosecha; 
        this.tipo = tipo;
        this.dispo_min = dispo_min;
        this.dispo_max = dispo_max;
        this.dispo_real = dispo_real;
        this.precio = precio;
        this.ventasActuales = ventasActuales;
        this.ventas23 = ventas23;
        this.ventas22 = ventas22;
        this.ventas21 = ventas21;
        this.ventas20 = ventas20;
        this.ventas19 = ventas19;
    }
    /**
     * set & get para cada atributo
     */
    //nombre----------------------------------------
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //cosecha----------------------------------------
        public String getCosecha(){
        return cosecha;
    }
    public void setCosecha(String cosecha){
        this.nombre = cosecha;
    }
    //tipo------------------------------------------
        public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.nombre = tipo;
    }
    //Disponibilidad minima---------------------------
        public int dispo_min(){
        return dispo_min;
    }
    public void setDispo_min(int dispo_min){
        this.nombre = dispo_min;
    }
    //Disponibilidad maxima-------------------------------
            public int dispo_max(){
        return dispo_max;
    }
    public void setDispo_max(int dispo_max){
        this.nombre = dispo_max;
    }
    //Disponibilidad real-----------------------------------
            public int dispo_real(){
        return dispo_real;
    }
    public void setDispo_real(int dispo_real){
        this.nombre = dispo_real;
    }
    //precio-----------------------------------------------------
            public float precio(){
        return precio;
    }
    public void setDispo_min(int precio){
        this.nombre = precio;
    }
    //Ventas actuales------------------------------------------
            public int ventasActuales(){
        return ventasActuales;
    }
    public void setVentasActuales(int ventasActuales){
        this.nombre = ventasActuales;
    }
    //Ventas 2023---------------------------------------------
                public int ventas23(){
        return ventas23;
    }
    public void setVentas23(int ventas23){
        this.nombre = ventas23;
    }
    //Ventas 2022--------------------------------------------------
                public int ventas22(){
        return ventas22;
    }
    public void setVentas22(int ventas22){
        this.nombre = ventas22;
    }
    //Ventas 2021------------------------------------------------------
            public int ventas21(){
        return ventas21;
    }
    public void setVentas21(int ventas21){
        this.nombre = ventas21;
    }
    //ventas2020----------------------------------------------------------
                public int ventas20(){
        return ventas20;
    }
    public void setVentas20(int ventas20){
        this.nombre = ventas20;
    }
    //Ventas 2019------------------------------------------------------------
                public int ventas19(){
        return ventas19;
    }
    public void setVentas19(int ventas19){
        this.nombre = ventas19;
    }
    //Pedido------------------------------------------------------------
                public boolean pedido(){
        return pedido;
    }
    public void setVentas19(int pedido){
        this.nombre = pedido;
    }
	/**
     * Método para mostrar la informacion del vino
     */  
    public void showInfo(){
        System.out.println("El nombre del vino es: "+nombre);
        System.out.println("La cosecha del vino es: "+cosecha);
        System.out.println("El tipo del vino es: "+tipo);
        System.out.println("Las ventas del vino este año son: "+ventasActuales);
        System.out.println("Las ventas del vino en el año 2023 fueron: "+ventas23);
        System.out.println("Las ventas del vino en el año 2022 fueron: "+ventas22);
        System.out.println("Las ventas del vino en el año 2021 fueron: "+ventas21);
        System.out.println("Las ventas del vino en el año 2020 fueron: "+ventas20);
        System.out.println("Las ventas del vino en el año 2019 fueron: "+ventas19);
    }
    /**
     * Método para calcular las ventas totales en los últimos 3 años
     */ 
    public int promVentas(){
        int promVentas = (ventas23 + ventas22 + ventas21)/3;
        return ventastotal;
    }
    public void pedir(){
    public boolean pedido(){
        boolean pedido = false;
        if(ventasActuales>promVentas && tEntrega < 30 && dispo_real < dispo_min){
            pedido = true;
            System.out.println("Se debe hacer el pedido del vino.");
        } else {
            pedido = false;
            System.out.println("No se debe hacer el pedido del vino.");
            }
        }
    }

}