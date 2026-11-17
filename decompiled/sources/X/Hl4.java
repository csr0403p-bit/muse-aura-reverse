package X;

/* loaded from: classes6.dex */
public abstract class Hl4 {
    public static final int A00(HiJ hiJ, Integer num, boolean z) {
        int iIntValue = num != null ? num.intValue() : 131073;
        if ((iIntValue & 15) == 1) {
            int iOrdinal = hiJ.ordinal();
            if (iOrdinal == 1) {
                iIntValue = (iIntValue & (-32769)) | 524288;
            } else if (iOrdinal == 2) {
                iIntValue = (iIntValue | 32768) & (-524289);
            }
        }
        return z ? iIntValue & (-131073) : iIntValue;
    }
}
