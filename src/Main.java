public class Main {

    public static void main(String[] args) {

        /*

        Auto auto1 = new Auto("červené");

        Auto auto2 = new Auto("modré");



        System.out.println("Auto1: " + auto1.getaFarba());

        System.out.println("Auto2: " + auto2.getaFarba());



        System.out.println(Auto.getaAutomobilka());



        auto1.setaFarba("čierne");

        System.out.println("Auto1: " + auto1.getaFarba());

        System.out.println("Auto2: " + auto2.getaFarba());



        Auto.setaAutomobilka("Škoda");

        System.out.println(Auto.getaAutomobilka());





        Auto a1 = new Auto("modré");

        System.out.println(a1.getaNajazdeneKilometre() + "km");

        System.out.println(Auto.getaPocetVyrobenychAut());



        Auto a2 = new Auto("modré");

        System.out.println(a2.getaNajazdeneKilometre() + "km");

        System.out.println(Auto.getaPocetVyrobenychAut());



        Auto a3 = new Auto("modré");

        System.out.println(a3.getaNajazdeneKilometre() + "km");

        System.out.println(Auto.getaPocetVyrobenychAut());



        Auto a4 = new Auto("modré");

        System.out.println(a4.getaNajazdeneKilometre() + "km");

        System.out.println(Auto.getaPocetVyrobenychAut());



        Auto a5 = new Auto("modré");

        System.out.println(a5.getaNajazdeneKilometre() + "km");

        System.out.println(Auto.getaPocetVyrobenychAut());



         */



        /*

        Sportovec - meno, výsledný čas

                  - statické atribúty: pocetSportovcov, sport



        Main:

         - 3 športovci

         -zmeniť niektoré vysledné časy

         -vypísať ku každému meno, čas, počet športovcov, šport

         */



        Sportovec s1 = new Sportovec("Jozef Tibensky", "13:42:34");

        s1.VypisInfo();

        Sportovec s2 = new Sportovec("Andrej Lukáč", "12:56:13");

        s2.setaVyslednyCas("14:34:57");

        s2.VypisInfo();

        Sportovec s3 = new Sportovec("Boris Nemasny", "11:46:90");

        s3.VypisInfo();

    }

}