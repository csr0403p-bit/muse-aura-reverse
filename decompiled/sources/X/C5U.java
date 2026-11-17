package X;

import java.io.File;

/* loaded from: classes5.dex */
public final class C5U implements InterfaceC3269C6v {
    @Override // X.InterfaceC3269C6v
    public final EnumC3250C5k getName() {
        return EnumC3250C5k.A09;
    }

    @Override // X.InterfaceC3269C6v
    public final BWq getWhenToInit() {
        return BWq.EARLY_NATIVE;
    }

    @Override // X.InterfaceC3269C6v
    public final void init(C3241C4y c3241C4y) {
        if (C98.A00 == C98.A03) {
            File file = c3241C4y.A03().A05;
            BeS.A03(file, "Did you call SessionManager.init()?");
            AbstractC3225C4i abstractC3225C4iA00 = C2b.A00(file);
            if (abstractC3225C4iA00 != null) {
                C98.A00(abstractC3225C4iA00);
            }
        }
    }
}
