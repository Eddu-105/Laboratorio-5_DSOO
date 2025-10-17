public class Paciente {
    private String codigo;
    private String nombre;
    private int edad;
    private String numeroDocumento;
    
    public Paciente(String codigo, String nombre, int edad, String numeroDocumento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDocumento = numeroDocumento;
    }
    
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getNumeroDocumento() { return numeroDocumento; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }    
    
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
