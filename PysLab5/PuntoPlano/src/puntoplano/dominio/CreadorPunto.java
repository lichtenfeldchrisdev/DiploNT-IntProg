
package puntoplano.dominio;

public class CreadorPunto {
    private float x ;
    private float y ;
    private byte cuadrante;
    private double dist;
    private String ejes;

//Creacion de constructor vacío
    public CreadorPunto() 
    {
        this.x = 0 ; 
        this.y = 0 ;
        this.ejes = "Origen";
        this.cuadrante = 0;
        this.dist = 0 ; 
    }
//Creación de constructor con parametros
    public CreadorPunto(float x, float y) 
    {
        this.x = x;
        this.y = y;
        this.ejes = sobreEjes(x, y);
        this.cuadrante = calcCuad(x, y) ; 
        this.dist = calcDist(x, y) ;
    }
    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        String aux;
        if (calcDist(x, y)!=0)
            {
                aux = "El punto está en la posición (x,y)=(" + x + "," + y +")\n"
                + "a una distancia de "+calcDist(x, y)+" de el origen del sistema "+
                sobreEjes(x, y);
            }else
            {
                aux = "El punto está en la posición (x,y)=(" + x + "," + y +")\n"
                + sobreEjes(x, y);
            }
        return aux ;
    }
    
    public byte getCuad(float x,float y){        
        return calcCuad(x, y) ; 
    }
    
    public void setCuad(float x,  float y){
        this.cuadrante = calcCuad(x, y); 
    }
    
    public void setDist(float x, float y){
        this.dist = calcDist(x, y);
    }
    
    public double getDist(float x, float y){
        return calcDist(x, y);
    }
    
    private String sobreEjes(float x, float y)
    {
        String aux = "No toca ningun eje";
        if (x==0)
        {
            aux = "sobre el eje Y";
        }else if (y==0)
        {
            aux = "sobre el eje X" ; 
        }
        if (calcDist(x, y)==0)
        {
            aux = "sobre el origen" ; 
        }
        return aux ; 
    }
    private double calcDist(float x, float y)
    {
        double distancia =  Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)) ;
        return distancia;        
    }
    
    private byte calcCuad(float x, float y)
    {
        if (x != 0 && y != 0)
        {
            if (x<0)
            {
                if (y<0)
                {
                    cuadrante = 3;
                }else
                {
                    cuadrante= 2;
                }
            }else if (y>0)
                {
                    cuadrante = 1;
                }else
                {    
                    cuadrante= 2;
                }
        }else
        {
            cuadrante = 0 ; 
        }
        return cuadrante ;
    }        
}
