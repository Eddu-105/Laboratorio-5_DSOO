import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        
        // Registrar Doctores
        Doctor doc1 = new Doctor("D001", "Dr. Juan Pérez", "Cardiología", "08:00-14:00");
        Doctor doc2 = new Doctor("D002", "Dra. María López", "Pediatría", "09:00-15:00");
        Doctor doc3 = new Doctor("D003", "Dr. Carlos Ruiz", "Traumatología", "10:00-16:00");
        Doctor doc4 = new Doctor("D004", "Dra. Ana García", "Dermatología", "08:00-13:00");
        
        hospital.registrarDoctor(doc1);
        hospital.registrarDoctor(doc2);
        hospital.registrarDoctor(doc3);
        hospital.registrarDoctor(doc4);
        
        // Registrar Pacientes
        Paciente pac1 = new Paciente("P001", "Luis Martínez", 45, "12345678");
        Paciente pac2 = new Paciente("P002", "Carmen Flores", 32, "87654321");
        Paciente pac3 = new Paciente("P003", "Roberto Silva", 28, "11223344");
        Paciente pac4 = new Paciente("P004", "Elena Torres", 55, "55667788");
        Paciente pac5 = new Paciente("P005", "Miguel Ángel Soto", 38, "99887766");
        
        hospital.registrarPaciente(pac1);
        hospital.registrarPaciente(pac2);
        hospital.registrarPaciente(pac3);
        hospital.registrarPaciente(pac4);
        hospital.registrarPaciente(pac5);
        
        // Registrar Citas
        Cita cita1 = new Cita("C001", pac1, doc1, "20/10/2025", "09:00");
        Cita cita2 = new Cita("C002", pac2, doc2, "20/10/2025", "10:00");
        Cita cita3 = new Cita("C003", pac3, doc3, "21/10/2025", "11:00");
        Cita cita4 = new Cita("C004", pac4, doc1, "21/10/2025", "09:00");
        Cita cita5 = new Cita("C005", pac5, doc4, "22/10/2025", "08:30");
        Cita cita6 = new Cita("C006", pac1, doc2, "22/10/2025", "14:00");
        
        hospital.registrarCita(cita1);
        hospital.registrarCita(cita2);
        hospital.registrarCita(cita3);
        hospital.registrarCita(cita4);
        hospital.registrarCita(cita5);
        hospital.registrarCita(cita6);
        
        // Cambiar algunos estados de citas
        hospital.cambiarEstadoCita("C001", "atendida");
        hospital.cambiarEstadoCita("C002", "atendida");
        hospital.cambiarEstadoCita("C003", "cancelada");
        
        System.out.println("\n=== DATOS CARGADOS EXITOSAMENTE ===\n");       
        
        // Mostrar lista de doctores
        hospital.listarDoctores();
        
        // Mostrar lista de pacientes
        hospital.listarPacientes();
        
        // Mostrar todas las citas
        hospital.mostrarTodasLasCitas();
        
        // Mostrar citas por doctor específico
        hospital.listarCitasPorDoctor("D001");
        hospital.listarCitasPorDoctor("D002");
        
        // Mostrar citas por paciente específico
        hospital.listarCitasPorPaciente("P001");
        hospital.listarCitasPorPaciente("P002");
        
        // Mostrar estadísticas
        hospital.mostrarEstadisticas();
        
        System.out.println("\n=== FIN DEL REPORTE ===");
        
        scanner.close();
    }
}