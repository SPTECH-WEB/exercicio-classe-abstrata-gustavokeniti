package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>(); ;
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double areaTotal = 0.0;

        for (Figura fig : figuras) {
            Double area = fig.calcularArea();
            areaTotal += area;
        } return areaTotal;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> areaMaior = new ArrayList<>();

        for (Figura fig : figuras) {
            Double area = fig.calcularArea();
            if (area > 20) {
                areaMaior.add(fig);
            }
        } return areaMaior;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();

        for (Figura fig : figuras) {
            if (fig instanceof Quadrado) {
                quadrados.add(fig);
            }
        } return quadrados;
    }
}
