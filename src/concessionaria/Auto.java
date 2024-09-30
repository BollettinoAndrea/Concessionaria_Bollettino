package concessionaria;

class Auto {
    private String marca;
    private String modello;
    private double prezzo;

    public Auto (String marc, String mod, double prez){
        marca = marc;
        modello = mod;
        prezzo = prez;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marc){
        marca = marc;
    }

    public String getModello(){
        return modello;
    }
    public void setModello(String mod){
        modello = mod;
    }

    public double getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(double prez){
        prezzo = prez;
    }



}
