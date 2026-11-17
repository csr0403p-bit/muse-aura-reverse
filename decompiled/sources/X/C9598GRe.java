package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.GRe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9598GRe implements GSR, GSP {
    public GSB A00;
    public volatile boolean A05 = true;
    public final DQd<G0U<Object, Object>, GSR> A03 = new DQd<>(0);
    public final DQd<Class<?>, GSR> A02 = new DQd<>(0);
    public final ConcurrentHashMap A04 = C60O.A1C();
    public final DQd<Class<?>, List<G0U<Object, Object>>> A01 = new DQd<>(0);

    public static DQd A00(C9598GRe c9598GRe, Object obj, Object obj2) {
        C0862A6j.A02(obj2, 1);
        ((List) obj).add(obj2);
        DQd<G0U<Object, Object>, GSR> dQd = c9598GRe.A03;
        C0862A6j.A02(obj2, 1);
        return dQd;
    }

    public static final void A01(GSR gsr, GRH grh, Object obj) {
        if (gsr instanceof C9598GRe) {
            throw C3cG.A0Q("nested GranularSubscribers not supported");
        }
        if (gsr instanceof GSA) {
            ((G0V) ((C10507Hnt) ((GSA) gsr)).A00).invoke(grh, obj);
            return;
        }
        if (!(gsr instanceof GS0)) {
            if (!(gsr instanceof GSB)) {
                throw C3cG.A0q();
            }
            ((GSB) gsr).ANw(grh);
        } else {
            G0W g0w = ((GS0) gsr).A00;
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            g0w.invoke(grh, null, obj);
        }
    }
}
