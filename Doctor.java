public class Doctor {
    private String codigo;
    private String nombre;
    private String especialidad;
    private String horarioAtencion;
    //Constructor
    public Doctor(String codigo, String nombre, String especialidad, String horarioAtencion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horarioAtencion = horarioAtencion;
    }
    //GETTERS
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public String getHorarioAtencion() { return horarioAtencion; }
    //SETTERS
    public void setCodigo(String codigo) { this.codigo = codigo; }   
    public void setNombre(String nombre) { this.nombre = nombre; }    
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public void setHorarioAtencion(String horarioAtencion) { this.horarioAtencion = horarioAtencion; }
    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Doctor{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", horarioAtencion='" + horarioAtencion + '\'' +
                '}';
    }
}