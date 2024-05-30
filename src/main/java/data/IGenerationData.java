package data;

import java.util.List;

public interface IGenerationData {
    //параметры - диапазон rand числа (для List<Integer>)
    //            диапазон rand слова (для List<String>)
    public void generait(int origin, int bound);
    //public List<T> getData();

}
