/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

/**
 *
 * @author Daven
 */
public class FirstController {
    public FirstModel firstModel;
    public FirstVew firstVew;
    
    public FirstController(FirstModel firstModel, FirstVew firstVew){
        this.firstModel = firstModel;
        this.firstVew = firstVew;
    }
    
    public void setTools(int tools){
        firstModel.setTools(tools);
    }
    public void setSkills(int skills){
        firstModel.setSkills(skills);
    }
    public int getTools(){
        return firstModel.getTools();
    }
    public int getSkills(){
        return firstModel.getSkills();
    }
    public void printData(){
        firstVew.printModelData(getSkills(), getTools());
    }
}
