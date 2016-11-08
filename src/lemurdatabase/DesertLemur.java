
package lemurdatabase;

/**
 * Author: Alexander DiCarlo
 * Date: 07/11/2016
 */
public class DesertLemur extends Lemur{

    double deathRate;
    /**
     * Asks for all the required variables needed to create a Desert Lemur
     *  pre: age,weight,gender,location,classification,coat,food,colour,death rate
     *  post: None
     */
    public DesertLemur(int age, double weight, String gender, String location, String classification, String coat, String food, String colour, double deathRate) {
        super(age, weight, gender, location, classification, coat, food, colour);
        this.deathRate = deathRate;
    }
    
    
    /**
     * `Edits the Lemur toString method to add in Baby Death Rate
     *  pre: None
     *  post:Returns the Lemur toString edited to add the Desert Lemur and Baby Death Rate
     */
    @Override
    public String toString() {
        return ("Desert Lemur:\n"
                + super.toString()
                + "\nBaby Death Rate = " + deathRate);
    }
}
