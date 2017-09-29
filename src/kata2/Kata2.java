
package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        //Ya no podemos trabajar con tipos primitivos(int), así que usamos Integer.
        String[] data = {"Luisa","Luisa", "Pepe", "Rosa", "Rosa", "Rosa"};
        
        Histogram histo = new Histogram(data); 
        Map<String,Integer> histogr = histo.getHistogram(); 
        
        for (String key : histogr.keySet()){
            System.out.println(key + " --> " + histogr.get(key));
        }
             
    }
}
