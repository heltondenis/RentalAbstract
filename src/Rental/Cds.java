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
public class Cds extends Dvd{
    
    @Override
    public void cadastrar() {
        setCodigo(1);
        setTitulo("The Best of Joy Division");
        setSituacaoItem("L");
        System.out.println("CD Cadastrado: " + " - Cod: " + getCodigo()+ " - Titulo: " 
                + getTitulo() + getTitulo() + " - Situacao: " + getSituacaoItem());
        System.out.println("Cd Cadastrado utitilizando método herdado da classe abstrata");     
    }
    
    @Override
    public void imprimir(){
        System.out.println("Impressão da lista de Cds método herdado da classe Dvds");
    }
    
    public void vender(){
        System.out.println("CD Vendido utilizando método concreto da classe CDs");
    }
    
    public static Cds getInstance(){
        return new Cds();
    }

    private void setCodigo(int i) {
      
    }

    private void setTitulo(String the_Best_of_Joy_Division) {
       
    }

    private void setSituacaoItem(String l) {

    }

    private String getCodigo() {
        return null;

    }

    private String getTitulo() {
        return null;

    }

    private String getSituacaoItem() {
        return null;

    }
}
