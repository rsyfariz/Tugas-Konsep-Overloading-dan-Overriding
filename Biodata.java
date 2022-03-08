/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//override
    public class Biodata extends Anak{
    private String nama,jk;
    private int umur;
    

    public void IdentitasAnak(String nama, String jk, int umur){
        this.nama = nama;
        this.jk = jk;
        this.umur = umur;
    }
    
    public void uangsaku(){
        super.uangsaku();
    }
    
//overloading
    void Orangtua(String nama, String pekerjaan, int gaji){
        System.out.println("Nama ayah : "+ nama);
        System.out.println("Pekerjaan ayah : "+ pekerjaan);
        System.out.println("Gaji : "+ gaji);
    }
    
    void Orangtua(String nama, String status){
        System.out.println("Nama ibu : "+ nama);
        System.out.println("Status dalam keluarga : "+ status);
    }
}

    
    

