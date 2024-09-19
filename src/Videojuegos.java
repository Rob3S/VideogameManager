
public abstract class Videojuegos {

        private String juego;

        private String plataforma;

        private double precio;

        public Videojuegos(String juego, String plataforma, double precio) {
            this.juego = juego;
            this.plataforma = plataforma;
            this.precio = precio;
        }
public void setJuego(String juego) {
            this.juego = juego;
}
public String getJuego(){
            return juego;
}

public void setPlataforma(String plataforma) {
            this.plataforma = plataforma;
}
public String getPlataforma(){
            return plataforma;
}
public void setPrecio(double precio) {
            this.precio = precio;
}
public double getPrecio(){
            return precio;
}
public abstract double calcularPrecioFinal();

    @Override
    public boolean equals(Object obj) {
        //valor de retorno
        boolean testOK;
        //discriminación
        if(obj == null) {
            testOK = false;
        } else if (!(obj instanceof Videojuegos)) {
            testOK = false;
        } else {
            Videojuegos v = (Videojuegos) obj;
            testOK = this.juego == v.juego;
            testOK = testOK && this.plataforma == v.plataforma;
            testOK = testOK && this.precio == v.precio;

        }
        return testOK;
    }
    @Override
    public String toString() {
        return String.format("Videojuegos: %s%n plataforma: %s%n precio: %s%n, juego, plataforma, precio");
    }
}
