/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Evaluasi {
    private int id;
    private String nama;
    private String divisi;
    private int nilai_target;
    private int nilai_disiplin;
    private int nilai_inovasi;
    private double score;
    private String status;
    
    private static final double batasMinimum_divisiTeknis = 80.0;
    private static final double batasMinimum_divisiPemasaran = 85.0;
    
    public Evaluasi(){}
    
    public Evaluasi(String nama,String divisi,int nilai_target, int nilai_disiplin, int nilai_inovasi){
    this.nama = nama;
    this.divisi = divisi;
    this.nilai_target = nilai_target;
    this.nilai_disiplin =  nilai_disiplin;
    this.nilai_inovasi = nilai_inovasi;
    calculateScore();
    determineStatus();
    }
    
    public void calculateScore(){
    this.score = (nilai_target + nilai_disiplin+nilai_inovasi)/3.0;
    
    public void determineStatus(){
        nilai_jika_true : nilai_jika_false
                this.status = (score >= batasMinimum_divisiTeknis)? "PROMOSI":"TETAP";
                this.status = (score >= batasMinimum_divisiPemasaran)? "PROMOSI":"TETAP";
    }
    public int getID(){
    return id;
    }
    //getter
    public String getNama(){
    return nama;
    }
    public String getDivisi(){
    return divisi;
    }
    public int getNilai_Target(){
    return nilai_target;
    }
    public int getNilai_Disiplin(){
    return nilai_disiplin;
    }
    public int getNilai_Inovasi(){
    return nilai_inovasi;
    }
    public double getScore(){
    return score;
    }
    public String getStatus(){
    return status;
    }
    //setter
    public void setID(int id){
        this.id = id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
     public void setDivisi(String divisi){
        this.divisi = divisi;
    }
     public void setNilai_Target(int nilai_target){
        this.nilai_target = nilai_target;
    }
     public void setNilai_Disiplin(int nilai_disiplin){
        this.nilai_disiplin = nilai_disiplin;
    }
     public void setNilai_Inovasi(int nilai_inovasi){
        this.nilai_inovasi = nilai_inovasi;
    }
    public void setScore(double score){
        this.score =  score;
    }
    public void setStatus(String status){
    this.status =  status;
    }

}