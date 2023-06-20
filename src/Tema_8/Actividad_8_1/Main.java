package Tema_8.Actividad_8_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Vamos a añadir varios ordenadores.
        Ordenadores fila1Pc1=new Ordenadores("192.168.70.21","INC001",new BigInteger("8589934592"),new BigInteger("268435456000"),"Intel I3-6100", Timestamp.valueOf("2017-05-19 16:31:00"),true);
        Ordenadores fila1Pc2=new Ordenadores("192.168.70.22","INC002",new BigInteger("8589934592"),new BigInteger("268435456000"),"Intel I3-6100", Timestamp.valueOf("2017-05-19 16:31:00"),true);
        Ordenadores fila1Pc3=new Ordenadores("192.168.70.23","INC003",new BigInteger("12884901888"),new BigInteger("536870912000"),"Intel I5-6440", Timestamp.valueOf("2017-05-19 16:35:00"),false);
        Ordenadores fila1Pc4 = new Ordenadores("192.168.70.24", "INC004", new BigInteger("8589934592"), new BigInteger("268435456000"), "Intel I3-6100", Timestamp.valueOf("2017-05-19 16:31:00"),true);
        Ordenadores fila1Pc5 = new Ordenadores("192.168.70.25", "INC005", new BigInteger("8589934592"), new BigInteger("268435456000"), "Intel I3-6100", Timestamp.valueOf("2017-05-19 16:31:00"),false);
        Ordenadores fila1Pc6 = new Ordenadores("192.168.70.26", "INC006", new BigInteger("12884901888"), new BigInteger("536870912000"), "Intel I5-6440", Timestamp.valueOf("2017-05-19 16:35:00"),true);
        Ordenadores fila2pc1=new Ordenadores("192.168.70.27","AMC001",new BigInteger("17179869184"),new BigInteger("536870912000"),"AMD Ryzen 5 2500X",Timestamp.valueOf("2020-12-19 18:47:00"),false);
        Ordenadores fila2Pc2 = new Ordenadores("192.168.70.28", "AMC002", new BigInteger("17179869184"), new BigInteger("536870912000"), "AMD Ryzen 5 2500X", Timestamp.valueOf("2020-12-19 18:47:00"),true);
        Ordenadores fila2Pc3 = new Ordenadores("192.168.70.29", "AMC003", new BigInteger("17179869184"), new BigInteger("536870912000"), "AMD Ryzen 5 2500X", Timestamp.valueOf("2020-12-19 18:47:00"),true);

        // Ahora crearemos a las alumnos necesarios
        Alumno jonathan=new Alumno("Jonathan León Canto",10,"1DAW",fila1Pc1);
        Alumno juanJesus=new Alumno("Juan Jesús",1,"2DAW",fila1Pc2);
        Alumno juanmHerrera=new Alumno("Juan Manuel Herrera",12,"1DAW",fila1Pc3);
        Alumno daniel=new Alumno("Daniel Alfonso Rodríguez Santos",16,"1DAW",fila1Pc4);
        Alumno david=new Alumno("David",0,"1DAW",fila1Pc5);
        Alumno adrian=new Alumno("Adrian Merino",5,"1DAW");
        Alumno josie=new Alumno("Josiee",0,"1DAW",fila1Pc6);
        Alumno julian=new Alumno("Julian",1,"1DAW",fila2pc1);
        Alumno pablo=new Alumno("Pablo Mateos",7,"1DAW",fila2Pc2);
        Alumno samuel=new Alumno("Samuel",0,"1DAW");
        Alumno gabriel=new Alumno("Ricardo",4,"1DAW",fila2Pc3);

        // Creamos la conexión a la base d
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("objectdb:$objectdb/db/daw1.odb");
        EntityManager em=emf.createEntityManager();

        // Creamos una transacción, donde instanciaremos a los alumnos
        em.getTransaction().begin();

        em.persist(jonathan);
        em.persist(juanJesus);
        em.persist(juanmHerrera);
        em.persist(daniel);
        em.persist(david);
        em.persist(adrian);
        em.persist(josie);
        em.persist(julian);
        em.persist(pablo);
        em.persist(samuel);
        em.persist(gabriel);


        // Ahora realizaremos algunas de las consultas propuestas tanto por nuestro profesor y compañeros de clase

        // Consulta 1: Selecciona todos los alumnos que no tengan ordenador (porque utilizan el suyo propio)
        TypedQuery<Alumno> propioPc=em.createQuery("SELECT a FROM Alumno a WHERE a.ordenadorAsignado IS NULL", Alumno.class);
        List<Alumno> alumnosPcPropio = propioPc.getResultList();
        System.out.println("Alumnos con ordenador propio:");
        for (Alumno e:
                alumnosPcPropio) {
            System.out.println("- "+e.getNombre());
        }

        // Consulta 2: Selecciona todos los alumnos que no hayan participado ninguna vez.
        TypedQuery<Alumno> ceroParticipaciones=em.createQuery("SELECT a FROM Alumno a WHERE participacion=0", Alumno.class);
        List<Alumno> alumnosCeroParticipaciones = ceroParticipaciones.getResultList();
        System.out.println("Alumnos con ninguna participacion:");
        for (Alumno e:
                alumnosCeroParticipaciones) {
            System.out.println("- "+e.getNombre());
        }

        // Consulta 3: Selecciona todos los alumnos cuyo nombre empiece por J
        TypedQuery<Alumno> empiezanPorJ=em.createQuery("SELECT a FROM Alumno a WHERE nombre LIKE ('J%')", Alumno.class);
        List<Alumno> alumnosEmpiezanJ = empiezanPorJ.getResultList();
        System.out.println("Alumnos cuyo nombre empieza por J:");
        for (Alumno e:
                alumnosEmpiezanJ) {
            System.out.println("- "+e.getNombre());
        }

        // Consulta 4: Selecciona todos los alumnos que tengan participación igual o mayor a 5
        TypedQuery<Alumno> participacionesCinco=em.createQuery("SELECT a FROM Alumno a WHERE participacion>=5", Alumno.class);
        List<Alumno> alumnosParticipacionCinco = participacionesCinco.getResultList();
        System.out.println("Alumnos con cinco o más participaciones:");
        for (Alumno e:
                alumnosParticipacionCinco) {
            System.out.println("- "+e.getNombre());
        }

        // Consulta 5: Elimina aquellos ordenadores que tengan menos de 8 Gb de memoria y que su CPU sea de la marca “AMD”
        BigInteger pocaMemoria=new BigInteger("8589934592");
        TypedQuery<Ordenadores> eliminarPc= em.createQuery("SELECT o FROM Ordenadores o WHERE o.memoria < :pocaMemoria AND o.cpu LIKE 'AMD%'", Ordenadores.class);
        eliminarPc.setParameter("pocaMemoria",pocaMemoria);
        List<Ordenadores> ordenadores = eliminarPc.getResultList();
        System.out.println("\n"+"Se puden eliminar "+ordenadores.size()+" ordenadores");
        // Eliminar los ordenadores encontrados
        for (Ordenadores ordenador : ordenadores) {
            em.remove(ordenador);
        }

        em.getTransaction().commit();

    }
}