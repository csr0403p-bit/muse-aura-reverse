package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GRa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9594GRa implements Runnable {
    public static final String __redex_internal_original_name = "SubscriptionManager$onChange$3";
    public final /* synthetic */ GRX A00;
    public final /* synthetic */ GRH A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ List<Function0<Unit>> A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Set<GSR> A05;
    public final /* synthetic */ F1E A06;

    public RunnableC9594GRa(GRX grx, GRH grh, Object obj, List list, Map map, Set set, F1E f1e) {
        this.A00 = grx;
        this.A02 = obj;
        this.A01 = grh;
        this.A03 = list;
        this.A05 = set;
        this.A06 = f1e;
        this.A04 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GSB gsb;
        GRX grx = this.A00;
        Object obj = this.A02;
        GRH grh = this.A01;
        Map<Class<?>, CopyOnWriteArrayList<GSP>> map = grx.A00;
        Class<?> cls = obj.getClass();
        CopyOnWriteArrayList<GSP> copyOnWriteArrayList = map.get(cls);
        if (copyOnWriteArrayList != null) {
            Iterator<GSP> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                GSP next = it.next();
                if (!(next instanceof C9598GRe)) {
                    throw AbstractC7607F5u.A10(next.getClass(), "Action subscribers must be of type ActionSubscriber. Found ");
                }
                ((C9598GRe) next).A04.get(cls);
            }
        }
        Iterator<Function0<Unit>> it2 = this.A03.iterator();
        while (it2.hasNext()) {
            BV7.A1M(it2);
        }
        for (GSR gsr : this.A05) {
            if (gsr instanceof GSB) {
                gsb = (GSB) gsr;
            } else {
                if (!(gsr instanceof C9598GRe)) {
                    if (!(gsr instanceof GSA) && !(gsr instanceof GS0)) {
                        throw C3cG.A0q();
                    }
                    throw C3cG.A0Q("Granular subscribers should not be added to subscribersWithDiffs - must be wrapped as ()-> Unit & added to granularSubscriberCallbacks");
                }
                gsb = ((C9598GRe) gsr).A00;
                if (gsb != null) {
                }
            }
            gsb.ANw(grh);
        }
    }
}
