package X;

/* renamed from: X.Ekq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7320Ekq {
    public static volatile boolean A00;

    public static synchronized void A00() {
        if (!A00) {
            ETi.loadLibrary("msysjniinframinimal");
            A00 = true;
        }
    }
}
