/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalpkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author duyme
 */
public class Menu extends ArrayList<String> {

    String msg = "";
    public static Scanner sc = new Scanner(System.in);

    public Menu(String msg) {
        super();
        this.msg = msg;
    }

    public int getUserChoice() {
        System.out.println(msg);
        for (int i = 0; i < this.size(); i++) {
            System.out.println((i + 1) + "-" + this.get(i));
        }
        System.out.print("Other: quit - choose: ");
        return Integer.parseInt(sc.nextLine());
    }

}
