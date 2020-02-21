/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Leandro
 */
public class Locacao {
    private int codigo;
    private LocalDate dtLocacao;
    private LocalDate dtEntrega;
    private LocalDateTime exclusão;
    private long qtdDiasLocado;
    private double valorTotalLocacao;
    private Carro carro;
    private Cliente cliente;
    
    public  Locacao(){
        Random aleatorio = new Random();
        this.codigo = aleatorio.nextInt(999999);
    }
    
    public double calcularCusto(){ //calcula o custo de locação baseado nos dias locados
        LocalDate dataAtual =LocalDate.now();
      if(dataAtual.isBefore(dtLocacao)){
          return 0;
      }else if(cliente.getDtNascOuDesc().contains("/")){ // verifica se é data ou desconto (PF ou PJ)
          
            this.qtdDiasLocado = ChronoUnit.DAYS.between(dtLocacao, dataAtual);
            this.valorTotalLocacao = this.qtdDiasLocado * this.carro.getValorDiariaLocacao();
            return valorTotalLocacao;
            
      }else{
          
          double desconto = Double.parseDouble(cliente.getDtNascOuDesc());
          this.qtdDiasLocado = ChronoUnit.DAYS.between(dtLocacao, dataAtual);
          this.valorTotalLocacao = (this.qtdDiasLocado * this.carro.getValorDiariaLocacao())*((100 - desconto)/100);
          return valorTotalLocacao;
      }
       
    
        
    }
    public long diasLocados(){
        LocalDate dataAtual =LocalDate.now();
        
        long dias = ChronoUnit.DAYS.between(dtLocacao, dataAtual);
        return dias;
    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dtLocacao
     */
    public LocalDate getDtLocacao() {
        return dtLocacao;
    }

    /**
     * @param dtLocacao the dtLocacao to set
     */
    public void setDtLocacao(LocalDate dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    /**
     * @return the dtEntrega
     */
    public LocalDate getDtEntrega() {
        return dtEntrega;
    }

    /**
     * @param dtEntrega the dtEntrega to set
     */
    public void setDtEntrega(LocalDate dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    /**
     * @return the qtdDiasLocado
     */
    public long getQtdDiasLocado() {
        return qtdDiasLocado;
    }

    /**
     * @param qtdDiasLocado the qtdDiasLocado to set
     */
    public void setQtdDiasLocado(long qtdDiasLocado) {
        this.qtdDiasLocado = qtdDiasLocado;
    }

    /**
     * @return the valorTotalLocacao
     */
    public double getValorTotalLocacao() {
        return valorTotalLocacao;
    }

    /**
     * @param valorTotalLocacao the valorTotalLocacao to set
     */
    public void setValorTotalLocacao(double valorTotalLocacao) {
        this.valorTotalLocacao = valorTotalLocacao;
    }

    /**
     * @return the carro
     */
    public Carro getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the exclusão
     */
    public LocalDateTime getExclusão() {
        return exclusão;
    }

    /**
     * @param exclusão the exclusão to set
     */
    public void setExclusão(LocalDateTime exclusão) {
        this.exclusão = exclusão;
    }
}
