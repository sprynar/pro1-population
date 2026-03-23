package pro1;

import pro1.data.Muni;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class FunFact5 {
    /**
     * @return TODO: Názvy obcí s nejméně obyvateli
     * @param count: počet hledaných obcí
     */
    public static List<String> getFunFact(List<Muni> data, int count) {
        List nejmeneObyvatel = data
                .stream()
                .filter(muni -> muni.getPopulation() > 0)
                .sorted(
                Comparator.comparingInt(m -> m.getPopulation())
                )
                .limit(count)
                .map(m -> m.getName())
                .toList();
        return nejmeneObyvatel;
    }

    /**
     * @return TODO: Názvy obcí s nejméně obyvateli, oddělené čárkou
     * @param count: počet hledaných obcí
     */
    public static String getFunFactJoined(List<Muni> data, int count) {
        String joined = String.join(", ", getFunFact(data, count));
        return joined;
    }
}