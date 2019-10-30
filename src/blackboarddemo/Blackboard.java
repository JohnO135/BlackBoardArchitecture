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
public class Blackboard {
    private ArrayList<Character> problem;

    public Blackboard(ArrayList<Character> inproblem) {
        problem = inproblem;
    }

    public ArrayList<Character> getProblem() {
        return problem;
    }

    public void setProblem(ArrayList<Character> inproblem) {
        problem = inproblem;
    }
}
