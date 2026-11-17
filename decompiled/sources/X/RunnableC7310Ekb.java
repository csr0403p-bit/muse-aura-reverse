package X;

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ekb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7310Ekb implements Runnable {
    public static final RunnableC7310Ekb A00 = new RunnableC7310Ekb();
    public static final String __redex_internal_original_name = "AnimationCoordinator$calculatePerformance$1";

    @Override // java.lang.Runnable
    public final void run() {
        float andSet = AbstractC7309Eka.A05.getAndSet(0);
        float andSet2 = AbstractC7309Eka.A04.getAndSet(0);
        float andSet3 = AbstractC7309Eka.A03.getAndSet(0);
        float f = andSet + andSet2 + andSet3;
        if (f > 0.0f) {
            float f2 = andSet / f;
            float f3 = andSet3 / f;
            if (andSet2 / f > 0.25f || f3 > 0.1f) {
                Iterator itA0i = C3cG.A0i(AbstractC7309Eka.A02);
                while (itA0i.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0i);
                    AbstractC7309Eka.A00((C7315Ekg) entryA0l.getKey(), -AnonymousClass001.A0F(entryA0l.getValue()));
                }
            } else if (f2 > 0.98f) {
                Iterator itA0i2 = C3cG.A0i(AbstractC7309Eka.A02);
                while (itA0i2.hasNext()) {
                    Map.Entry entryA0l2 = C3cH.A0l(itA0i2);
                    AbstractC7309Eka.A00((C7315Ekg) entryA0l2.getKey(), AnonymousClass001.A0F(entryA0l2.getValue()));
                }
            }
            AbstractC7309Eka.A02.clear();
        }
        ((Handler) AbstractC7309Eka.A06.getValue()).postDelayed(AbstractC7309Eka.A00, 2000L);
    }
}
