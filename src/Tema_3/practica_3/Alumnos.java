package Tema_3.practica_3;
/** Ejercicio 2: Define una clase para modelar a los alumnos de un instituto. De ellos se debe
 almacenar:
 -> nombre, apellidos, edad, si es repetidor o no, nota media y correo electrónico.
 También se espera que de un alumno se pueda obtener una impresión de su nombre con
 los apellidos y la edad. Además, dado que se usará dentro de un modelo más amplio (aulas,
 profesores, etc...), se debe permitir acceder a todos los campos para consulta y
 modificación, pero no de forma directa, sino encapsulando esta información. Por último,
 añade un constructor sin parámetros y otro con los parámetros del nombre, apellidos y
 edad. **/
public class Alumnos {
    String nombre;
    String apellidos;
    int edad;
    boolean repetidor;
    float notaMedia;
}
