package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GRb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9595GRb implements Runnable {
    public static final String __redex_internal_original_name = "RpStore$subscribe$1";
    public final /* synthetic */ GRZ A00;
    public final /* synthetic */ C9598GRe A01;

    public RunnableC9595GRb(GRZ grz, C9598GRe c9598GRe) {
        this.A01 = c9598GRe;
        this.A00 = grz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9598GRe c9598GRe = this.A01;
        GRH grhA00 = C9659Gcj.A00(this.A00);
        C7384Etj.A0Y(grhA00, 0);
        Iterator<Map.Entry<Class<?>, GSR>> it = c9598GRe.A02.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            Object key = entryA0l.getKey();
            C7384Etj.A0U(key);
            Class cls = (Class) key;
            GSR gsr = (GSR) entryA0l.getValue();
            if (gsr != null) {
                C9598GRe.A01(gsr, grhA00, grhA00.A00(cls));
            }
        }
        Iterator<Map.Entry<Class<?>, List<G0U<Object, Object>>>> it2 = c9598GRe.A01.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(it2);
            Object key2 = entryA0l2.getKey();
            C7384Etj.A0U(key2);
            List<G0U<Object, Object>> list = (List) entryA0l2.getValue();
            Object objA00 = grhA00.A00((Class<? super Object>) key2);
            C7384Etj.A0X(list);
            for (G0U<Object, Object> g0u : list) {
                GSR gsr2 = c9598GRe.A03.get(g0u);
                if (gsr2 != null) {
                    C9598GRe.A01(gsr2, grhA00, objA00 == null ? null : g0u.invoke(objA00));
                }
            }
        }
        GSB gsb = c9598GRe.A00;
        if (gsb != null) {
            gsb.ANw(grhA00);
        }
    }
}
