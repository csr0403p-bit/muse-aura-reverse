package X;

/* renamed from: X.7mL, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7mL extends Enum<C7mL> {
    public final String logName;

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SAME_KEY";
            case 2:
                return "FAMILY";
            case 3:
                return "TRUSTED_APP";
            case 4:
                return "ACCESSIBLE_BY_ANY_APP";
            case 5:
                return "EXTERNAL";
            case 6:
                return "THIRD_PARTY";
            case 7:
                return "ANY";
            case 8:
                return "IN_APP_BROWSER";
            case 9:
                return "FAMILY_ACCESSIBLE_BY_ANY_APP";
            default:
                return "INTERNAL";
        }
    }
}
