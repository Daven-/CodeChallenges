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
public class FirstUseController {
    public static FirstModel firstModel;
    public static FirstController firstController;
    public static FirstVew firstVew;
    public static void main(String[] args){
        firstModel = getData();
        firstVew = new FirstVew();
        firstController = new FirstController(firstModel, firstVew);
        
        firstController.printData();
        firstController.setSkills(2334);
        firstController.printData();
        
    }
    
    public static FirstModel getData(){
        FirstModel n = new FirstModel();
        n.setSkills(12);
        n.setTools(23);
        return n;
    }
}
