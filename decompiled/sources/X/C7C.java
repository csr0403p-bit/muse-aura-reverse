package X;

import com.facebook.analytics.appstatelogger.foregroundstate.EntityAppState$ForegroundInit;

/* loaded from: classes5.dex */
public abstract class C7C {
    public static C7G A00;
    public static final Object A02 = C3cG.A0T();
    public static final Object A01 = new EntityAppState$ForegroundInit();

    public static void A00(Object obj) {
        synchronized (A02) {
            C7G c7g = A00;
            if (c7g == null) {
                CFK.A06(C9Y.TAG, "GlobalAppState.setAppStateCallback wasn't called?");
                return;
            }
            C75 c75 = c7g.A00;
            C3232C4p c3232C4p = c75.A0B;
            if (c3232C4p.A0A || c3232C4p.A0B) {
                return;
            }
            synchronized (c75.A0K) {
                Object obj2 = A01;
                if (obj == obj2) {
                    if (!c75.A04) {
                    }
                } else if (c75.A0L) {
                    c75.A09.A01(C79.A0Z, obj2);
                }
                c75.A09.A01(C79.A01, obj);
                c75.A05(null, C79.A00, null, false);
            }
        }
    }
}
