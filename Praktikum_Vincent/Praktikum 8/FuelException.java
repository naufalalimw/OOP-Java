/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labdas
 */
public class FuelException extends Exception{
    private String fuel;
    
    public FuelException(String fuel){
        this.fuel=fuel;
    }
    public String getMessage(){
        return("Bensin jenis "+fuel+" tidak sesuai");
    }
}
