package ejercicio;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregarContacto(new Contacto("Ana", "123", "ana@mail.com", true));
        agenda.agregarContacto(new Contacto("Luis", "456", "luis@mail.com", false));
        agenda.agregarContacto(new Contacto("Carlos", "789", "carlos@mail.com", true));
        agenda.agregarContacto(new Contacto("Ana", "123", "ana2@mail.com", false)); // duplicado

        // Mostrar todos
        agenda.exportarContactos();

        // Buscar
        System.out.println("\nBuscar 'Ana':");
        System.out.println(agenda.buscarPorNombre("Ana"));

        // Favoritos
        System.out.println("\nFavoritos:");
        System.out.println(agenda.filtrarFavoritos());

        // Ordenar
        agenda.ordenarAlfabeticamente();
        System.out.println("\nOrdenados:");
        agenda.exportarContactos();

        // Duplicados
        System.out.println("\nDuplicados:");
        System.out.println(agenda.detectarDuplicados());
    }
}