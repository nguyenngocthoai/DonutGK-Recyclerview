package snowdrop.nnt.donutgk;

public class DonutCategory {
    private int image_tab;
    private String name_tab;

    public DonutCategory(int image_tab, String name_tab) {
        this.image_tab = image_tab;
        this.name_tab = name_tab;
    }

    public int getImage_tab() {
        return image_tab;
    }

    public void setImage_tab(int image_tab) {
        this.image_tab = image_tab;
    }

    public String getName_tab() {
        return name_tab;
    }

    public void setName_tab(String name_tab) {
        this.name_tab = name_tab;
    }
}
