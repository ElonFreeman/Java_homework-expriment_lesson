// SIM.java
public abstract class SIM {
    protected String number;
    protected String corporationName;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setCorpName(String corporationName) {
        this.corporationName = corporationName;
    }

    public String getCorpName() {
        return corporationName;
    }
}

// SIMOfChinaMobile.java
public class SIMOfChinaMobile extends SIM {
    private String corporationName = "yidong";

    @Override
    public void setCorpName(String corporationName) {
        this.corporationName = corporationName;
    }

    @Override
    public String getCorpName() {
        return corporationName;
    }
}

// SIMOfChinaUnion.java
public class SIMOfChinaUnion extends SIM {
    private String corporationName = "liantong";

    @Override
    public void setCorpName(String corporationName) {
        this.corporationName = corporationName;
    }

    @Override
    public String getCorpName() {
        return corporationName;
    }
}

// MobileTelephone.java
public class MobileTelephone {
    private SIM card;

    public void useSIM(SIM card) {
        this.card = card;
        System.out.println("shoujiihaoma：" + card.getNumber());
        System.out.println("yunyingshang：" + card.getCorpName());
    }
}

// Application.java
public class Application {
    public static void main(String[] args) {
        MobileTelephone phone = new MobileTelephone();

        SIM chinaMobileSIM = new SIMOfChinaMobile();
        chinaMobileSIM.setNumber("13887656432");
        phone.useSIM(chinaMobileSIM);

        SIM chinaUnionSIM = new SIMOfChinaUnion();
        chinaUnionSIM.setNumber("13097656437");
        phone.useSIM(chinaUnionSIM);
    }
}
