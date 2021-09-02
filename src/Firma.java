import java.util.ArrayList;

public class Firma {
    private String name;
    private ArrayList<Automat> meineAutomaten = new ArrayList<Automat>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Automat getMeineAutomaten(int index) {
        return meineAutomaten.get(index);
    }

    public void setMeineAutomaten(Automat automat) {
        this.meineAutomaten.add(automat);
    }

    public int getMeineAutomatenSize() {
        return meineAutomaten.size();
    }
}
