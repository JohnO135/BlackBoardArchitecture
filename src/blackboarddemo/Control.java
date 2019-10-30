/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboarddemo;

import java.util.ArrayList;
/**
 *
 * @author John
 */
public class Control {
    private KSadd ksadd;
    private KSsubtract kssubtract;
    private Blackboard blackboard;

    public Control(ArrayList<Character> inproblem){
        ksadd = new KSadd();
        kssubtract = new KSsubtract();
        blackboard = new Blackboard(inproblem);
    }

    public void Assess() throws InterruptedException {
        ArrayList<Character> inproblem = blackboard.getProblem();
        while(inproblem.isEmpty() == false) {
            if(inproblem.get(0) == '+') {
                char operation = inproblem.get(0);
                inproblem.remove(0);
                ksadd.addition(operation);
            }
            else if(inproblem.get(0) == '-') {
                char operation = inproblem.get(0);
                inproblem.remove(0);
                kssubtract.subtraction(operation);
            }
            Thread.sleep(1000);
        }
        System.out.println("Control: Assessment Complete");
        
        
    }
    
}
