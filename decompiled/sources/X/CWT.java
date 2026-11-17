package X;

/* loaded from: classes5.dex */
public final class CWT extends Thread {
    public static final String __redex_internal_original_name = "DestructorThread$1";

    public CWT() {
        super("DestructorThread");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                CWW cww = CWU.A00;
                CWS cws = (CWS) CWU.A02.remove();
                cws.destruct();
                if (cws.A01 == null) {
                    CWS cws2 = (CWS) C8j3.A10(CWU.A01.A00);
                    while (cws2 != null) {
                        CWS cws3 = cws2.A00;
                        CWS cws4 = CWU.A00.A00;
                        cws2.A00 = cws4.A00;
                        cws4.A00 = cws2;
                        cws2.A00.A01 = cws2;
                        cws2.A01 = cws4;
                        cws2 = cws3;
                    }
                }
                CWS cws5 = cws.A00;
                cws5.A01 = cws.A01;
                cws.A01.A00 = cws5;
            } catch (InterruptedException unused) {
            }
        }
    }
}
