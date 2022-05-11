public class Sportovec {

    private String aMeno;

    private String aVyslednyCas;

    private static int aPocetSportovcov;

    private static String aSport = "Beh";



    public Sportovec(String aMeno, String aVyslednyCas) {

        this.aMeno = aMeno;

        this.aVyslednyCas = aVyslednyCas;

        aPocetSportovcov++;

    }



    public String getaMeno() {

        return aMeno;

    }



    public void setaMeno(String aMeno) {

        this.aMeno = aMeno;

    }



    public String getaVyslednyCas() {

        return aVyslednyCas;

    }



    public void setaVyslednyCas(String aVyslednyCas) {

        this.aVyslednyCas = aVyslednyCas;

    }



    public static int getaPocetSportovcov() {

        return aPocetSportovcov;

    }



    public static void setaPocetSportovcov(int aPocetSportovcov) {

        Sportovec.aPocetSportovcov = aPocetSportovcov;

    }

    public void VypisInfo (){

        System.out.println("Športovec " + aMeno + " s časom " + aVyslednyCas + " z pomedzi " + aPocetSportovcov + " súťažiacich " + " v disciplíne " + aSport);

    }

}