import java.util.*;

public class Hospital {
    private ArrayList<Doctor> doctores;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Cita> citas;
    
    public Hospital() {
        this.doctores = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
    }
    
    public boolean registrarDoctor(Doctor doctor) {
        for (Doctor d : doctores) {
            if (d.getCodigo().equals(doctor.getCodigo())) {
                System.out.println("Error: Ya existe un doctor con ese código");
                return false;
            }
        }
        doctores.add(doctor);
        System.out.println("Doctor registrado exitosamente");
        return true;
    }
    
    public boolean registrarPaciente(Paciente paciente) {
        if (paciente.getEdad() <= 0) {
            System.out.println("Error: La edad debe ser mayor que 0");
            return false;
        }
        
        for (Paciente p : pacientes) {
            if (p.getNumeroDocumento().equals(paciente.getNumeroDocumento())) {
                System.out.println("Error: Ya existe un paciente con ese número de documento");
                return false;
            }
        }
        pacientes.add(paciente);
        System.out.println("Paciente registrado exitosamente");
        return true;
    }
    
    public boolean registrarCita(Cita cita) {
        if (!Validador.validarFecha(cita.getFecha())) {
            System.out.println("Error: Formato de fecha inválido (debe ser dd/MM/yyyy)");
            return false;
        }
        
        if (!Validador.validarHora(cita.getHora())) {
            System.out.println("Error: Formato de hora inválido (debe ser HH:mm)");
            return false;
        }
        
        for (Cita c : citas) {
            if (c.getDoctor().getCodigo().equals(cita.getDoctor().getCodigo()) &&
                c.getFecha().equals(cita.getFecha()) &&
                c.getHora().equals(cita.getHora())) {
                System.out.println("Error: El doctor ya tiene una cita a esa hora");
                return false;
            }
        }
        
        citas.add(cita);
        System.out.println("Cita registrada exitosamente");
        return true;
    }
    
    public boolean cambiarEstadoCita(String codigoCita, String nuevoEstado) {
        for (Cita c : citas) {
            if (c.getCodigoCita().equals(codigoCita)) {
                c.setEstado(nuevoEstado);
                System.out.println("Estado de la cita actualizado a: " + nuevoEstado);
                return true;
            }
        }
        System.out.println("Error: No se encontró la cita con ese código");
        return false;
    }
    
    public void mostrarTodasLasCitas() {
        System.out.println("\n=== TODAS LAS CITAS ===");
        if (citas.isEmpty()) {
            System.out.println("No hay citas registradas");
            return;
        }
        for (Cita c : citas) {
            System.out.println(c);
        }
    }
    
    public void listarCitasPorDoctor(String codigoDoctor) {
        System.out.println("\n=== CITAS DEL DOCTOR " + codigoDoctor + " ===");
        boolean encontrado = false;
        for (Cita c : citas) {
            if (c.getDoctor().getCodigo().equals(codigoDoctor)) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron citas para ese doctor");
        }
    }
    
    public void listarCitasPorPaciente(String codigoPaciente) {
        System.out.println("\n=== CITAS DEL PACIENTE " + codigoPaciente + " ===");
        boolean encontrado = false;
        for (Cita c : citas) {
            if (c.getPaciente().getCodigo().equals(codigoPaciente)) {
                System.out.println(c);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron citas para ese paciente");
        }
    }
    
    public void mostrarEstadisticas() {
        int atendidas = 0;
        int canceladas = 0;
        int pendientes = 0;
        
        for (Cita c : citas) {
            switch (c.getEstado().toLowerCase()) {
                case "atendida":
                    atendidas++;
                    break;
                case "cancelada":
                    canceladas++;
                    break;
                case "pendiente":
                    pendientes++;
                    break;
            }
        }
        
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Total de citas: " + citas.size());
        System.out.println("Citas atendidas: " + atendidas);
        System.out.println("Citas canceladas: " + canceladas);
        System.out.println("Citas pendientes: " + pendientes);
    }
    
    public Doctor buscarDoctor(String codigo) {
        for (Doctor d : doctores) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }
    
    public Paciente buscarPaciente(String codigo) {
        for (Paciente p : pacientes) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
    
    public void listarDoctores() {
        System.out.println("\n=== LISTA DE DOCTORES ===");
        if (doctores.isEmpty()) {
            System.out.println("No hay doctores registrados");
            return;
        }
        for (Doctor d : doctores) {
            System.out.println(d);
        }
    }
    
    public void listarPacientes() {
        System.out.println("\n=== LISTA DE PACIENTES ===");
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados");
            return;
        }
        for (Paciente p : pacientes) {
            System.out.println(p);
        }
    }
}