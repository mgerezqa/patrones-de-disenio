public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TipoDeSuscripcionFactory fabrica = new TipoDeSuscripcionFactory();
        TipoDeSuscripcion unaSuscripcion = fabrica.crearSuscripcion(eTipoDeSuscripcion.POR_CANTIDAD_DE_VIANDAS_DISP);
        //casteo a la clase SuscripcionPorCantidadDeViandasDisp
        SuscripcionPorCantidadDeViandasDisp suscripcion = (SuscripcionPorCantidadDeViandasDisp) unaSuscripcion;
        suscripcion.setCantidadDeViandasDisp(10);

        //casteo directo a la clase SuscripcionPorCantidadDeViandasHastaAlcMax
        SuscripcionPorCantidadDeViandasHastaAlcMax otraSuscripcion = (SuscripcionPorCantidadDeViandasHastaAlcMax)fabrica.crearSuscripcion(eTipoDeSuscripcion.POR_CANTIDAD_DE_VIANDAS_HASTA_ALC_MAX);
        otraSuscripcion.setCantidadDeViandasHastaAlcMax(10);


    }
}
