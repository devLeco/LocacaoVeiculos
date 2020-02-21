/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Carro;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Leandro
 */
public class CarrosDados {
    public static List<Carro> lstCarros = new ArrayList<Carro>();
    
    public static Carro obterModelo(String modelo,List<Carro> carros){
        for (Carro carro : carros) {
            if(carro.getModelo().equals(modelo))
                return carro;
        }
        return null;
    }
    
    public static List<Carro> obterPlacaParcial(String placa,List<Carro> carros,boolean caseSensitive){
        List<Carro> carTemp = new ArrayList<>();
        for (Carro carro : carros) {
            if(caseSensitive){
                if(carro.getPlaca().contains(placa)){
                    carTemp.add(carro);
                }
            }else{
                if(carro.getPlaca().toLowerCase().contains(placa.toLowerCase())){
                    carTemp.add(carro);
                }
            }
        }
        return carTemp;
    }
}
