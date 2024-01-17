import java.util.Random;
public class Jugador{

    private static final int VALOR_POR_DEFECTO = 50;
    private final String nombre;
    private float portero;
    private  float defensa;
    private float pase;
    private float regate;
    private float tiro;
    private float estadoForma;


    public Jugador(String nombre, float portero, float defensa, float pase, float regate, float tiro, float estadoForma) {
        this.nombre = nombre;
        this.portero = portero;
        this.defensa = defensa;
        this.pase = pase;
        this.regate = regate;
        this.tiro = tiro;
        this.estadoForma = estadoForma;
    }
    public Jugador(String nombre){
        this(nombre, VALOR_POR_DEFECTO, VALOR_POR_DEFECTO, VALOR_POR_DEFECTO, VALOR_POR_DEFECTO,
                VALOR_POR_DEFECTO, VALOR_POR_DEFECTO);
    }


    public void entrenarPase() {
        Random random = new Random();
        float mejora = random.nextFloat();
        estadoForma += mejora;
        int dado = random.nextInt(100 + 1 -1) + 1; // [1 - 100]
        if (dado >= (100 - Config.PROBABILIDAD_MEJORA_PASE)) {
            mejora = random.nextFloat();
            pase += mejora;

        }
    }

}