/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class ClientesDados {
    public static List<Cliente> lstClientes = new ArrayList<Cliente>();
    
    public static Cliente obterPessoaPeloNomeExato(String nome, List<Cliente> clientes){
        
        for (Cliente cliente : clientes) {
            if(cliente.getNome().equals(nome)){
                return cliente;
            }
        }        
        
        return null;
    }
    

    public static List<Cliente> obterCPFOuCNPJParcial(String CPFOuCNPJ, List<Cliente> clientes){
        
        List<Cliente> clienteTemp = new ArrayList<>();
        
        for (Cliente cliente : clientes) {
                String cpfOuCNPJemp = cliente.getCPFOuCNPJ().replaceAll("[^0-9]+", ""); 
                // retira da string tudo que não for número
                String compararBusca = CPFOuCNPJ.replaceAll("[^0-9]+", "");
                if(cpfOuCNPJemp.contains(compararBusca)== true){
                    clienteTemp.add(cliente);
                }
            }
        return clienteTemp;
                
    }
    
    public static List<Cliente> obterPessoaPeloNomeParcial(String nome, List<Cliente> clientes, boolean caseSensitive){
        
        List<Cliente> clienteTemp = new ArrayList<>();
        
        for (Cliente cliente : clientes) {
            
            if(caseSensitive){
                if(cliente.getNome().contains(nome)){
                    clienteTemp.add(cliente);
                }
            }else{
                if(cliente.getNome().toLowerCase().contains(nome.toLowerCase())){
                    clienteTemp.add(cliente);
                }
            }
        }        
        
        return clienteTemp;
    }
}
