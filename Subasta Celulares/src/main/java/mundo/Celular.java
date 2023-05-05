package mundo;

//VARIABLES
public class Celular {

     private int OFERTA_MIN_GAMA_ALTA = 60000;
     private int OFERTA_MIN_GAMA_BAJA = 20000;
     private int OFERTA_MIN_GAMA_MEDIA = 40000;
     private int OFERTA_MODERADA_GAMA_ALTA = 80000;
     private int OFERTA_MODERADA_GAMA_MEDIA = 60000;
     private int OFERTA_MODERADA_GAMA_BAJA = 40000;
     private String modelo;
     private int costoBase;
     private String marca;
     private int valorTotalOfertas;
     private int numeroOfertas;
     private int incrementoCostoBase;
     private Gama gama;
     private boolean vendido;

     //CONSTRUCTOR
     public Celular(String modelo, int costoBase, String marca, Gama gama) {
          this.modelo = modelo;
          this.costoBase = costoBase;
          this.marca = marca;
          this.gama = gama;
     }

     public boolean registrarOfertaMinima(int pOferta, String pGama){
          if (vendido != true){
               valorTotalOfertas = valorTotalOfertas + pOferta;
               numeroOfertas = numeroOfertas +1;
               return true;
          }
          else
               return false;
     }

     public boolean registrarOfertaModerada(int pOferta, String pGama){
          if (vendido != true){
               valorTotalOfertas = valorTotalOfertas + pOferta;
               numeroOfertas = numeroOfertas +1;
               return true;
          }
          else
               return false;
     }
     public boolean registrarOfertaAbierta(int pOferta, String pGama){
          if (vendido != true){
               valorTotalOfertas = valorTotalOfertas + pOferta;
               numeroOfertas = numeroOfertas +1;
               return true;
          }
          else
               return false;
     }

     public int calcularIncrementoCostoBase(int costoBase) {
          incrementoCostoBase = costoBase - valorTotalOfertas;
          return incrementoCostoBase;
     }

     public void reiniciarNumeroOfertas() {
          numeroOfertas = 0;
     }

     public void reiniciarValorTotalOfertas() {
          valorTotalOfertas = 0;
     }

     public void vender(){
          vendido = true;
     }


     //GETTERS Y SETTERS

     public int getIncrementoCostoBase() {
          return incrementoCostoBase;
     }

     public void setIncrementoCostoBase(int incrementoCostoBase) {
          this.incrementoCostoBase = incrementoCostoBase;
     }

     public int getOFERTA_MIN_GAMA_ALTA() {
          return OFERTA_MIN_GAMA_ALTA;
     }

     public void setOFERTA_MIN_GAMA_ALTA(int OFERTA_MIN_GAMA_ALTA) {
          this.OFERTA_MIN_GAMA_ALTA = OFERTA_MIN_GAMA_ALTA;
     }

     public int getOFERTA_MIN_GAMA_BAJA() {
          return OFERTA_MIN_GAMA_BAJA;
     }

     public void setOFERTA_MIN_GAMA_BAJA(int OFERTA_MIN_GAMA_BAJA) {
          this.OFERTA_MIN_GAMA_BAJA = OFERTA_MIN_GAMA_BAJA;
     }

     public int getOFERTA_MIN_GAMA_MEDIA() {
          return OFERTA_MIN_GAMA_MEDIA;
     }

     public void setOFERTA_MIN_GAMA_MEDIA(int OFERTA_MIN_GAMA_MEDIA) {
          this.OFERTA_MIN_GAMA_MEDIA = OFERTA_MIN_GAMA_MEDIA;
     }

     public int getOFERTA_MODERADA_GAMA_ALTA() {
          return OFERTA_MODERADA_GAMA_ALTA;
     }

     public void setOFERTA_MODERADA_GAMA_ALTA(int OFERTA_MODERADA_GAMA_ALTA) {
          this.OFERTA_MODERADA_GAMA_ALTA = OFERTA_MODERADA_GAMA_ALTA;
     }

     public int getOFERTA_MODERADA_GAMA_MEDIA() {
          return OFERTA_MODERADA_GAMA_MEDIA;
     }

     public void setOFERTA_MODERADA_GAMA_MEDIA(int OFERTA_MODERADA_GAMA_MEDIA) {
          this.OFERTA_MODERADA_GAMA_MEDIA = OFERTA_MODERADA_GAMA_MEDIA;
     }

     public int getOFERTA_MODERADA_GAMA_BAJA() {
          return OFERTA_MODERADA_GAMA_BAJA;
     }

     public void setOFERTA_MODERADA_GAMA_BAJA(int OFERTA_MODERADA_GAMA_BAJA) {
          this.OFERTA_MODERADA_GAMA_BAJA = OFERTA_MODERADA_GAMA_BAJA;
     }

     public String getModelo() {
          return modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public int getCostoBase() {
          return costoBase;
     }

     public void setCostoBase(int costoBase) {
          this.costoBase = costoBase;
     }

     public String getMarca() {
          return marca;
     }

     public void setMarca(String marca) {
          this.marca = marca;
     }

     public int getValorTotalOfertas() {
          return valorTotalOfertas;
     }

     public void setValorTotalOfertas(int valorTotalOfertas) {
          this.valorTotalOfertas = valorTotalOfertas;
     }

     public int getNumeroOfertas() {
          return numeroOfertas;
     }

     public void setNumeroOfertas(int numeroOfertas) {
          this.numeroOfertas = numeroOfertas;
     }

     public Gama getGama() {
          return gama;
     }

     public void setGama(Gama gama) {
          this.gama = gama;
     }

     public boolean isVendido() {
          return vendido;
     }

     public void setVendido(boolean vendido) {
          this.vendido = vendido;
     }
}
