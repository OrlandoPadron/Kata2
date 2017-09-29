package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Añadiendo <T> hacemos que la clase sea genérica; Nuestra clave puede ser de 
//cualquier tipo. 
public class Histogram<T> {
    private final T [] data; 

    public Histogram(T[] data) {
        this.data = data;
    }

    public Map<T, Integer> getHistogram(){
        Map<T, Integer> histogram = new TreeMap<>();
        
        for (T value: data){
            histogram.put(value, 
            //Operador ternario. Si el histograma contiene a value, le suma +1. 
                    histogram.containsKey(value) ? histogram.get(value)+1 : 1);
        }
        return histogram; 
        
    }
}
