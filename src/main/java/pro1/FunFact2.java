package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact2 {
    /**
     * @return TODO: Celkový počet obyvatel ve všech obcích
     */
    public static int getFunFact(List<Muni> data) {
        int pocetObyvatel = data.stream().mapToInt(Muni::getPopulation).sum();
//        int pocetObyvatel = 0;
//        for (Muni muni : data) {
//            pocetObyvatel += muni.getPopulation();
//        }
        return pocetObyvatel;
    }
}