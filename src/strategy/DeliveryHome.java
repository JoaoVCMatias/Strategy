/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import static strategy.app.teclado;

/**
 *
 * @author 201911240039
 */
public class DeliveryHome implements IDeliveryStrategy{
    private IBank bank;
    private Home home;

    public DeliveryHome() {
        this.home = new Home();
        this.bank = new Bank();
    }
    
    public DeliveryHome(IBank bak) {
        this.home = new Home();
        this.bank = bank;
    }
    
    @Override
    public boolean payDelivery() {
        System.out.println("Digite o numero da conta: "); 
        return this.bank.checkerAccount(teclado.next());
                
    }
    public void insertHome(){
        System.out.println("Digite o numero da rua: ");
        setNomeRua(teclado.next());
        System.out.println("Digite o nome do bairro: ");
        setNomeBairro(teclado.next());
        System.out.println("Digite o cep: ");
        setCep(teclado.nextInt());
        System.out.println("Digite o numero da casa: ");
        setNumeroCasa(teclado.nextInt());
    }

    @Override
    public void collectDeliveryDetails() {
        insertHome();
        payDelivery();
    }
    
    private void setNomeRua(String value){
        this.home.setNomeRua(value);
        System.out.println(this.home.getNomeRua());
    }
    private void setNomeBairro(String value){
        this.home.setNomeBairro(value);
    }
    private void setCep(int a){
        this.home.setCep(a);
    }
    private void setNumeroCasa(int a){
        this.home.setNumeroCasa(a);
    }
    
}
