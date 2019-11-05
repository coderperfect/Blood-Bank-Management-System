/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.bank.management;

import javax.swing.JFrame;

/**
 *
 * @author Mrityunjoy Nath
 */
public class BloodBankManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HomePage hp = new HomePage();
        hp.setVisible(true);
        hp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
