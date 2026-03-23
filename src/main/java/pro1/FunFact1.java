package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact1 {
    /**
     * @return Počet obcí, které mají více než 10 000 obyvatel
     */
    public static int getFunFact(List<Muni> data) {

        long count = data.stream().filter(muni -> muni.getPopulation() > 10_000).count();
//        for (Muni muni : data) {
//            if (muni.getPopulation() > 10000) {
//                count++;
//            }
//        }
        return (int)count;
    }
}
