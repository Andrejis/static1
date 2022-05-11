public class Auto {

    private String aFarba;

    //statický atribút bude pre všetkých rovnaký

    private static String aAutomobilka = "KIA";

    private int aNajazdeneKilometre;

    private static int aPocetVyrobenychAut;



    public Auto(String aFarba) {

        this.aFarba = aFarba;

        this.aNajazdeneKilometre = 0;

        this.aPocetVyrobenychAut++;

    }



    public String getaFarba() {

        return aFarba;

    }



    public void setaFarba(String aFarba) {

        this.aFarba = aFarba;

    }



    public static String getaAutomobilka() {

        return aAutomobilka;

    }



    public static void setaAutomobilka(String aAutomobilka) {

        Auto.aAutomobilka = aAutomobilka;

    }



    public int getaNajazdeneKilometre() {

        return aNajazdeneKilometre;

    }



    public static int getaPocetVyrobenychAut() {

        return aPocetVyrobenychAut;

    }

}