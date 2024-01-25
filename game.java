
package dasar;

public class game {
    public static void main(String[] args){

        // membuat objek player
        Player petani = new Player();

        // mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 100;
        
        petani.name = "Petani kode ";
        petani.damage =50;
        
        //menjalankan method
        petani.run();
        
        petani.attack();
        
        petani.defense();
        
        if(petani.isDead()){
        System.out.println("Game over !");      
    }
        else{
                System.out.println("masih hidup");
                }  
    }
}