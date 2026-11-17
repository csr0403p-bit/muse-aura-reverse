package X;

/* renamed from: X.9Vg, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9Vg extends Enum<C9Vg> {
    public static int A00(Integer num) {
        String str;
        int iIntValue = num.intValue();
        switch (iIntValue) {
            case 1:
                str = "MODERATE";
                break;
            case 2:
                str = "EXPENSIVE";
                break;
            case 3:
                str = "SPLURGE";
                break;
            case 4:
                str = "NOT_APPLICABLE";
                break;
            case 5:
                str = "UNKNOWN";
                break;
            default:
                str = "CHEAP";
                break;
        }
        return str.hashCode() + iIntValue;
    }
}
