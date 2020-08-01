
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (!(owners.containsKey(licensePlate))) {
            owners.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return this.owners.getOrDefault(licensePlate, null);

    }

    public boolean remove(LicensePlate licensePlate) {

        /*if (this.owners.getOrDefault(licensePlate, null).equals(null)) {
            return false;
        } else {
            owners.remove(licensePlate);
            return true;
        }*/
        for (LicensePlate lp: this.owners.keySet()) {
            if (lp.equals(licensePlate)) {
               owners.remove(licensePlate); 
                return true;
            }
            
        }
        return false;

    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : this.owners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> listOwners = new ArrayList<>();
        for (LicensePlate licensePlate : this.owners.keySet()) {
            if (!(listOwners.contains(this.owners.get(licensePlate)))) {
                listOwners.add(this.owners.get(licensePlate));
            }
        }
        for (String listOwner : listOwners) {
            System.out.println(listOwner);

        }

    }

}
