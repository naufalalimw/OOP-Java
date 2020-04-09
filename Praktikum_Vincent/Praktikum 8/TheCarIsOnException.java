/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labdas
 */
public class TheCarIsOnException extends Exception{
    public TheCarIsOnException(){
        
    }
    public String getMessage(){
        return("Mobil sudah menyala");
    }
}
