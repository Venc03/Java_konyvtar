package hu.szamalk;

import java.util.ArrayList;
import java.util.List;

public class konyvtar {
    List<konyv> konyvek;

    public konyvtar(List<konyv> konyvek) {
        this.konyvek = new ArrayList<>();

        konyvek.add(new konyv("Vadonjaro Tanitvanya", "John Flagan", 251124, 3000, true));
    }

}
