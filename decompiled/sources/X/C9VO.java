package X;

/* renamed from: X.9VO, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9VO extends Enum<C9VO> {
    public static int A00(Integer num) {
        String str;
        int iIntValue = num.intValue();
        switch (iIntValue) {
            case 1:
                str = "CLOSED";
                break;
            case 2:
                str = "NOTAPPLICABLE";
                break;
            case 3:
                str = "UNKNOWN";
                break;
            default:
                str = "OPEN";
                break;
        }
        return str.hashCode() + iIntValue;
    }
}
