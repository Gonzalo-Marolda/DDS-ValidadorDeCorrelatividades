package domain;

import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }

    public boolean aprobada()
    {
        boolean aprobada = true;
        for(Materia materia : materias)
        {
            if(!alumno.dioCorrelativas(materia))
            {
                aprobada = false;
            }
        }
        return aprobada;
    }
}
