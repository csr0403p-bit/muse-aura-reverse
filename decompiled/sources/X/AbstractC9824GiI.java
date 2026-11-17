package X;

/* renamed from: X.GiI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9824GiI {
    public static final C9823GiH A00;

    static {
        int i = 0;
        for (EnumC9825GiJ enumC9825GiJ : EnumC9825GiJ.values()) {
            if (enumC9825GiJ._enabledByDefault) {
                i |= enumC9825GiJ._mask;
            }
        }
        int i2 = 0;
        for (EnumC9819GiD enumC9819GiD : EnumC9819GiD.values()) {
            if (enumC9819GiD._enabledByDefault) {
                i2 |= enumC9819GiD._mask;
            }
        }
        A00 = new C9823GiH(i, i2);
    }
}
