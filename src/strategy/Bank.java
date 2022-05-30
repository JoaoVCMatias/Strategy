/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaov
 */
public class Bank implements IBank {
    
    private List<String> contas = new ArrayList<String>();

    public Bank() {
        this.contas.add("111222");
        this.contas.add("222333");
        this.contas.add("333444");
        this.contas.add("444555");
        this.contas.add("555666");
        this.contas.add("666777");
        
    }
    @Override
    public Boolean checkerAccount(String account){
        if(this.contas.contains(account)){
            System.out.println("Compra realizada com sucesso");
            return true;
        }
        System.out.println("Numero da conta invalido");
        return false;
    }
    
    
}
