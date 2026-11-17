package X;

import android.view.KeyEvent;

/* loaded from: classes4.dex */
public final class AXL extends AbstractC1439Aj8 implements InterfaceC1527Akg {
    public G0U<? super C2AA, Boolean> A00;
    public G0U<? super C2AA, Boolean> A01;

    @Override // X.InterfaceC1527Akg
    public final boolean ATl(KeyEvent keyEvent) {
        G0U<? super C2AA, Boolean> g0u = this.A00;
        if (g0u != null) {
            return AnonymousClass003.A1X(new C2AA(keyEvent), g0u);
        }
        return false;
    }

    @Override // X.InterfaceC1527Akg
    public final boolean AUr(KeyEvent keyEvent) {
        G0U<? super C2AA, Boolean> g0u = this.A01;
        if (g0u != null) {
            return AnonymousClass003.A1X(new C2AA(keyEvent), g0u);
        }
        return false;
    }
}
