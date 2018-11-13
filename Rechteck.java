
class Rechteck
{
    //Attribute
    double breite;
    double laenge; 

    //Konstruktor
    Rechteck()
    {
        breite = 4;
        laenge = 5;
    }
    
    //Methoden
    void setBreite(double breite_)
    {
        breite = breite_;
    }

    void setLaenge(double laenge_)
    {
        laenge = laenge_;
    }

    double berechneFlaeche()
    {
        double erg;
        erg = breite * laenge;
        return erg;
    }

    double berechneUmfang()
    {
      return 0;
    }

    double berechneDiagonale()
    {
      return 0;
    }

}
