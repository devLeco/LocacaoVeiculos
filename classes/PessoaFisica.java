/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Leandro
 */
public class PessoaFisica extends Cliente{
    private String CPF;
    private String CNH;
    private LocalDate dtNascimento; // recebe a data sem as horas 
    
    public PessoaFisica(){
        super();
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the CNH
     */
    public String getCNH() {
        return CNH;
    }

    /**
     * @param CNH the CNH to set
     */
    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    /**
     * @return the dtNascimento
     */
    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    /**
     * @param dtNascimento the dtNascimento to set
     */
    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String getCPFOuCNPJ() {
        return this.CPF;
    }

    @Override
    public String getCNH2() {
        return this.CNH;
    }

    @Override
    public String getDtNascOuDesc() { // pega a data em LocalDate e converte para string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String dataString = this.dtNascimento.format(formatter);
        return dataString;
    }

    @Override
    public String informacoes() {
        return this.getNome() + "-CPF:" + this.CPF;
    }


 
}
