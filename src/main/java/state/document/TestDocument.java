package state.document;

public class TestDocument {
    public static void main(String[] args) {
        Persona pepe = new Persona("Pepe");
        Document document = new Document("Biblia", pepe);

        /*bucle que no pasa moderación*/
        System.out.println(document);
        System.out.println(pepe);
        document.publish();
        System.out.println(document);
        document.publish();
        System.out.println(document);
        /*bucle que si pasa moderación*/
        pepe.setRolAsignado(new Administrador());
        System.out.println(pepe);
        document.publish();
        System.out.println(document);

    }
}
