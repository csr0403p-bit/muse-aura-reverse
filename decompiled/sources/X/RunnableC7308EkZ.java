package X;

import android.os.Handler;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.EkZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7308EkZ implements Runnable {
    public static final RunnableC7308EkZ A00 = new RunnableC7308EkZ();
    public static final String __redex_internal_original_name = "AnimationCoordinator$clearUnusedFrameLoaders$1";

    @Override // java.lang.Runnable
    public final void run() {
        Date date = new Date(System.currentTimeMillis() - 10000);
        ConcurrentHashMap<String, C7314Ekf> concurrentHashMap = C7311Ekc.A07;
        synchronized (concurrentHashMap) {
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            Iterator itA0i = C3cG.A0i(concurrentHashMap);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                if (((C7314Ekf) entryA0l.getValue()).A01.compareTo(date) < 0) {
                    AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
                }
            }
            Iterator itA0i2 = C3cG.A0i(linkedHashMapA0j);
            while (itA0i2.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(itA0i2);
                ((C7314Ekf) entryA0l2.getValue()).A00.A02();
                concurrentHashMap.remove(entryA0l2.getKey());
            }
        }
        ((Handler) AbstractC7309Eka.A06.getValue()).postDelayed(AbstractC7309Eka.A01, 10000L);
    }
}
