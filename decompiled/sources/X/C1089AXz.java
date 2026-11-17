package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.AXz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1089AXz implements InterfaceC1559AlZ {
    public final GraphicsLayer A00;
    public final ASQ A01;

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
        this.A01.AaE(this.A00);
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        this.A01.AaE(this.A00);
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
    }

    public C1089AXz(ASQ asq) {
        this.A01 = asq;
        this.A00 = asq.A7n();
    }
}
