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
public abstract class ItemAbstrato {
    
    private int codigo;
    private String titulo;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String SituacaoItem; // L free ; E Borrowed
    
    public abstract void cadastrar();
    public abstract void emprestar();
    public abstract void devolver();
}
