/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboarddemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class BlackBoardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Character> problem = new ArrayList<Character>();

        //Three addition
        problem.add('+');
        problem.add('+');
        problem.add('+');

        //Four subtraction
        problem.add('-');
        problem.add('-');
        problem.add('-');
        problem.add('-');

        //One last addition to show order
        problem.add('+');
        
        Control control = new Control(problem);

        control.Assess();
        
    }
    
}
