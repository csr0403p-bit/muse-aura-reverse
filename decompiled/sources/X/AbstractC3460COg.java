package X;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.COg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3460COg {
    public static AtomicBoolean A00 = C60O.A1E();

    public static void A00() {
        boolean zIsEnabled = Trace.isEnabled();
        if (A00.compareAndSet(!zIsEnabled, zIsEnabled)) {
            COZ.A01(false);
        }
    }
}
