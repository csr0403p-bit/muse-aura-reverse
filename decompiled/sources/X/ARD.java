package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class ARD {
    public static AtomicInteger A00 = new AtomicInteger(0);

    public static final BRg A00(BRg bRg, G0U<? super InterfaceC0857A6e, Unit> g0u) {
        return bRg.then(new ASH(g0u));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;ZLX/G0U<-LX/A6e;Lkotlin/Unit;>;)LX/BRg; */
    public static final BRg A01(BRg bRg, G0U g0u, boolean z) {
        return bRg.then(new ASG(z, g0u));
    }

    public static final void A02(ASF asf, C0919AHv c0919AHv) {
        BHD bhd = asf.A02;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(c0919AHv));
        Iterator<Map.Entry<? extends C0920AHw<?>, ? extends Object>> it = c0919AHv.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            C0920AHw c0920AHw = (C0920AHw) entryA0l.getKey();
            linkedHashMapA15.put(c0920AHw.A01, entryA0l.getValue());
        }
        bhd.A01("properties", linkedHashMapA15);
    }
}
