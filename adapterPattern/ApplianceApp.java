
public class ApplianceApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet ltPo = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refPo = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet spPo = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(ltPo.plugIn());
        System.out.println(refPo.plugIn());
        System.out.println(spPo.plugIn());
        
       
    }
}