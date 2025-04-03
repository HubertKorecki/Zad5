import java.util.ArrayList;
import java.util.List;



class Wydarzenie{
    public String nazwa;
    public String data;
    public String miejsce;
    public int maxLiczbaMiejsc = 100;
    public int dostepneMiejsca = 0;
    public double cena;
    public List<Klient> listaKlientow;

    public Wydarzenie(String nazwa, String data, String miejsce, int maxLiczbaMiejsc, int dostepneMiejsca, double cena) {
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
        this.dostepneMiejsca = dostepneMiejsca;
        this.cena = cena;
    }



    public String getWydarzenie() {
        return nazwa + " " + data + " " + miejsce + " " + maxLiczbaMiejsc + " " + dostepneMiejsca + " " + cena;
    }



}





class Klient{
    public String imie;
    public String nazwisko;
    public String email;
    public ArrayList<Wydarzenie> listaRezerwacji;

    public Klient(String imie, String nazwisko, String email, ArrayList<Wydarzenie> listaRezerwacji) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = listaRezerwacji;
    }

    public String getKlient() {
        return imie + " " + nazwisko + " " + email + " " + listaRezerwacji.toString();
    }






}





class SystemRezerwacji{

    public void dodajKlienta(Klient klient) {

    }


    public void dodajWydarzenie(Wydarzenie wydarzenie) {

    }
}












public class Main {

    public static void main(String[] args) {


        Wydarzenie wydarzenie1 = new Wydarzenie("testowe wydarzenie", "21.12", "Warszawa", 16, 5, 55.99);
        System.out.println(wydarzenie1.getWydarzenie());

        ArrayList<Wydarzenie> listaWydarzen = new ArrayList<>();
        listaWydarzen.add(wydarzenie1);


        Klient klient1 = new Klient("Adam", "Nowak", "qwerty@gmail.com", listaWydarzen);
        System.out.println(klient1.getKlient());

    }

}