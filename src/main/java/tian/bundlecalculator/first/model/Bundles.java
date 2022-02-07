package tian.bundlecalculator.first.model;

import java.util.HashMap;
import java.util.Map;

//test hhhh
public class Bundles {

    static Map<String, Map<Integer, Double>> typeMaps = new HashMap<>();

    static {
        typeMaps.put("IMG", new BundleTypes().getImgBundle());
        typeMaps.put("FLAC", new BundleTypes().getFlacBundle());
        typeMaps.put("VID", new BundleTypes().getVidBundle());
    }

    public Map<Integer, Double> getCategories(String category) {
        return typeMaps.get(category);
    }

}
