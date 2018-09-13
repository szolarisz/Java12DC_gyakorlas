/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author thomas
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] vez�rek = {"�lmos","El�d","Ond","Kond","Tas","Huba","T�h�t�m"};
        for(String elem: vez�rek)
            if(elem.toUpperCase().contains("T"))
                System.out.println(elem);
        System.out.println("--------");
        int minHely = 0;
        for(int i=1 ; i< vez�rek.length; i++)
            if(vez�rek[i].length() < vez�rek[minHely].length())
                minHely = i;
        for(String elem: vez�rek)
            if( elem.length() == vez�rek[minHely].length())
                System.out.println(elem);
        System.out.println("--------");
        int darab = 0;
        for(String elem: vez�rek){
            String teszt = elem.toUpperCase();
            if(teszt.charAt(0) == teszt.charAt(teszt.length()-1))
                darab++;
        }
        System.out.println(darab + "ilyen n�v van a list�ban.");
        System.out.println("--------");
        double [] m�r�sek = {9.7, 11.3, 8.3, 11.2, 10.5, 11.7, 9.5, 8.7, 10.1, 10.9};
        int maxV�lt = 0;
        for(int i=0; i<m�r�sek.length - 1; i++){
            double max =  Math.abs(m�r�sek[maxV�lt+1] - m�r�sek[maxV�lt]);
            double mostDiff =  Math.abs(m�r�sek[i+1] - m�r�sek[i]);
            if(mostDiff > max)
                maxV�lt = i;
        }
        System.out.println("A "+(1+maxV�lt)+". �s a "+(2+maxV�lt)+". nap k�z�tt a legnagyobb a v�ltoz�s.");
        
        double �sszeg = 0;
        for(double elem: m�r�sek)
            �sszeg += elem;
        double �tlag = �sszeg / m�r�sek.length;
        System.out.println("A m�r�sek �tlaga: "+�tlag);
        System.out.format("A m�r�sek �tlaga: %.2f\n", �tlag);
                
    }
    
}
