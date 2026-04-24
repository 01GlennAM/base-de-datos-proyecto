package com.example;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
          // 📌 1. Crear Categoria
        Categoria categoria = new Categoria(1, "Programación", "Cursos de desarrollo");
        System.out.println("Nombre de la categoria: " + categoria.getNombre()); 
        System.out.println("Descripción: " + categoria.getDescripcion()); 
        
        // 📌 2. Crear Usuario (Instructor)
        Usuario instructor = new Usuario(
                1,
                "Carlos",
                "carlos@email.com",
                "1234",
                new Date(System.currentTimeMillis()),
                new Date(System.currentTimeMillis()),
                true
        );

        System.out.println("Nombre instructor: " + instructor.getNombre()); 


         // 📌 3. Crear Curso
        Curso curso = new Curso(
                1,
                "Java desde cero",
                "Aprende Java básico",
                "url",
                100.0,
                true,
                instructor,
                new Date(System.currentTimeMillis()),
                new Date(System.currentTimeMillis()),
                categoria
        );

        System.out.println("Titulo del Curso: " + curso.getTitulo());
        System.out.println("Descripción del Curso: " + curso.getDescripcion()); 
           for (Modulo m : curso.getModulos()) {
            System.out.println(" Módulo: " + m.getTitulo());

            for (Leccion lec : m.getLecciones()) {
                System.out.println("   Lección: " + lec.getTitulo());
            }
        } 


        // 📌 4. Crear Modulo
        Modulo modulo1 = new Modulo(1, "Introducción", "Bases", 1, curso);

        for (Modulo m : curso.getModulos()) {
                System.out.println(" Módulo: " + m.getTitulo());

        for (Leccion lec : m.getLecciones()) {
                System.out.println("   Lección: " + lec.getTitulo());
            }
        } 

        // 📌 5. Crear Lecciones
        Leccion l1 = new Leccion(1, "¿Qué es Java?", "Intro", "url1", 10, 1, modulo1);
        Leccion l2 = new Leccion(2, "Variables", "Tipos", "url2", 15, 2, modulo1);

        // 📌 6. Relacionar
        modulo1.agregarLeccion(l1);
        modulo1.agregarLeccion(l2);
        curso.agregarModulo(modulo1);

        // 📌 7. Crear Usuario estudiante
        Usuario estudiante = new Usuario(
                2,
                "Ana",
                "ana@email.com",
                "1234",
                new Date(System.currentTimeMillis()),
                new Date(System.currentTimeMillis()),
                true
        );

        // 📌 8. Inscripción
        Inscripcion inscripcion = new Inscripcion(
                1,
                estudiante,
                curso,
                new Date(System.currentTimeMillis()),
                Inscripcion.EstadoInscripcion.ACTIVA,
                0,
                Inscripcion.Nivel.BASICO,
                100.0
        );

        // 📌 9. Progreso
        ProgresoLeccion progreso1 = new ProgresoLeccion(
                inscripcion,
                l1,
                true,
                new Date(System.currentTimeMillis())
        );

        ProgresoLeccion progreso2 = new ProgresoLeccion(
                inscripcion,
                l2,
                false,
                null
        );

        // 📌 10. Mostrar resultados

        System.out.println("\nEstudiante: " + estudiante.getNombre());
        System.out.println("Estado inscripción: " + inscripcion.getEstado());
        System.out.println("\nProgreso:");
        System.out.println("Lección 1 completada: " + progreso1.isCompletado());
        System.out.println("Lección 2 completada: " + progreso2.isCompletado());
    }
}
    
