
package lemurdatabase;

/**
 * Author: Alexander DiCarlo
 * Date: 07/11/2016
 */
public class JungleLemur extends Lemur{

    String packSize;
    
    /**
     *  Asks for all the required variables needed to create a Jungle Lemur
     *  pre: age,weight,gender,location,classification,coat,food,colour,pack size
     *  post: None
     */
    
    public JungleLemur(int age, double weight, String gender, String location, String classification, String coat, String food, String colour, String packSize) {
        super(age, weight, gender, location, classification, coat, food, colour);
        this.packSize = packSize;
    }
    
    /**
     * `Edits the Lemur toString method to add in Pack Size
     *  pre: None
     *  post:Returns the Lemur toString edited to add the Jungle Lemur and Pack Size
     */
    @Override
    public String toString() {
        return ("Jungle Lemur:\n"
                + super.toString()
                + "\nPack Size = " + packSize);
    }
}
