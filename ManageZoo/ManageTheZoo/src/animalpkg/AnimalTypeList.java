/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalpkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author duyme
 */
public class AnimalTypeList extends ArrayList<AnimalType> {

    public boolean loadFromFile(String fName) {
        FileReader fr = null;
        BufferedReader bf = null;
        String line = "";
        StringTokenizer stk = null;

        try {
            fr = new FileReader(fName);
            bf = new BufferedReader(fr);

            while ((line = bf.readLine()) != null) {
                line = line.trim();
                if (line.length() > 0 && !line.startsWith("//")) {
                    stk = new StringTokenizer(line, ";");
                    int type = Integer.parseInt(stk.nextToken());
                    String desc = stk.nextToken();
                    int numLegs = Integer.parseInt(stk.nextToken());
                    int numSwings = Integer.parseInt(stk.nextToken());
                    String movingMethod = stk.nextToken();
                    boolean canFly = Boolean.parseBoolean(stk.nextToken());
                    boolean canSing = Boolean.parseBoolean(stk.nextToken());
                    boolean canGrowl = Boolean.parseBoolean(stk.nextToken());
                    String food = stk.nextToken();
                    double maxWeights = Double.parseDouble(stk.nextToken());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public int search(int typeID) {

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).typeCode == typeID) {
                return i;
            }
        }
        return -1;

    }

    private Menu createMenu() {
        Menu menu = new Menu("Choose animal type:");
        for (int i = 0; i < this.size(); i++) {
            menu.add(this.get(i).desc);
        }
        return menu;

    }

    public AnimalType chooseType() {
        Menu menu = this.createMenu();
        return this.get(menu.getUserChoice() - 1);
    }

}
