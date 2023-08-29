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
public class FLA extends Animal{
    boolean danger;

    public FLA(String ID, String name, AnimalType type, String color, double weight,boolean danger) {
        super(ID, name, type, color, weight);
        this.danger = danger;
    }

    

    @Override
    public String strToFile() {
        return super.strToFile() + ";" + danger; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "BFA{" + super.toString() + "\n danger=" + danger + "}\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
