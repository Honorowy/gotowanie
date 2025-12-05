package com.example.gotowanie;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    private static ArrayList<Przepis> przepisy;
    private static void wygenerujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(new Przepis("Murzyn", "ciasto", R.drawable.mudzin, "jaja, mąka, cukier, masło, kakao, woda, proszek do pieczenia", "Murzyn"));
        przepisy.add(new Przepis("Sernik Królewski", "ciasto", R.drawable.sernik, "jaja, mąka, cukier, masło, kakao, woda, proszek do pieczenia, twaróg, budyń, skórka z cytryny", "Sernik"));
        przepisy.add(new Przepis("Malinowa Chmurka", "ciasto", R.drawable.malinowa, "jaja, mąka, cukier puder, cukier waniliowy, galaretka, Śmietanka kremówka, mascarpone, wanilia, żelatyna, masło, kakao, woda, proszek do pieczenia", "Chmura"));
        przepisy.add(new Przepis("Kokosanki", "ciasteczka", R.drawable.kokosanki, "jaja, wióra kokosowe, olej waniliowy, sól", "Kokot"));
        przepisy.add(new Przepis("Pieguski", "ciasteczka", R.drawable.pieguski, "mąka, jaja, masło, cukier puder, czekolada, orzechy laskowe, cukier waniliowy, proszek do pieczenia, sól", "Pieguski"));
        przepisy.add(new Przepis("Wafle", "ciasteczka", R.drawable.wafle, "", ""));
        przepisy.add(new Przepis("Izotonik", "napoje", R.drawable.izotonik, "", ""));
        przepisy.add(new Przepis("Sok", "napoje", R.drawable.sok, "", ""));
        przepisy.add(new Przepis("Galaretka", "deser", R.drawable.galareta, "", ""));
    }
    public static ArrayList<Przepis> zwrocPrzepisy(){
        wygenerujPrzepisy();
        return przepisy;
    }
    public static ArrayList<Przepis> zwrocPrzepisZDanejKategorii(String kategoria){
        wygenerujPrzepisy();
        ArrayList<Przepis> wybranePrzepisy = new ArrayList<>();
        for (Przepis przepis:przepisy) {
            if (przepis.getKategoria().equals(kategoria)){
                wybranePrzepisy.add(przepis);
            }
        }
        return wybranePrzepisy;
    }
    public  static ArrayList<Przepis> zwrocPrzepisyWKategorii(){
        ArrayList<Przepis> przepisyKategoria = new ArrayList<>();
        return  przepisyKategoria;
    }
}
