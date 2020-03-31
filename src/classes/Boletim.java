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
public class Boletim {

    
    
    private Aluno aluno;
    private Disciplina disciplina;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double faltas;

    public Boletim(Aluno aluno, Disciplina disciplina){
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    public double verificarMedia(){
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        disciplina.setMediaFinal(media);
        
        
        return media;
    }
    
    public void verificarConceito(){
        double media = verificarMedia();
        
        if(media >= 9){            
            disciplina.setConceito('A');
        }else if(media >= 7 && media < 9){            
            disciplina.setConceito('B');
        }else if(media >= 4 && media < 7){            
            disciplina.setConceito('C');
        }else{           
            disciplina.setConceito('D');
        }
        
    }
    
    public void verificarFaltas(){
        double percFaltas = faltas/disciplina.getCargaHoraria();
        
        aluno.setPorcentoFaltas(percFaltas);
        
        
        
        
    
    }
   
    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the disciplina
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    /**
     * @return the nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /**
     * @return the nota4
     */
    public double getNota4() {
        return nota4;
    }

    /**
     * @param nota4 the nota4 to set
     */
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    /**
     * @return the faltas
     */
    public double getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    
}
