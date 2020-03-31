/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import classes.Aluno;
import classes.Boletim;
import classes.Disciplina;

/**
 *
 * @author Tonykiyo
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Joaozinho", "12346789011");
        aluno1.setEmail("joaozinho@hotmail.com");
        
        Disciplina materia1 = new Disciplina();
        materia1.setNome("Geografia");
        materia1.setCargaHoraria(80);
        
        
        Disciplina materia2 = new Disciplina();
        materia2.setNome("Ingles");
        materia2.setCargaHoraria(60);
        
        
        Boletim bolGeo = new Boletim(aluno1, materia1);
        Boletim bolIng = new Boletim(aluno1, materia2);
        
        bolGeo.setNota1(8);
        bolGeo.setNota2(7);
        bolGeo.setNota3(9);
        bolGeo.setNota4(7.5);
        bolGeo.setFaltas(11);
        
        bolIng.setNota1(5.5);
        bolIng.setNota2(4.5);
        bolIng.setNota3(9.0);
        bolIng.setNota4(8);
        bolIng.setFaltas(33);
        
        bolGeo.verificarMedia();
        bolGeo.verificarConceito();
        bolGeo.verificarFaltas();
        
        
        bolIng.verificarMedia();
        bolIng.verificarConceito();
        bolIng.verificarFaltas();
        
        
        materia1.getMediaFinal();
        System.out.println("Aluno conceito: " + materia1.getConceito());  
        aluno1.getPorcentoFaltas();
        System.out.println("*****************************************************");
        materia2.getMediaFinal();
        System.out.println("Aluno conceito: " + materia2.getConceito());  
        aluno1.getPorcentoFaltas();
        
       
        
        
         
        
        
    }
    
}
