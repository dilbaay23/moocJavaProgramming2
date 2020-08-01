
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class StorageFacility {

    private ArrayList<String> list;
    private HashMap<String, ArrayList<String>> storageHashMap;

    public StorageFacility() {
        this.storageHashMap = new HashMap<>();
    }

    public void add(String unit, String item) {

        if (storageHashMap.containsKey(unit)) {
            storageHashMap.get(unit).add(item);
        } else {
            storageHashMap.put(unit, new ArrayList<>());
            storageHashMap.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {

        if (storageHashMap.containsKey(storageUnit)) {
            return storageHashMap.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        if (storageHashMap.containsKey(storageUnit)) {
            storageHashMap.get(storageUnit).remove(item);
            if (storageHashMap.get(storageUnit).size() == 0) {
                storageHashMap.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();

        for (String name : storageHashMap.keySet()) {
            list.add(name);

        }
        return list;

    }

}
