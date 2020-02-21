/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Leandro
 */
public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private String ano;
    private boolean locado;
    private double valorDiariaLocacao;
    
    
    public Carro(){
        this.setLocado(false);
    }
    
    public String informacao(){
        return this.modelo + "/" + this.marca + "-Placa:" + this.placa;
    }
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the valorDiariaLocacao
     */
    public double getValorDiariaLocacao() {
        return valorDiariaLocacao;
    }

    /**
     * @param valorDiariaLocacao the valorDiariaLocacao to set
     */
    public void setValorDiariaLocacao(double valorDiariaLocacao) {
        this.valorDiariaLocacao = valorDiariaLocacao;
    }

    /**
     * @return the locado
     */
    public boolean isLocado() {
        return locado;
    }

    /**
     * @param locado the locado to set
     */
    public void setLocado(boolean locado) {
        this.locado = locado;
    }
}
