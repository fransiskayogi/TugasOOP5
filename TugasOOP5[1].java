/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasoop5;

/**
 *
 * @author HP
 */
public class TugasOOP5 {
/**
 * 
 * @author Fransiska Ygi Pangestu
 */
public interface Interface {
    public String nama = "yogi";
    public String nim = "14111036";
    
    /*Interface tidak dapat di inisiasi*/
    public static void main (String[] args){
        Interface In = new Interface();
        
    }
    
}

/*class Abstract dapat mengimplement interface dengan bebas*/
public abstract class abstrak implements Interface{
    protected String getNama(){
        return this.nama;
    }
    /*implement variable interface */
    public class impl implements Interface {
        public static void main (String[] Args) {
            impl pg = new impl();
            pg.nama;
            pg.nim
        }
    }
}