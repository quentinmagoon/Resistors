/*
 * Resistors.java
 * Quentin Magoon
 * Febuary 28, 2019
 * Takes three colours, separated by hyphens, and prints the value of the resistor.
 */

package resistors;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Resistors {

    public static void main(String[] args) {
                
        String colours[] = new String[10];
        colours[0] = "black";
        colours[1] = "brown";
        colours[2] = "red";
        colours[3] = "orange";
        colours[4] = "yellow";
        colours[5] = "green";
        colours[6] = "blue";
        colours[7] = "violet";
        colours[8] = "grey";
        colours[9] = "white";

        //declaring variables
        String rColour;
        String c1, c2, c3;
        double r1 = 0.0, r2 = 0.0, r3 = 0.0, resVal;
        int i;
        
        rColour = JOptionPane.showInputDialog("What is your resistors colour code? \n"
                + "Separate each colour by hyphens \n" + "Ex: Red-Orange-Black");
         
        c1 = rColour.substring(0, rColour.indexOf("-"));
        c2 = rColour.substring(rColour.indexOf("-") + 1, rColour.lastIndexOf("-"));
        c3 = rColour.substring(rColour.lastIndexOf("-") + 1);

        for (i = 0; i < 10; i++) {
            if (c1.equalsIgnoreCase(colours[i])) {
                r1 = i;
            }
            if (c2.equalsIgnoreCase(colours[i])) {
                r2 = i;
            }
            if (c3.equalsIgnoreCase(colours[i])) {
                r3 = i;
            }
        }

        //Calculate the resistor value and dispay it
        resVal = (((r1 * 10) + r2) * Math.pow(10, r3));
        System.out.println("You entered " + rColour);
        System.out.println("The value of the resistor is " + resVal + " ohms");
         
        
    }
    
}
