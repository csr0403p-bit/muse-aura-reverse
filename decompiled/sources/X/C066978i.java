package X;

import androidx.compose.runtime.LeftCompositionCancellationException;

/* renamed from: X.78i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C066978i implements InterfaceC1559AlZ {
    public final C3UX A00;

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        C3UX c3ux = this.A00;
        if (c3ux instanceof C067078j) {
            ((C067078j) c3ux).A00();
        } else {
            Hxb.A03(new LeftCompositionCancellationException(), c3ux);
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        C3UX c3ux = this.A00;
        if (c3ux instanceof C067078j) {
            ((C067078j) c3ux).A00();
        } else {
            Hxb.A03(new LeftCompositionCancellationException(), c3ux);
        }
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
    }

    public C066978i(C3UX c3ux) {
        this.A00 = c3ux;
    }
}
