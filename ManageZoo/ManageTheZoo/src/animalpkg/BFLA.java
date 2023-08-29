/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalpkg;

/**
 *
 * @author duyme
 */
public class BFLA extends Animal {

    boolean cute;

    public BFLA(String ID, String name, AnimalType type, String color, double weight,boolean cute) {
        super(ID, name, type, color, weight);
        this.cute = cute;
    }

   

    

    @Override
    public String strToFile() {
        return super.strToFile() + ";" + cute; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "BFLA{" + super.toString() + "\n cute=" + cute + "}\n"; //To change body of generated methods, choose Tools | Templates.
    }

}
