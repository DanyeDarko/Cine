package Interfaces;

public interface InterfazCine {

    public void obtenerDatosTaquilla(int numeroTaquilla);

    public void operacionTaquilla(int numeroCliente, int numTaquilla, int cantidadBoletos, int numeroSala, int tipoOperacion);

    public void LlenarTaquillas(int numeroTaquillaAllenar);

    public Integer[][] leerMatrizTxt(String URLArchivo);

    // public void contabilisarVentasTotales();
}
