
public class A1Driver {

    
    public static void main(String[] args) {
        Car[] subCompacts = {
               new Car(2019, "Orange"),
               new Car(2015, "Blue")
           };
        
        Car[] compacts = {
               new Car(),
               new Car(),
               new Car(2013, "Silver")
           };
        
        Car[] other = {
               new Car(2020, "Blue")
           };
        
        Car[] other2 = {
               new Car(2020, "Green")
           };
        
        Car[] other3 = {
               new Car(2018, "Blue")
           };
        
        Lot one = new Lot();
        
        System.out.println();
        System.out.println(one);
        
        Lot two = new Lot(subCompacts, compacts, other);
        
        System.out.println();
        System.out.println(two);
        
        if (!one.equals(two)){
            System.out.println("Lots one and two are different");
        }
        
        Lot three = new Lot(subCompacts, compacts, other2);
        
        if (two.equals(three)){
            System.out.println("Lots two and three are the same");
        }
        
        three = new Lot(subCompacts, compacts, other3);
        
        if (two.equals(three)){
            System.out.println("Lots two and three are the same");
        }
        
        System.out.println();
        System.out.println("The oldest car on lot#2 is " + two.oldestCarOnLot());
    }
}
