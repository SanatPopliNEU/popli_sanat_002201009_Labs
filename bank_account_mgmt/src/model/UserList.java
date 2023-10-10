/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sanatpopli
 */
public class UserList {
    
    private ArrayList<User> history;
    
    
    public UserList (){
        
        this.history= new ArrayList <User>();
    }

    public ArrayList<User> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<User> history) {
        this.history = history;
    }
    
    public User addNewUser(){
      User user=new User();
      history.add(user);
      return user;
    }

    public void deleteUser(User user) {
        history.remove(user); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String searchUser(String neuid){
        for(User user:history){
            if(user.getNeuid().equals(neuid)){
                return neuid;
        }
        
        
    
    
    
}
        return null;

}}
