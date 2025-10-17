public class Paciente {
    private String codigo;
    private String nombre;
    private int edad;
    private String numeroDocumento;
    //Constructor
    public Paciente(String codigo, String nombre, int edad, String numeroDocumento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDocumento = numeroDocumento;
    }
    //GETTERS
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getNumeroDocumento() { return numeroDocumento; }
    //SETTERS
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }    
    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Paciente{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                '}';
    }
}
