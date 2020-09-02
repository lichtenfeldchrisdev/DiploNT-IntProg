package pyregistropersona.Utilidades;

public class Personas {

    private String nombre;
    private byte edad;
    private long dni;
    private String sexo;
    private float peso;
    private float altura;
//constructor por defecto

    public Personas() { // por que en el contructor por def no uso this?
        nombre = "";
        edad = 0;
        dni = 0;
        sexo = "H";
        peso = 0;
        altura = 0;
    }
//Constructor con parametros basicos

    public Personas(String nombre, byte edad, String sexo) { //Ver como carga los atriibutos que no defino
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }
//constructor con parametros 

    public Personas(String nombre, byte edad, long dni, String sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
//constructor de prueba para usar metodo generaDNI()
//    public Personas(String nombre, byte edad, float peso, float altura) {
//        this.nombre = nombre;
//        this.edad = edad;       
//        this.peso = peso;
//        this.altura = altura;
//        generaDNI(); 
//    }
//getters

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public long getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
//setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
//comportamientos propios dela clase

    public float calculaIMC(float peso, float altura) {
        float aux = (float) (peso / Math.pow(altura, 2));
        final byte imc;
        if (aux > 25) {
            imc = 1;
        } else if (aux <= 25 && aux >= 20) {
            imc = 0;
        } else {
            imc = -1;
        }
        return imc;
    }

    public boolean esMayorDeEdad(short edad) {
        boolean aux = false;
        if (edad >= 18) {
            aux = true;
        }
        return aux;
    }
    private String comprobarSexo(String sexo){
        switch(sexo){
            case "h":{
                return "H";          
            }
            case "m":{
                return "M" ;
            }
            default:{
                return "H"; 
            }
        }
    }

    @Override
    public String toString() {
        String aux ="La persona \n" + "Se llama " + nombre + ", tiene " + edad + "años,"
                + "con dni: " + dni + ", de sexo " + sexo + ", tiene un peso de " + 
                peso + " Kg, su altura es : " + altura + " Mts" + "y su IMC es : " +
                calculaIMC(peso, altura);
        return aux;
    }
    private void generaDNI(){
        long numeroloco = (long) (Math.random()*100000000);
        this.dni = numeroloco;
        if (numeroloco%2==0)
        {
            this.sexo = "M";
        }else{
            this.sexo = "H";
        }       
    }
    
}
