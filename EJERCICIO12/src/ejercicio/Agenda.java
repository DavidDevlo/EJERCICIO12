package ejercicio;

import java.util.*;

class Agenda {
    private ArrayList<Contacto> agenda = new ArrayList<>();

    // Agregar contacto
    public void agregarContacto(Contacto c) {
        agenda.add(c);
    }

    // Buscar por nombre (parcial)
    public List<Contacto> buscarPorNombre(String nombre) {
        List<Contacto> resultados = new ArrayList<>();
        for (Contacto c : agenda) {
            if (c.nombre.toLowerCase().contains(nombre.toLowerCase())) {
                resultados.add(c);
            }
        }
        return resultados;
    }

    // Filtrar favoritos
    public List<Contacto> filtrarFavoritos() {
        List<Contacto> favoritos = new ArrayList<>();
        for (Contacto c : agenda) {
            if (c.esFavorito) {
                favoritos.add(c);
            }
        }
        return favoritos;
    }

    // Ordenar alfabéticamente (usa Comparable)
    public void ordenarAlfabeticamente() {
        Collections.sort(agenda);
    }

    // Ordenar por teléfono (Comparator alternativo)
    public void ordenarPorTelefono() {
        agenda.sort(Comparator.comparing(c -> c.telefono));
    }

    // Exportar contactos (simulación en consola)
    public void exportarContactos() {
        System.out.println("=== CONTACTOS ===");
        for (Contacto c : agenda) {
            System.out.println(c);
        }
    }

    // Detectar duplicados (por nombre + teléfono)
    public Set<String> detectarDuplicados() {
        Set<String> vistos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (Contacto c : agenda) {
            String clave = c.nombre.toLowerCase() + "-" + c.telefono;
            if (!vistos.add(clave)) {
                duplicados.add(clave);
            }
        }
        return duplicados;
    }
}