
package lemurdatabase;

/**
 * Author: Alexander DiCarlo
 * Date: 07/11/2016
 */
public class TreeLemur extends Lemur{

    String packSize;
    
    /**
     *  Asks for all the required variables needed to create a Tree Lemur
     *  pre: age,weight,gender,location,classification,coat,food,colour,pack size
     *  post: None
     */
    
    public TreeLemur(int age, double weight, String gender, String location, String classification, String coat, String food, String colour, String packSize) {
        super(age, weight, gender, location, classification, coat, food, colour);
        this. packSize = packSize;
    }

    /**
     * `Edits the Lemur toString method to add in Pack Size
     *  pre: None
     *  post:Returns the Lemur toString edited to add the Tree Lemur and Pack Size
     */
    
    @Override
    public String toString() {
        return ("Tree Lemur:\n"
                + super.toString()
                + "\nPack Size = " + packSize);
    }
}
