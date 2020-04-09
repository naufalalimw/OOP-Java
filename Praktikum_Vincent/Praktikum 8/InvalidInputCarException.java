/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labdas
 */
public class InvalidInputCarException extends Exception{
    private int input;
    
    public InvalidInputCarException(int input){
        this.input=input;
    }

    public String getMessage(){
        return("Input "+input+" diluar range");
    }
}
