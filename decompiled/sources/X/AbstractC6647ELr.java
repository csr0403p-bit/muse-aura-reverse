package X;

/* renamed from: X.ELr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6647ELr extends Enum<AbstractC6647ELr> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONNECTED";
            case 2:
                return "UNMETERED";
            case 3:
                return "NOT_ROAMING";
            case 4:
                return "METERED";
            case 5:
                return "TEMPORARILY_UNMETERED";
            default:
                return "NOT_REQUIRED";
        }
    }
}
