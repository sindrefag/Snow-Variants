package json;

public class SnowFenceTemplate {

    public final String modid, name, rawName, all;

    public SnowFenceTemplate(String modid, String name, String all) {
        this.modid = modid;
        this.name = "snowy_" + name;
        rawName = name;
        this.all = all;

        Generator.FENCES.add(this);
    }

}
