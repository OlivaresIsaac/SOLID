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
import solid.l.Animal;
import solid.l.Dog;
import solid.l.Elephant;
import solid.l.LightAnimal;
import solid.o.Car;
import solid.o.Truck;
import solid.o.Vehicle;
import solid.s.StorePrinter;

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
     * Demostración de principio de segregación de interfaz Se tiene interfaz
     * basicProducts, con los métodos básicos, pero existen productos con un
     * parametro de restriccion de edad, asi que se crea una segunda interfaz
     * ageRestriction, y se hace que dichas clases implementen tanto
     * basicProduct como ageRestriction, evitando asi que existan clases
     * obligadas a crear métodos que no necesitan por la culpa de una interfaz
     * mal planteada
     *
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

    /**
     * Demostración de principio de sustitución de Liskov Tanto perro como
     * elefante heredan de animal, y ambos pueden caminar
     *
     * @param animal
     */
    public void walkAnimal(Animal animal) {
        JOptionPane.showMessageDialog(null, animal.walk());
    }

    public void getAnimalToWalk(String animal) {
        switch (animal) {
            case "Perro":
                Dog dog = new Dog();
                walkAnimal(dog);
                break;
            case "Elefante":
                Elephant elephant = new Elephant();
                walkAnimal(elephant);
                break;
            default:
                break;
        }
    }

    /**
     * Demostración de principio de sustitución de Liskov En este caso, solo el
     * perro, que hereda de lightAnimal puede saltar, asi que se define la
     * función jumpLightAnimal para que reciba solo objetos de la clase
     * LightAnimal, excluyendo al elefante que es clase animal
     *
     * @param animal
     */
    public void jumpLigthAnimal(LightAnimal animal) {
        JOptionPane.showMessageDialog(null, animal.jump());
    }

    /**
     * Demostración de principio de sustitución de Liskov Como solo las
     * instancias de clase animal no tienen definido su método salto, definimos
     * una función que avise al usuario sobre esto por si los intenta hacer
     * saltar Esto es por motivos de la demostración, puesto que lo ideal seria
     * ni siquiera permitir la opción de hacer saltar a animales como el
     * elefante
     *
     * @param animal
     */
    public void tryToJumpAnimal(Animal animal) {
        String msg = "El " + animal.getName() + " no puede saltar, es muy pesado";
        JOptionPane.showMessageDialog(null, msg);
    }

    /**
     * Demostración de principio de abierto/cerrado Se define una interfaz
     * vehiculo, la cual se plantea que no sea modificada esta modela el
     * comportamiento de dibujar cada vehiculo que implemente la interfaz, por
     * ende, el programa está abierto a la expansión, simplemente añadiendo
     * nuevas clases que usen la interfaz, y definiendo sus métodos draw
     * propios;
     *
     * @param vehicle
     */
    public void drawVehicle(Vehicle vehicle) {
        JOptionPane.showMessageDialog(null, vehicle.getDraw());
    }

    public void getVehicleToDraw(String vehicle) {
        switch (vehicle) {
            case "Carro":
                Car car = new Car();
                drawVehicle(car);
                break;
            case "Camión":
                Truck truck = new Truck();
                drawVehicle(truck);
                break;
            default:
                break;
        }
    }
    /**
     * Demostración de principio de responsabilidad única
     * Se tiene una clase Store, con únicamente su lógica de funcionamiento, 
     * esa es su responsabilidad; paralelamente, se crea una clase StorePrinter,
     * que se encarga de imprimir de diversas formas según conveniencia la info de Store,
     * siendo esa su única responsabilidad, y así evitando que la clase Store tenga su lógica
     * funcional y su lógica de presentación a la vez
     *
     * @param printer
     * @param option
     */
    public void printStoreInfo(StorePrinter printer, int option) {
        switch (option) {
            case 0:
                printer.printInConsole();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, printer.printForUserInRows());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, printer.printForUserOneRow());
                break;
            default:
                break;
        }
    }
}
