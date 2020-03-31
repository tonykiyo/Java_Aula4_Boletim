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
public class Aluno {

    

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private double porcentoFaltas;
    /**
     * @return the nome
     */
    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
   

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * @return the porcentoFaltas
     */
    public double getPorcentoFaltas() {   
        if(porcentoFaltas > 0.25 ){
            System.out.println("Aluno Reprovado por faltas ");
        }else{
            System.out.println("Aluno com a frequencia satisfatoria.");
        }
        return porcentoFaltas;
    }

    /**
     * @param porcentoFaltas the porcentoFaltas to set
     */
    public void setPorcentoFaltas(double porcentoFaltas) {
        this.porcentoFaltas = porcentoFaltas;
    }
    
}
