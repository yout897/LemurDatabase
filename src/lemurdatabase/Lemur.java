
package lemurdatabase;

/**
 * Author: Alexander DiCarlo
 * Date: 07/11/2016
 */
abstract class Lemur extends Mammal{

    String location,classification,coat,food,colour;
    
    /**
     *  Asks for all the required variables needed to create a Lemur
     *  pre: age,weight,gender,location,classification,coat,food,colour
     *  post: None
     */
    
    public Lemur(int age, double weight, String gender, String location,String classification,String coat,String food,String colour) {
        super(age, weight, gender);
        this.location = location;
        this.classification = classification;
        this.coat = coat;
        this.food = food;
        this.colour = colour;
    }

    /**
     * `Edits the Mammal toString method to add in Pack Size
     *  pre: None
     *  post:Returns the Mammal toString edited to add the whether or not it is female or male and 
     *       location,classification,coat,food, colour, and female lemur variables.
     */
    
    @Override
    public String toString() {
        if(gender.equals("Female")){
            return (super.toString() 
                + "\nLocation = " + location
                + "\nClassification = " + classification
                + "\nCoat = " + coat
                + "\nFood = " + food
                + "\nColour = " + colour
                + "\nFemale Lemur = Dominant Role");
        }
        else if(gender.equals("Male")){
            return (super.toString() 
                + "\nLocation = " + location
                + "\nClassification = " + classification
                + "\nCoat = " + coat
                + "\nFood = " + food
                + "\nColour = " + colour);
        }else{
            return (super.toString() 
                + "\nLocation = " + location
                + "\nClassification = " + classification
                + "\nCoat = " + coat
                + "\nFood = " + food
                + "\nColour = " + colour);
        }
    }
}
