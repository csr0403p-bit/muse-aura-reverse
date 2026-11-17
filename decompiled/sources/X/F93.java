package X;

/* loaded from: classes6.dex */
public abstract class F93 {
    public static HsM A01(F94 f94) {
        return A00(null, f94.AXm());
    }

    public static HsM A00(F9H f9h, F95 f95) {
        if (f95 instanceof HsI) {
            Object obj = ((HsI) f95).A00;
            if (obj instanceof HsM) {
                return (HsM) obj;
            }
        }
        return new FDG(f9h, (C7648F8p) null, (Integer) null, f95.AgW());
    }
}
