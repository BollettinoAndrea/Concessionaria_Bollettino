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

    public String getModello(){
        return modello;
    }

    public double getPrezzo(){
        return prezzo;
    }



}
