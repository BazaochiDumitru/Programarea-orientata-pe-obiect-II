/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxaloghin;

/**
 *
 * @author Corina
 */
public class User {
    private final String userName ;
    
    public User(String userName) {
        this.userName = userName ;
    }
    
    public String getUserName() {
        return userName ;
    }
    
    @Override
    public String toString() {
        return userName ;
    } 
}
