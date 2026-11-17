package X;

/* loaded from: classes4.dex */
public abstract class ATp extends Enum<ATp> {
    public static int A00(Integer num) {
        String str;
        int iIntValue = num.intValue();
        switch (iIntValue) {
            case 1:
                str = "Horizontal";
                break;
            case 2:
                str = "Both";
                break;
            default:
                str = "Vertical";
                break;
        }
        return str.hashCode() + iIntValue;
    }
}
