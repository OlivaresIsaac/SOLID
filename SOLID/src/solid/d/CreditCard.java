/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.d;

/**
 *
 * @author isaac
 */
public class CreditCard implements PaymentForm{

    @Override
    public String getPaymentInfo() {
        return "La información de su tarjeta de crédito es ...";
    }
    
}
