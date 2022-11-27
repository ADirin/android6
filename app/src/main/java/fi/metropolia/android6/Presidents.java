package fi.metropolia.android6;

import java.util.ArrayList;

public class Presidents  extends ArrayList<President> {
    public Presidents() {
        this.add(new President("Stahlberg, Kaarlo Juho", 1919, 1925, "Eka presidentti"));
        this.add(new President("Relander, Lauri Kristian", 1925, 1931, "Reissulasse"));
        this.add(new President("Svinhufvud, Pehr, Evind", 1931, 1937, "Ukko-Pekka"));
        this.add(new President("Kallio, Kyosti", 1937, 1940, "Neljas presidentti"));
        this.add(new President("Ryti, Risto Heikki", 1940, 1944, "Nuorena Kustu Kalliokangas"));
        this.add(new President("Mannerheim, Carl Gustav", 1944, 1946, "Marski"));
        this.add(new President("Paasikivi, Juho Kusti", 1946, 1956, "Äkäinen ukko"));
        this.add(new President("Kekkonen, Urho Kaleva", 1956, 1982, "Pelimies"));
        this.add(new President("Koivisto, Mauno Henrik", 1982, 1994, "Manu"));
        this.add(new President("Ahtisaari, Martti Oiva", 1994, 2000, "Mahtisaari"));
        this.add(new President("Halonen, Tarja Kaarina", 2000, 2012, "Eka naispressa"));
        this.add(new President("Niinistö, Sauli Väinämö", 2012, 2024, "Owner of Lennu, the First Dog"));

    }


}
