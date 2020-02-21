/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Locacao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class LocacaoDados {
 
    public static List<Locacao> lstLocacao = new ArrayList<Locacao>();
    
    public static Locacao obterLocacaoPeloCodigo(int codigo, List<Locacao> locacoes){
        
        for (Locacao locacao : locacoes) {
            if(locacao.getCodigo()== codigo){
                return locacao;
            }
        }        
        
        return null;
    }
    
    public static List<Locacao> obterCPFOuCNPJParcial(String CPFOuCNPJ, List<Locacao> locacoes){
        
        List<Locacao> locTemp = new ArrayList<>();
        
        for (Locacao loc : locacoes) {
                String cpfOuCNPJemp = loc.getCliente().getCPFOuCNPJ().replaceAll("[^0-9]+", ""); 
                // retira da string tudo que não for número
                String compararBusca = CPFOuCNPJ.replaceAll("[^0-9]+", "");
                if(cpfOuCNPJemp.contains(compararBusca)== true){
                    locTemp.add(loc);
                }
            }
        return locTemp;
                
    }
    
        public static List<Locacao> obterPlacaParcial(String placa,List<Locacao> Locacaos,boolean caseSensitive){
        List<Locacao> carTemp = new ArrayList<>();
        for (Locacao Locacao : Locacaos) {
            if(caseSensitive){
                if(Locacao.getCarro().getPlaca().contains(placa)){
                    carTemp.add(Locacao);
                }
            }else{
                if(Locacao.getCarro().getPlaca().toLowerCase().contains(placa.toLowerCase())){
                    carTemp.add(Locacao);
                }
            }
        }
        return carTemp;
    }
   public static List<Locacao> obterLocacaoPelaData(LocalDate dataInicio, LocalDate dataFim, List<Locacao> Locacaos){
        List<Locacao> locTemp = new ArrayList<>();
 
        for (Locacao locacao : Locacaos) {

           if((dataInicio.isEqual(locacao.getDtLocacao()) && dataFim.isAfter(locacao.getDtLocacao())) || 
                   (dataInicio.isBefore(locacao.getDtLocacao()) && dataFim.isEqual(locacao.getDtLocacao()))
                || (dataInicio.isBefore(locacao.getDtLocacao()) && dataFim.isAfter(locacao.getDtLocacao()))
                   ||(dataInicio.isEqual(locacao.getDtLocacao()) &&dataFim.isEqual(locacao.getDtLocacao()))){
             
                   locTemp.add(locacao);
               
               
           }
           
       }
        return locTemp; 
     }
   public static double locacoesNaTela(List<Locacao> locacoes){
       Double soma = 0.0;
       for (Locacao locacao : locacoes) {
           if(locacao.getDtEntrega() != null){
                soma += locacao.getValorTotalLocacao();
           }
          
                   
                 
       }
       return soma;
   }
   public static double subTotal(List<Locacao> locacoes){
       Double soma = 0.0;
      // LocalDate dataAtual =LocalDate.now();
       for (Locacao locacao : locacoes) {
                locacao.calcularCusto();
                soma += locacao.calcularCusto();
           
          
                   
                 
       }
       return soma;
   }
}
