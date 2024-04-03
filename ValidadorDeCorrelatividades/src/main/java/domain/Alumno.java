package domain;

import java.util.List;

public class Alumno {
    private String legajo;
    private String nombre;
    private List<Materia> materiasDadas;

    public Alumno(String legajo, String nombre, List<Materia> materiasDadas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materiasDadas = materiasDadas;
    }

    public boolean dioCorrelativas(Materia materia)
    {
        if(materiasDadas == null) return false;
        return materiasDadas.containsAll(materia.getCorrelativas());
    }
}
