package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Bhg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2683Bhg implements C2Kw {
    public final C1HY A00;
    public final C2681Bhe A01;

    @OnLifecycleEvent(EnumC3085Bxl.ON_DESTROY)
    public void onDestroy(C1HY c1hy) {
        C2681Bhe c2681Bhe = this.A01;
        synchronized (c2681Bhe.A01) {
            C2683Bhg c2683BhgA00 = C2681Bhe.A00(c2681Bhe, c1hy);
            if (c2683BhgA00 != null) {
                c2681Bhe.A04(c1hy);
                Map<C2683Bhg, Set<AbstractC2466Bbt>> map = c2681Bhe.A03;
                Iterator it = BV4.A10(c2683BhgA00, map).iterator();
                while (it.hasNext()) {
                    c2681Bhe.A02.remove((AbstractC2466Bbt) it.next());
                }
                map.remove(c2683BhgA00);
                c2683BhgA00.A00.getLifecycle().A05(c2683BhgA00);
            }
        }
    }

    @OnLifecycleEvent(EnumC3085Bxl.ON_START)
    public void onStart(C1HY c1hy) {
        this.A01.A03(c1hy);
    }

    @OnLifecycleEvent(EnumC3085Bxl.ON_STOP)
    public void onStop(C1HY c1hy) {
        this.A01.A04(c1hy);
    }

    public C2683Bhg(C2681Bhe c2681Bhe, C1HY c1hy) {
        this.A00 = c1hy;
        this.A01 = c2681Bhe;
    }
}
