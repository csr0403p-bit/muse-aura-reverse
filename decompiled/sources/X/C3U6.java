package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.3U6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3U6 extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public G0W<? super AXY, ? super C3TG, ? super Constraints, ? extends InterfaceC1134Abi> A00;

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        return this.A00.invoke(axy, c3tg, new Constraints(j));
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, new StringBuilder("LayoutModifierImpl(measureBlock="));
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
