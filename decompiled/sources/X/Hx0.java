package X;

/* loaded from: classes6.dex */
public final class Hx0 {
    public static volatile C10595Hxr A00;

    public static final void A00() {
        if (A00 == null) {
            synchronized (Hx0.class) {
                if (A00 == null) {
                    A00 = new C10595Hxr();
                }
            }
        }
        if (A00 == null) {
            throw BV4.A0U();
        }
    }

    public static final void A01() {
        A00();
    }
}
