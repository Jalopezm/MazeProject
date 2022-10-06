public class Room {
    Side siteN;
    Side siteE;
    Side siteW;
    Side siteS;

    Item item;

    public Room(Side siteN, Side siteE, Side siteW, Side siteS) {
        this.siteN = siteN;
        this.siteE = siteE;
        this.siteW = siteW;
        this.siteS = siteS;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
