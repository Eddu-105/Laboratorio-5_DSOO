public class Cita {
    private String codigoCita;
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String hora;
    private String estado;
    
    public Cita(String codigoCita, Paciente paciente, Doctor doctor, String fecha, String hora) {
        this.codigoCita = codigoCita;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = "pendiente";
    }
    
    public String getCodigoCita() {
        return codigoCita;
    }
    
    public void setCodigoCita(String codigoCita) {
        this.codigoCita = codigoCita;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
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