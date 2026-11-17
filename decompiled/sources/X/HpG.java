package X;

/* loaded from: classes6.dex */
public abstract class HpG extends Enum<HpG> {
    public final String value;

    public static final boolean A00(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1 || iIntValue == 2) {
            return true;
        }
        throw C3cG.A0q();
    }
}
