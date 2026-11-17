package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* renamed from: X.5KQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5KQ implements InterfaceC2349BUy, PointerInputEventHandler {
    public final /* synthetic */ G0V<P1, HtJ<? super R>, Object> A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, this.A00);
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(BRr bRr, HtJ htJ) {
        return this.A00.invoke(bRr, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5KQ(G0V<? super P1, ? super HtJ<? super R>, ? extends Object> g0v) {
        this.A00 = g0v;
    }
}
