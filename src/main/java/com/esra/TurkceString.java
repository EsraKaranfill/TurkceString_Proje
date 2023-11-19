package com.esra;

public class TurkceString {
    private String ifade;

    public TurkceString(String ifade) {
        this.ifade = ifade;
    }
    public char karakterAl(int index){
       return ifade.charAt(index);
    }
    public int indexBul(String karakter){
        return ifade.indexOf(karakter);
    }
    public String altIfade(int baslangic, int bitis){
        return ifade.substring(baslangic, bitis);
    }

    public String getIfade() {
        return ifade;
    }

    public void setIfade(String ifade) {
        this.ifade = ifade;
    }
}
