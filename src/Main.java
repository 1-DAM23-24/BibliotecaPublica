public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro();
        libro.setTitulo("El Señor de los Anillos");
        libro.setIsbn("629274075371");
        libro.setAutor("J.R.R Tolkien");
        libro.setGenero("Fantasia");
        libro.setFechaPublicacion("1954-1977");


        Autor autor = new Autor();
        autor.setNombre("John R.R");
        autor.setApellidos("Tolkien");
        autor.setFechaNacimiento("1892");
        autor.setLocalidadNacimiento("Bloemfontein");


        GeneroLibro generoLibro= new GeneroLibro();
        generoLibro.setNombre("Fantasia");
        generoLibro.setDescripcion("Salvar la Tierra Media");

        Usuario usuario= new Usuario();
        usuario.setNombre("Roberto");
        usuario.setApellidos("Crespo González");
        usuario.setDni("54691205F");
        usuario.setTelefono("665372487");
        usuario.setDireccion("Calle Los Entierros");
        usuario.setPoblacion("Ávila");

    }
}
