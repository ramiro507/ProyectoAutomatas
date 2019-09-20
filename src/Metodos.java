
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Metodos {
    /**public static void main(String[] args) {
        String [] p = {"hola","como","estas","hola","como","Hola","hola"};
        String [] r = elimRepet(p);
        for (String x : r) {
            System.out.println(x);
        }
    }**/
    static String[] elimRepet(String [] pal){
        String [] res;
        String aux ="";
        for (int x=0; x<pal.length-1; x++) {
            for (int y=x+1 ; y<pal.length ; y++) {
                if(pal[x]==pal[y]){
                    pal[x]="-1";
                }
            }
            
        }
        for (String x : pal) {
            if(x!="-1"){
                aux+=x+"\n";
            }
        }
        res=aux.split("\n");
        return res;
    }
    static String[] recIzquierda(String [] pal){
        String [] res=pal;
        return res;
    }
}
