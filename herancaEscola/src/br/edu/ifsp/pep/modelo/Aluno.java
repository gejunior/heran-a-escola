/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

/**
 *
 * @author genil
 */
public class Aluno extends Pessoa{
    private String curso;
    private int semestre;

    public Aluno(String curso, int semestre, String prontuario, String nome, int tell) {
        super(prontuario, nome, tell);
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    
}
