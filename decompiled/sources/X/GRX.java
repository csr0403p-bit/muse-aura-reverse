package X;

import com.facebook.debug.tracer.Tracer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class GRX {
    public final Map<Class<?>, CopyOnWriteArrayList<GSP>> A00;
    public final Map<Class<?>, List<GSP>> A01;
    public final Map<Class<? extends Object>, Map<G0U<Object, Object>, List<GSP>>> A02;
    public final Executor A03;

    public GRX(Executor executor) {
        C7384Etj.A0Y(executor, 0);
        this.A03 = executor;
        this.A02 = C3cG.A0j();
        this.A01 = C3cG.A0j();
        this.A00 = C60O.A1C();
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/GRH;Ljava/lang/Class<TT;>;LX/G50<*>;)Ljava/lang/Object; */
    public static final Object A00(G50 g50, GRH grh, Class cls) {
        Object objA01;
        Tracer.A01("SubscriptionManager.getRsysOrSharedModel");
        try {
            if (g50 == null) {
                objA01 = grh.A00((Class<? super Object>) cls);
            } else {
                GRD grd = grh.A00;
                objA01 = grd != null ? ((GR7) grd).A00.A01(g50) : null;
            }
            return objA01;
        } finally {
            Tracer.A00();
        }
    }
}
