package X;

/* loaded from: classes4.dex */
public abstract class BRm {
    public static final int A00;

    static {
        Object objA0s;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objA0s = property != null ? C9tI.A0r(property) : null;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Number number = (Number) (objA0s instanceof C10571Hud ? null : objA0s);
        A00 = number != null ? number.intValue() : 2097152;
    }
}
