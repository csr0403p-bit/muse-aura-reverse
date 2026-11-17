package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BDa implements InterfaceC1725ApE {
    public static final BDa A00 = new BDa();

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.BUj] */
    @Override // X.InterfaceC1725ApE
    public final Function0<Unit> ANo(AbstractC1718Ap2 abstractC1718Ap2) {
        if (abstractC1718Ap2.isAttachedToWindow()) {
            C1HY c1hyA00 = AbstractC1720Ap8.A00(abstractC1718Ap2);
            if (c1hyA00 != null) {
                return BDZ.A00(abstractC1718Ap2, c1hyA00.getLifecycle());
            }
            throw C3cG.A0Q(AnonymousClass001.A0v(" has no ViewTreeLifecycleOwner", C3cG.A0f(abstractC1718Ap2, "View tree for ")));
        }
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        BSD bsd = new BSD(0, abstractC1718Ap2, c10543HqvA0z);
        abstractC1718Ap2.addOnAttachStateChangeListener(bsd);
        c10543HqvA0z.element = new C2335BUj(10, bsd, abstractC1718Ap2);
        return C2328BUc.A00(c10543HqvA0z, 32);
    }
}
