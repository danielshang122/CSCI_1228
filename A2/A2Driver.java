package A2;
public class A2Driver {

    
    public static void main(String[] args) {
     
        Land parcel1 = new Land();
        Land parcel2 = new Land("Cheticamp");
        Surveyed parcel3 = new Surveyed();
        Surveyed parcel4 = new Surveyed("Oakfield", 2);
        Features parcel5 = new Features();
        String[] features = {"Cleared", "Ocean view"};
        Features parcel6 = new Features("Duncan's Cove", 3, features);
        
        System.out.println(parcel1);
        System.out.println(parcel2);
        System.out.println(parcel3);
        System.out.println(parcel4);
        System.out.println(parcel5);
        System.out.println(parcel6);
    
        System.out.println("******** Polymorphism ********");
        Land[] parcels = new Land[6];
        
        parcels[0] = new Land();
        parcels[1] = new Land("Cheticamp");
        parcels[2] = new Surveyed();
        parcels[3] = new Surveyed("Oakfield", 2);
        parcels[4] = new Features();
        parcels[5] = new Features("Duncan's Cove", 3, features);
 
        for (int i = 0; i < parcels.length; i++)
            System.out.println(parcels[i]);
    }
    
}
