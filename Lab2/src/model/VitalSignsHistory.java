/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.VitalView;
import java.util.ArrayList;

/**
 *
 * @author sanatpopli
 */
public class VitalSignsHistory {
    
    private ArrayList<VitalView> history;
    
    
    public VitalSignsHistory (){
        
        this.history= new ArrayList <VitalView>();
    }

    public ArrayList<VitalView> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalView> history) {
        this.history = history;
    }
    
    public VitalView addNewView(){
      VitalView newvital=new VitalView();
      history.add(newvital);
      return newvital;
    }

    public void deletevitals(VitalView vv) {
        history.remove(vv); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
