
package lemurdatabase;

/**
 * Author: Alexander DiCarlo
 * Date: 07/11/2016
 */
abstract class Mammal {
    
    int age;
    double weight;
    String gender;
    
    public Mammal(int age,double weight,String gender){
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }
    
    public String toString(){
        return ("Age = " + age
                + "\nWeight = " + weight
                + "\nGender = " + gender);
    }
}
