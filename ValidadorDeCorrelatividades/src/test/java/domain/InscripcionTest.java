package domain;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class InscripcionTest {
    @Test
    public void alumnoPuedeInscribirse()
    {
        Materia materia1 = new Materia(null);
        Materia materia2 = new Materia(List.of(materia1));
        Materia materia3 = new Materia(List.of(materia1));

        Alumno alumno1 = new Alumno("123321123","pedro",List.of(materia1));

        Inscripcion inscripcion1 = new Inscripcion(List.of(materia2, materia3), alumno1);

        Assert.assertTrue(inscripcion1.aprobada());
    }

    @Test
    public void alumnoNoPuedeInscribirse()
    {
        Materia materia1 = new Materia(null);
        Materia materia2 = new Materia(List.of(materia1));
        Materia materia3 = new Materia(List.of(materia1));

        Alumno alumno1 = new Alumno("123321123","pedro",null);

        Inscripcion inscripcion1 = new Inscripcion(List.of(materia2, materia3), alumno1);

        Assert.assertFalse(inscripcion1.aprobada());
    }
}
