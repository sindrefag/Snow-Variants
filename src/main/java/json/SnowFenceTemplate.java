package json;

public class SnowFenceTemplate {

    public final String modid, name, rawName, all, top, side, bottom;

    public SnowFenceTemplate(String modid, String name, String all) {
        this.modid = modid;
        this.name = "snowy_" + name;
        rawName = name;
        this.all = all;
        top = null;
        side = null;
        bottom = null;

        Generator.FENCES.add(this);
    }

    public SnowFenceTemplate(String modid, String name, String top, String side, String bottom) {
        this.modid = modid;
        this.name = "snowy_" + name;
        rawName = name;
        all = null;
        this.top = top;
        this.side = side;
        this.bottom = bottom;

        Generator.FENCES.add(this);
    }
}
