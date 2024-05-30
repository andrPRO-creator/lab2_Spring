package data.integer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerationData_Int {
    private List<Integer> data_int;

    public GenerationData_Int(int q, int min, int max) {
        data_int = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < q; i++) {
            data_int.add(rand.nextInt((max - min) + 1) + min);
        }
    }

    public List<Integer> getData_int() {
        return data_int;
    }
}