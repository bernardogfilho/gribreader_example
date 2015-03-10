import net.sourceforge.jgrib.GribFile;
import net.sourceforge.jgrib.GribRecord;

/**
 * Created by bernardog on 09/03/15.
 */
public class main {

    public static void main(String[] args) {
        try {
//            Lire archive .grb
            GribFile grb = new GribFile("Scandinavia.wind.grb");


//          Afficher tous les enregistrements...
//            grb.listRecords(System.out);

//          Prendre l'enregistrement 1 du fichier .grb
            GribRecord record = grb.getRecord(23);

//            Affiche l'enregistrement
            System.out.println(record.toString());

//            Affiche le grid des positions geographique
            System.out.println(record.getGDS().toString());

//            Affiche le valeur minimale du vent en m/s
            float minValue = record.getBDS().getMinValue();
            System.out.println("Valeur minimale: " + minValue);

//            Affiche le valeur maximale
            float maxValue = record.getBDS().getMaxValue();
            System.out.println("Valeur maximale: " + maxValue);


        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
