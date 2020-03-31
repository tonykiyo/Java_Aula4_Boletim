/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Tonykiyo
 */
public class Disciplina {

    
    private String nome;
    private int cargaHoraria;
    private double mediaFinal;
    private char conceito;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    /**
     * @return the mediaFinal
     */
    public double getMediaFinal() {
        if(mediaFinal >= 7){
            System.out.println("Aluno aprovado!");
        }else if(mediaFinal >= 4 && mediaFinal < 7){
            System.out.println("Aluno esta de recuperacao!");
        }else{
            System.out.println("Aluno reprovado!");
        }
        return mediaFinal;
    }

    /**
     * @param mediaFinal the mediaFinal to set
     */
    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    /**
     * @return the conceito
     */
    public char getConceito() {
        return conceito;
    }

    /**
     * @param conceito the conceito to set
     */
    public void setConceito(char conceito) {
        this.conceito = conceito;
    }
}
