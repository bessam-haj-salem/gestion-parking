 class Parking {

     private int placeRestante = 100;

     public int getPlaceRestante() {
         return placeRestante;
     }

     public void setPlaceRestante(int placeRestante) {
         this.placeRestante = this.placeRestante - placeRestante ;
     }
 }
