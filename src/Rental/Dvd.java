/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author heltondenis
 */
public class Dvd extends ItemAbstrato { 
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    public Dvd(){
        
    }

    @Override
    public void cadastrar() {
     setCodigo(1);
     setTitulo("Senhor dos Aneis");
     setSituacaoItem("L");
        System.out.println("DVD Cadastrado: " + "- Cod: " + getCodigo()+" - Titulo: " + getTitulo() + " - Situacao: " + getSituacaoItem());
        System.out.println("DVD Cadastrado utilizando método abstrato " + "herdado da classe abstrata itemAbstrato");
    }

    @Override
    public void emprestar() {
        setSituacaoItem("E");
        setDataEmprestimo(sdf.format(new Date()));
        System.out.println("DVD Emprestado: "+" - Situacao: " + getSituacaoItem() + " - Data Emprestimo: " + this.getDataEmprestimo());
        System.out.println("DVD Emprestado utilizando método abstrato herdado" + "da classe abastrata itemAbstrato");
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void devolver() {
     setSituacaoItem("L");
     setDataEmprestimo(sdf.format(new Date()));
        System.out.println("DVD Devolvido: " + "- Cod: " + this.getDataDevolucao());
        System.out.println("DVD Devolvido utilizando método concreto da classe dvd ");
    }

    private void setCodigo(int i) {
     
    }

    private void setTitulo(String senhor_dos_Aneis) {
       
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

    private String getDataEmprestimo() {
        return null;

    }

    private String getDataDevolucao() {
        return null;
     
    }

    private void setDataEmprestimo(String format) {
       
    }
    
    public void imprimir(){
        System.out.println("Imprimir Lista de DVD's utilizando método concreto da classe DVD");
    }
    
    public static Dvd getInstance(){
        return new Dvd();
    }

    void vender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

