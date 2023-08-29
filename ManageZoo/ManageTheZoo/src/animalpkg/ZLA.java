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
public class ZLA extends Animal {

    boolean poisonous;

    public ZLA(String ID, String name, AnimalType type, String color, double weight, boolean poisonous) {
        super(ID, name, type, color, weight);
        this.poisonous = poisonous;
    }

    @Override
    public String strToFile() {
        return super.strToFile() + ";" + poisonous; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ZLA{" + super.toString() + "\n poisonous=" + poisonous + "}\n"; //To change body of generated methods, choose Tools | Templates.
    }

}
