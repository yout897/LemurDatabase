
package lemurdatabase;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Author: Alexander DiCarlo
 * Date: 07/11/2016
 */
public class LemurDatabase {

    /**
     *  Asks user for input, and generates random Lemurs to add to an ArrayList.
     *  pre: None
     *  post: Prints all Lemurs from the ArrayList
     */
    public static void main(String[] args) {
        
        int randAge,randGender;
        double randWeight,deathRate;
        
        ArrayList<Lemur> lemurList = new ArrayList();
        
        int lemNum = Integer.parseInt(JOptionPane.showInputDialog(""
                + "How many Lemurs do you like to add to the list?"));
        for(int i = 0; i < lemNum; i++){
            int choice = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Please enter the type of Lemur to add:"
                    + "\n1 - Tree Lemur"
                    + "\n2 - Desert Lemur"
                    + "\n3 - Jungle Lemur"));
            randAge = (int)(Math.ceil(Math.random()*19)+1);
            randGender = (int)(Math.ceil(Math.random()*2));
            randWeight = (Math.random()*5)+1;
            deathRate = 0.66;
            
            if(choice == 1){
                if(randGender == 1){
                    TreeLemur lemur = new TreeLemur(randAge,randWeight,"Male","Madagascar","Prosimian","Fur","Fruit","Red","Large groups");
                    lemurList.add(lemur);
                }else if(randGender == 2){
                    TreeLemur lemur = new TreeLemur(randAge,randWeight,"Female","Madagascar","Prosimian","Fur","Fruit","Red","Large groups");
                    lemurList.add(lemur);
                }
            }else if(choice == 2){
                if(randGender == 1){
                    DesertLemur lemur = new DesertLemur(randAge,randWeight,"Male","Madagascar","Prosimian","Fur","Cacti","White",deathRate);
                    lemurList.add(lemur);
                }else if(randGender == 2){
                    DesertLemur lemur = new DesertLemur(randAge,randWeight,"Female","Madagascar","Prosimian","Fur","Cacti","White",deathRate);
                    lemurList.add(lemur);
                }
            }else if(choice == 3){
                if(randGender == 1){
                    JungleLemur lemur = new JungleLemur(randAge,randWeight,"Male","Madagascar","Prosimian","Fur","Mice,Snails, and Insects","Black or Blue","Small groups");
                    lemurList.add(lemur);
                }else if(randGender == 2){
                    JungleLemur lemur = new JungleLemur(randAge,randWeight,"Female","Madagascar","Prosimian","Fur","Mice, Snails, and Insects","Black or Blue","Small groups");
                    lemurList.add(lemur);
                }
            }
        }
        for(int j = 0; j < lemurList.size(); j++){
            System.out.println(lemurList.get(j).toString()+"\n");
        }
    }
}