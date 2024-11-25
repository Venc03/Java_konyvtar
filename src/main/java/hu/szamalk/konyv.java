package hu.szamalk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class konyv {
    private String cim;
    private ArrayList<String> irok;
    private int kiad_ev, ar;
    private boolean kiadva;

    public konyv(String cim, ArrayList<String> irok, int kiad_ev, int ar) {
        this(cim, new ArrayList<>(), kiad_ev, ar);
    }

    public konyv(String cim, String iro, int kiad_ev, int ar, boolean kiadva) {
        this(cim, new ArrayList<>(), ar, kiad_ev);
        this.irok.add(iro);
    }

    public konyv(String cim, ArrayList<String> irok, int kiad_ev, int ar, boolean kiadva) {
        this.cim = cim;
        this.irok = irok;
        this.kiad_ev = kiad_ev;
        this.ar = ar;
        this.kiadva = kiadva;
    }

    public String getCim() {
        return cim;
    }

    public List<String> getIrok() {
        return Collections.unmodifiableList(irok);
    }

    public int getKiad_ev() {
        return kiad_ev;
    }

    public int getAr() {
        return ar;
    }

    public boolean isKiadva() {
        return kiadva;
    }

    @Override
    public String toString() {
        return "konyv{" +
                "cim='" + cim + '\'' +
                ", irok='" + irok + '\'' +
                ", kiad_ev=" + kiad_ev +
                ", ar=" + ar +
                ", kiadva=" + kiadva +
                '}';
    }
}
