/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen0802;

import java.util.ArrayList;

/**
 *
 * @author C-211
 */
public class Examen0802 {

    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();

                 /*Lista 1 */
    
        a1.add(0,-30);
        a1.add(1,10);
        a1.add(2,13);
        a1.add(3,77);

                /*Lista 2 */
    
        a2.add(0,0);
        a2.add(1,10);
        a2.add(2,20);

            /*Unimos las listas quitamos repedios y imprimimos el codigo */
    
        ArrayList une=new ArrayList();
        une.addAll(a1);
        une.addAll(a2);
        java.util.Collections.sort(une);
                /* */
        une.remove(2);
        System.out.print(une);
    }
}



 
 
 
 

