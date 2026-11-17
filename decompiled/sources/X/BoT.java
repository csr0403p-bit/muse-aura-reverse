package X;

/* loaded from: classes5.dex */
public abstract class BoT {
    public static void A00() {
        BeS.A07(AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread()), "Not in application's main thread");
    }

    public static void A01(Runnable runnable) {
        if (AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread())) {
            runnable.run();
        } else {
            BeS.A07(C60O.A02().post(runnable), "Unable to post to main thread");
        }
    }
}
