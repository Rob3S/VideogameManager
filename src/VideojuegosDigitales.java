public class VideojuegosDigitales extends Videojuegos{
    private double descuento = 0.20;
    VideojuegosDigitales(String juego, String plataforma, double precio) {
        super(juego, plataforma, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * descuento;
    }

}

