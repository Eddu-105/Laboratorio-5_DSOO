public class Cita {
    private String codigoCita;
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String hora;
    private String estado;
    //Constructor
    public Cita(String codigoCita, Paciente paciente, Doctor doctor, String fecha, String hora) {
        this.codigoCita = codigoCita;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = "pendiente";
    }
    //GETTERS
    public String getCodigoCita() { return codigoCita; }
    public Paciente getPaciente() { return paciente; }
    public Doctor getDoctor() { return doctor; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getEstado() { return estado; }
    //SETTERS
    public void setCodigoCita(String codigoCita) { this.codigoCita = codigoCita; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setHora(String hora) { this.hora = hora; }
    public void setEstado(String estado) { this.estado = estado; }
    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Cita{" +
                "codigoCita='" + codigoCita + '\'' +
                ", paciente=" + paciente.getNombre() +
                ", doctor=" + doctor.getNombre() +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}