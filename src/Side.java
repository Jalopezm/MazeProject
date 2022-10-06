public class Side {
    String sideType = "";

    public String getSideType() {
        return sideType;
    }

    public void setSideType(String sideType) {
        this.sideType = sideType;
    }

    @Override
    public String toString() {
        return "Side{" +
                "sideType='" + sideType + '\'' +
                '}';
    }
}
