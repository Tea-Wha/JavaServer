package Generic프린터;

public class GenericMain {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder()); // Powder 형태 / Powder 클래스 연결
        Powder powder = powderPrinter.getMaterial();
        powderPrinter.printing();
        System.out.println(powderPrinter);
        System.out.println(powder.toString());


        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic()); // Plastic 형태 / Plastic 클래스 연결
        Plastic plastic = plasticPrinter.getMaterial();
        plasticPrinter.printing();
        System.out.println(plastic.toString());

        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<Nylon>();
    }
}
