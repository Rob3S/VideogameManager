public class VideojuegosFisicos extends Videojuegos {
    private double envio = 5;
    VideojuegosFisicos(String juego, String plataforma, double precio) {
        super(juego, plataforma, precio);
        this.envio = envio;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + envio;
    }


}
