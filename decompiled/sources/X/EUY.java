package X;

/* loaded from: classes5.dex */
public final class EUY extends Thread {
    public static final String __redex_internal_original_name = "DestructorThread$1";

    public EUY() {
        super("HybridData DestructorThread");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                EUa eUa = EUZ.A00;
                EUX eux = (EUX) EUZ.A02.remove();
                eux.destruct();
                if (eux.previous == null) {
                    EUX andSet = EUZ.A01.A00.getAndSet(null);
                    while (andSet != null) {
                        EUX eux2 = andSet.next;
                        EUX eux3 = EUZ.A00.A00;
                        andSet.next = eux3.next;
                        eux3.next = andSet;
                        andSet.next.previous = andSet;
                        andSet.previous = eux3;
                        andSet = eux2;
                    }
                }
                EUX eux4 = eux.next;
                eux4.previous = eux.previous;
                eux.previous.next = eux4;
            } catch (InterruptedException unused) {
            }
        }
    }
}
