package TemplatePattern;

public class NetOrder extends OrderProcess {

    @Override
    public void doSelect(){ 
        System.out.println("Item adde to cart..."); 
        System.out.println("Get gift wrap preferences..."); 
        System.out.println("Get delivery address..."); 
    } 
  
    @Override
    public void doPayment(){ 
        System.out.println("Online Payment through Netbanking, debit/credit card or Paytm"); 
    } 
  
    @Override
    public void doDelivery(){ 
        System.out.println("Ship the item through post to delivery address"); 
    } 
}
