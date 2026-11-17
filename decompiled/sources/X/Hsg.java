package X;

/* loaded from: classes6.dex */
public abstract class Hsg {
    public static final void A00(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                CU7.A01(th, th2);
            }
        }
    }
}
