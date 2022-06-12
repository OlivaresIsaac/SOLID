/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import javax.swing.JOptionPane;
import solid.d.PayPal;
import solid.d.CreditCard;
import solid.d.DebitCard;
import solid.d.MobilePay;
import solid.d.PaymentForm;
import solid.i.BasicProduct;
import solid.i.BlueRay;
import solid.i.DVD;
import solid.i.GameBoy;
import solid.i.PSP;

/**
 *
 * @author isaac
 */
public class Functions {

    MainPage page = new MainPage();

    public void runApp() {
        page.setVisible(true);
    }

    /**
     * Demostración principio de inversión de la dependencia Se pide como
     * parámetro cualquier objeto que cumpla con la interfaz PaymentForm permite
     * escalar el proyecto facilmente si se necesitan agregar nuevos métodos de
     * pago y hace que la función no dependa de instancias de cualquier clase de
     * método de pago
     *
     * @param payment
     */
    public void payProducts(PaymentForm payment) {
        String msg = "Gracias por su compra: \n";
        msg += payment.getPaymentInfo();
        JOptionPane.showMessageDialog(null, msg);
    }

    public void getPaymentForm(String payment) {
        switch (payment) {
            case "Paypal":
                PayPal paypal = new PayPal();
                payProducts(paypal);
                break;
            case "Tarjeta de crédito":
                CreditCard creditCard = new CreditCard();
                payProducts(creditCard);
                break;
            case "Tarjeta de débito":
                DebitCard debitCard = new DebitCard();
                payProducts(debitCard);
                break;
            case "Pago móvil":
                MobilePay mobilePay = new MobilePay();
                payProducts(mobilePay);
                break;
            default:
                break;
        }
    }
    
    /**
     * Demostración de principio de segregación de interfaz
     * Se tiene interfaz basicProducts, con los métodos básicos, 
     * pero existen productos con un parametro de restriccion de edad,
     * asi que se crea una segunda interfaz ageRestriction, y se hace que dichas clases
     * implementen tanto basicProduct como ageRestriction, evitando asi que existan clases 
     * obligadas a crear métodos que no necesitan por la culpa de una interfaz mal planteada
     * @param product
     */
    public void showProductInfo(BasicProduct product) {
        JOptionPane.showMessageDialog(null, product.getInfo());
    }
    
    public void getProduct(String product) {
         switch (product) {
            case "PSP":
                PSP psp = new PSP();
                showProductInfo(psp);
                break;
            case "GameBoy":
                GameBoy gameBoy = new GameBoy();
                showProductInfo(gameBoy);
                break;
            case "BlueRay":
                BlueRay blueRay = new BlueRay();
                showProductInfo(blueRay);
                break;
            case "DVD":
                DVD dvd = new DVD();
                showProductInfo(dvd);
                break;
            default:
                break;
        }
    }
}
