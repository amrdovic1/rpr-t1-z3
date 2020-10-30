package ba.unsa.etf.rpr;

class Sat {
    int sati,minute,sekunde;
    Sat (int sati, int minute, int sekunde) {
        Postavi(sati,minute,sekunde);
    }
    void Postavi(int sati, int minute, int sekunde) {
        this.sati=sati;
        this.minute= minute;
        this.sekunde = sekunde; }
    void Sljedeci() {
        sekunde++;
        if (sekunde==60){
            sekunde=0;
            minute++;
        }
        if (minute==60) {
            minute=0;
            sati++;
        }
        if (sati==24)
            sati=0;
    }
    void Prethodni() {
        sekunde--;
        if (sekunde==-1) {
            sekunde=59;
            minute--;
        }
        if (minute==-1) {
            minute=59;
            sati--;
        }
        if (sati==-1)
            sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak > 0)
            for (int i = 0; i < pomak; i++)
                Sljedeci();
        else
            for (int i = 0; i < -pomak; i++)
                Prethodni();
    }
    int DajSate() {
        return sati;
    }
    int DajMinute() {
        return minute;
    }
    int DajSekunde() {
        return sekunde;
    }
    void Ispisi()  {
        if (sati < 10)
        {
            System.out.print(0);
        }
        System.out.print(sati + ":");
        if (minute < 10)
        {
            System.out.print(0);
        }
        System.out.print(minute + ":");
        if (sekunde < 10)
        {
            System.out.print(0);
        }
        System.out.println(sekunde);
    }
    public static void main(String[] args)
    {
        Sat s = new Sat(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(6,11,2);
        s.Ispisi();
    }
}