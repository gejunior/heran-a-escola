/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

/**
 *
 * @author genil
 */
public class Professor extends Pessoa{
    private String area;
    private String contrato;

    public Professor(String area, String contrato, String prontuario, String nome, int tell) {
        super(prontuario, nome, tell);
        this.area = area;
        this.contrato = contrato;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
    
}
