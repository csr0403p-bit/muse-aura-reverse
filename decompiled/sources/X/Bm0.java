package X;

/* loaded from: classes5.dex */
public abstract class Bm0 extends Enum<Bm0> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "RELEASING";
            case 2:
                return "INITIALIZED";
            case 3:
                return "PENDING_OPEN";
            case 4:
                return "CLOSING";
            case 5:
                return "REOPENING_QUIRK";
            case 6:
                return "REOPENING";
            case 7:
                return "OPENING";
            case 8:
                return "OPENED";
            case 9:
                return "CONFIGURED";
            default:
                return "RELEASED";
        }
    }
}
