
package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,1,-3,7,7,7,2};
        
        Histogram histo = new Histogram(data); 
        Map<Integer,Integer> histogr = histo.getHistogram(); 
        
        for (int key : histogr.keySet()){
            System.out.println(key + " --> " + histogr.get(key));
        }
             
    }
}
