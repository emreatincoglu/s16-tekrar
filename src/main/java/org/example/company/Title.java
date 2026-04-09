package org.example.company;

public enum Title {
    CEO(5, "Şirket Yöneticisi", 5.0),
    DIRECTOR(4, "Direktör", 4.0),
    MANAGER(3, "Müdür", 3.0),
    TEAM_LEADER(2, "Takım Lideri", 2.0),
    EMPLOYEE(1, "Çalışan", 1.5);

    private final int hiyerarsiSeviyesi;
    private final String aciklama;
    private final double maasKatsayisi;

    Title(int hiyerarsiSeviyesi, String aciklama, double maasKatsayisi) {
        this.hiyerarsiSeviyesi = hiyerarsiSeviyesi;
        this.aciklama = aciklama;
        this.maasKatsayisi = maasKatsayisi;
    }

    public int getHiyerarsiSeviyesi()
    {
        return hiyerarsiSeviyesi;
    }

    public String getAciklama()
    {
        return aciklama;
    }

    public double getMaasKatsayisi()
    {
        return maasKatsayisi;
    }


}