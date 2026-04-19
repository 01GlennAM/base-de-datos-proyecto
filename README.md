# 📚 Sistema de Gestión de Cursos (Java)

## 🧩 Descripción

Este proyecto es una implementación en **Java orientado a objetos** de un sistema de gestión de cursos en línea. Permite modelar entidades como cursos, usuarios, módulos, lecciones, pagos e inscripciones, basándose en un diagrama de clases relacional.

El objetivo principal es practicar conceptos clave de desarrollo de software como:

* Programación Orientada a Objetos (POO)
* Encapsulamiento
* Relaciones entre clases
* Uso de listas (`List`, `ArrayList`)
* Buenas prácticas en diseño de clases

---

## 🏗️ Estructura del Proyecto

El proyecto sigue una estructura típica de Java (Maven):

```
src/
 └── main/
     └── java/
         └── com/example/
             ├── Curso.java
             ├── Usuario.java
             ├── Categoria.java
             ├── Modulo.java
             ├── Leccion.java
             ├── Pago.java
             ├── Inscripcion.java
             ├── ProgresoLeccion.java
             ├── Rol.java
             ├── UsuarioRoles.java
             └── Main.java
```

---

## 📌 Funcionalidades principales

### 👤 Usuario

* Registro de usuarios con:

  * Nombre
  * Email (validado con `@`)
  * Contraseña
* Asociación con:

  * Pagos
  * Inscripciones

### 📖 Curso

* Información básica:

  * Título
  * Descripción
  * URL
  * Precio
* Relación con:

  * Instructor (Usuario)
  * Categoría
  * Módulos

### 📦 Módulos

* Un curso contiene múltiples módulos
* Cada módulo contiene lecciones

### 🎥 Lecciones

* Contenido de aprendizaje:

  * Título
  * URL
  * Duración
  * Orden dentro del módulo

### 💳 Pagos

* Registro de pagos por usuario
* Estado del pago (aprobado/rechazado)

### 📝 Inscripciones

* Relación entre usuario y curso
* Seguimiento del progreso

### 📊 Progreso

* Control del avance en cada lección

---

## 🔗 Relaciones importantes

* Un **Curso** tiene muchos **Módulos**
* Un **Módulo** tiene muchas **Lecciones**
* Un **Usuario** puede tener muchas **Inscripciones**
* Un **Usuario** puede realizar muchos **Pagos**
* Un **Curso** pertenece a una **Categoría**
* Un **Curso** tiene un **Instructor (Usuario)**

---

## 🧠 Conceptos aplicados

* Encapsulamiento (getters/setters)
* Validación de datos (ej: email)
* Uso de listas para relaciones 1 a muchos
* Composición de objetos
* Separación de responsabilidades

---

## ▶️ Ejecución del proyecto

### Requisitos:

* Java JDK 8 o superior
* IDE (VS Code, IntelliJ, Eclipse)

### Pasos:

1. Clonar el repositorio:

```bash
git clone https://github.com/tu-usuario/tu-repositorio.git
```

2. Abrir el proyecto en tu IDE

3. Ejecutar la clase `Main.java`

---

## 🛠️ Ejemplo de uso

```java
Usuario instructor = new Usuario(...);
Categoria categoria = new Categoria(...);

Curso curso = new Curso(
    1,
    "Java Básico",
    "Aprende Java desde cero",
    "https://curso.com",
    100.0,
    true,
    instructor,
    new Date(...),
    new Date(...),
    categoria
);

Modulo modulo = new Modulo(...);
curso.agregarModulo(modulo);
```

---

## ⚠️ Posibles mejoras

* Persistencia en base de datos (MySQL, PostgreSQL)
* Uso de JPA / Hibernate
* API REST con Spring Boot
* Autenticación de usuarios
* Encriptación de contraseñas
* Validaciones más robustas

---

## 🎯 Objetivo del proyecto

Este proyecto fue desarrollado como ejercicio práctico para reforzar:

* Modelado de sistemas reales
* Traducción de diagramas a código
* Diseño limpio de clases

---

## 📄 Licencia

Este proyecto es de uso educativo.
