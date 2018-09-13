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
        String [] vezérek = {"Álmos","Elõd","Ond","Kond","Tas","Huba","Töhötöm"};
        for(String elem: vezérek)
            if(elem.toUpperCase().contains("T"))
                System.out.println(elem);
        System.out.println("--------");
        int minHely = 0;
        for(int i=1 ; i< vezérek.length; i++)
            if(vezérek[i].length() < vezérek[minHely].length())
                minHely = i;
        for(String elem: vezérek)
            if( elem.length() == vezérek[minHely].length())
                System.out.println(elem);
        System.out.println("--------");
        int darab = 0;
        for(String elem: vezérek){
            String teszt = elem.toUpperCase();
            if(teszt.charAt(0) == teszt.charAt(teszt.length()-1))
                darab++;
        }
        System.out.println(darab + "ilyen név van a listában.");
        System.out.println("--------");
        double [] mérések = {9.7, 11.3, 8.3, 11.2, 10.5, 11.7, 9.5, 8.7, 10.1, 10.9};
        int maxVált = 0;
        for(int i=0; i<mérések.length - 1; i++){
            double max =  Math.abs(mérések[maxVált+1] - mérések[maxVált]);
            double mostDiff =  Math.abs(mérések[i+1] - mérések[i]);
            if(mostDiff > max)
                maxVált = i;
        }
        System.out.println("A "+(1+maxVált)+". és a "+(2+maxVált)+". nap között a legnagyobb a változás.");
        
        double összeg = 0;
        for(double elem: mérések)
            összeg += elem;
        double átlag = összeg / mérések.length;
        System.out.println("A mérések átlaga: "+átlag);
        System.out.format("A mérések átlaga: %.2f\n", átlag);
                
    }
    
}
