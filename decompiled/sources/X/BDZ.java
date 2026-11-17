package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class BDZ {
    public static final Function0<Unit> A00(AbstractC1718Ap2 abstractC1718Ap2, F2N f2n) {
        if (((C5303Dfm) f2n).A01.compareTo(EnumC10573Huf.A03) > 0) {
            C2290BSq c2290BSq = new C2290BSq(abstractC1718Ap2, 0);
            f2n.A04(c2290BSq);
            return new C2335BUj(11, f2n, c2290BSq);
        }
        StringBuilder sbA0f = C3cG.A0f(abstractC1718Ap2, "Cannot configure ");
        sbA0f.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        sbA0f.append(f2n);
        throw C3cG.A0Q(AnonymousClass001.A0v("is already destroyed", sbA0f));
    }
}
