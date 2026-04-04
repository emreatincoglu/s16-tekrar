public CEOMaasi extends calisanMaasi {

    
    public CEOMaasi(double vergiOrani, double brutMaasi){
        super(vergiOrani, brutMaasi)
    }


    public double hesapla(double bazMaas) {
        double netMaasi = bazMaas + (brutMaasi * vergiOrani);
        return netMaasi;
    }

}