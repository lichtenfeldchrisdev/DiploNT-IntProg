package pylab3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int cj1 = 0, cj2 = 0, pj1, pj2, suma1 = 0, suma2 = 0;
        String j1, j2, p1 = "",p2 = "";
        Scanner varEntrada = new Scanner(System.in);

        System.out.println("Intrudzca nombre jugador 1");
        j1 = varEntrada.nextLine();
        System.out.println("Intrudzca nombre jugador 2");
        j2 = varEntrada.nextLine();

        for (int i = 1; i < 3; i++) 
        {            
            cj1 = (int) ((Math.random()) * 12) + 1;
            pj1 = (int) ((Math.random()) * 4) + 1;
            cj2 = (int) ((Math.random()) * 12) + 1;
            pj2 = (int) ((Math.random()) * 4) + 1;
            
            switch(pj1)
            {
                case 1:{p1="Copas";break;}
                case 2:{p1="Basto";break;}
                case 3:{p1="Espadas";break;}
                case 4:{p1="Oro";break;}
            }
            switch(pj2)
            {
                case 1:{p2="Copas";break;}
                case 2:{p2="Basto";break;}
                case 3:{p2="Espadas";break;}
                case 4:{p2="Oro";break;}
            }
            
            System.out.println("Carta de "+j1+" es "+ cj1+" de "+p1);
            System.out.println("Carta de "+j2+" es "+ cj2+" de "+p2 );

            if (cj1 < cj2 || cj2 < cj1) 
            { //Si los jugadores tienen número distinto
                if (cj1 > cj2) 
                {
                    suma1 += cj1 + cj2;
                    System.out.println("Ganador de la ronda N° " +  i  + " es: " + j1);
                    System.out.println("Suma: " + (cj1 + cj2) + " Pts");
                }
                
                if (cj2 > cj1) 
                {
                    suma2 += cj2 + cj1;
                    System.out.println("Ganador de la ronda N° " +  i  + " es: " + j2);
                    System.out.println("Suma: " + (cj1 + cj2) + " Pts");
                }
            } else if (pj1 == 4) 
                {  //Si no tiene numero distinto, veo si alguno tiene oro
                    suma1 += cj1 + cj2;
                    System.out.println("Ganador de la ronda N° " +  i  + " es: " + j1);
                    System.out.println("Suma: " + (cj1 + cj2) + " Pts");
            } else if (pj2 == 4) 
            {
                suma2 += cj2 + cj1;
                System.out.println("Ganador de la ronda N° " +  i  + " es: " + j2);
                System.out.println("Suma: " + (cj1 + cj2) + " Pts");
            }else
            {
                suma1=cj1;
                suma2=cj2;
                System.out.println("Ronda empatada");
                System.out.println(j1+" "+suma1+" Pts");
                System.out.println(j2+" "+suma2+" Pts");
            }
        }
        if (suma1>suma2) 
        {
            System.out.println("El ganador es "+j1+" con "+suma1+" Pts");
        }else
        {
            System.out.println("El ganador es "+j2+" con "+suma2+" Pts");
        }
        
    }
}       

