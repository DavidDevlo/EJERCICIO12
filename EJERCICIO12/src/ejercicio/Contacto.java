package ejercicio;

class Contacto implements Comparable<Contacto> {
    String nombre;
    String telefono;
    String email;
    boolean esFavorito;

    public Contacto(String nombre, String telefono, String email, boolean esFavorito) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.esFavorito = esFavorito;
    }

    @Override
    public int compareTo(Contacto otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " | " + telefono + " | " + email +
                (esFavorito ? " ⭐" : "");
    }
}