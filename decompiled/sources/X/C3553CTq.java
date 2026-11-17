package X;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CTq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3553CTq implements InterfaceC3559CTz {
    public static AtomicReference<C3553CTq> A00 = BV4.A15();

    @Override // X.InterfaceC3559CTz
    public final void ARv(boolean z) {
        synchronized (C3554CTr.A09) {
            Iterator itA0z = BV5.A0z(C3554CTr.A0A.values());
            while (itA0z.hasNext()) {
                C3554CTr c3554CTr = (C3554CTr) itA0z.next();
                if (c3554CTr.A06.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it = c3554CTr.A05.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw BV4.A0a("onBackgroundStateChanged");
                    }
                }
            }
        }
    }
}
