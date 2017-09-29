package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Histogram {
    private final int [] data; 

    public Histogram(int[] data) {
        this.data = data;
    }

    public Map<Integer, Integer> getHistogram(){
        Map<Integer, Integer> histogram = new TreeMap<>();
        
        for (int value: data){
            histogram.put(value, 
            //Operador ternario. Si el histograma contiene a value, le suma +1. 
                    histogram.containsKey(value) ? histogram.get(value)+1 : 1);
        }
        return histogram; 
        
    }
}
