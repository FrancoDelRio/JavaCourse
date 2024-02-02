public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private double cilindraje;
    private int capacidadTanke;

    public Automovil(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //setters
    public void setMarca(String marca){
        this.marca  = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setCilindraje(double cilindraje){
        this.cilindraje = cilindraje;
    }
    public void setCapacidadTanke(int capacidadTanke){
        this.capacidadTanke = capacidadTanke;
    }

    //getters
    public String getMarca(){
        return this.marca ;
    }
    public String getModelo(){
        return this.modelo ;
    }
    public double getCilindraje(){
        return this.cilindraje ;
    }

    public int getCapacidadTanke(){
        return this.capacidadTanke ;
    }


    public void detalle(){
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("color: " + this.color);
        System.out.println("cilindraje: " + this.cilindraje);
    }

    public String acelerar(int rpm){
        return "Aceleracion " + this.marca + " a " + rpm + " rpm";
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (capacidadTanke*porcentajeBencina);
    }


}
