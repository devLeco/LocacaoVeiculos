/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;

/**
 *
 * @author Leandro
 */
public class PessoaJuridica extends Cliente{
    private String CNPJ;
    private String CNHResponsavel;
    private String descontoLocacao;
    
    
    public PessoaJuridica(){
        super();
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the CNHResponsavel
     */
    public String getCNHResponsavel() {
        return CNHResponsavel;
    }

    /**
     * @param CNHResponsavel the CNHResponsavel to set
     */
    public void setCNHResponsavel(String CNHResponsavel) {
        this.CNHResponsavel = CNHResponsavel;
    }

    /**
     * @return the descontoLocacao
     */
    public String getDescontoLocacao() {
        return descontoLocacao;
    }

    /**
     * @param descontoLocacao the descontoLocacao to set
     */
    public void setDescontoLocacao(String descontoLocacao) {
        this.descontoLocacao = descontoLocacao;
    }

    @Override
    public String getCPFOuCNPJ() {
        return this.CNPJ;
    }

    @Override
    public String getCNH2() {
        return this.CNHResponsavel;
    }

  
  
    @Override
    public String getDtNascOuDesc() {
        return this.descontoLocacao;
    }

    @Override
    public String informacoes() {
        return this.getNome() + "-CNPJ" + this.CNHResponsavel;
    }
    
}
