package view;

import java.util.HashMap;
import java.util.Map;

public class ApplicationFrame<T> {
    private final T[] data;

    public ApplicationFrame(T[] data) {
        this.data = data;
    }
    
    public Map<T, Integer> getHistogram() {
        Map<T, Integer> map = new HashMap<T, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            map.put(data[i], map.containsKey(data[i]) ? map.get(data[i]) + 1 : 1);
        }
        return map;
    }
}