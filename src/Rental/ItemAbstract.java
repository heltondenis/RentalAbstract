/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental;

/**
 *
 * @author heltondenis
 */
public abstract class ItemAbstract {
    
    private int code;
    private String title;
    private String dataBorrowed;
    private String dataDevolution;
    private String SituationDate; // L free ; E Borrowed
    
    public abstract void register();
    public abstract void lend();
    public abstract void return_item();
}
