/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author facun
 */
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad Nacional");

        // Crear profesores
        Profesor prof1 = new Profesor("P1", "Laura González", "Matemática");
        Profesor prof2 = new Profesor("P2", "Carlos Pérez", "Programación");
        Profesor prof3 = new Profesor("P3", "Ana Torres", "Física");

        // Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Cálculo");
        Curso c3 = new Curso("C103", "Programación I");
        Curso c4 = new Curso("C104", "Física I");
        Curso c5 = new Curso("C105", "Estructura de Datos");

        // Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        // Asignar profesores a cursos
        universidad.asignarProfesorACurso("C101", "P1");
        universidad.asignarProfesorACurso("C102", "P1");
        universidad.asignarProfesorACurso("C103", "P2");
        universidad.asignarProfesorACurso("C104", "P3");
        universidad.asignarProfesorACurso("C105", "P2");

        // Listar cursos y profesores
        universidad.listarCursos();
        universidad.listarProfesores();

        // Cambiar el profesor de un curso
        System.out.println("\nCambio de profesor en el curso C103:");
        universidad.asignarProfesorACurso("C103", "P1");

        // Verificar sincronización
        universidad.listarProfesores();

        // Eliminar curso
        System.out.println("\nEliminando curso C105...");
        universidad.eliminarCurso("C105");
        universidad.listarProfesores();

        // Eliminar profesor
        System.out.println("\nEliminando profesor P3...");
        universidad.eliminarProfesor("P3");
        universidad.listarCursos();

        // Reporte final
        universidad.reporteCantidadCursosPorProfesor();
    }
}

