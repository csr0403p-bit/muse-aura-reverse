package X;

import com.facebook.msys.mci.Execution;

/* loaded from: classes6.dex */
public abstract class GUd {
    public static boolean A00;

    public static void A00() {
        if (A00) {
            return;
        }
        try {
            AbstractC7607F5u.A1F();
            Execution.initialize();
            ETi.loadLibrary("jniperflogger");
            ETi.loadLibrary("rsysmediastatsjniLatest");
            A00 = true;
        } catch (ClassNotFoundException e) {
            throw AbstractC7608F5v.A0m(e);
        }
    }
}
