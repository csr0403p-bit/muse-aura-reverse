package X;

import kotlin.Unit;

/* renamed from: X.Ajg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1473Ajg extends AbstractC1439Aj8 {
    public long A00;
    public long A01;
    public InterfaceC1435Aj4 A02;
    public G0U<? super C2LD, Unit> A03;

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        InterfaceC1435Aj4 interfaceC1435Aj4 = this.A02;
        if (interfaceC1435Aj4 != null) {
            interfaceC1435Aj4.Ahh();
        }
        this.A02 = AbstractC1462AjV.A01(this, this.A03, this.A01, this.A00);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        InterfaceC1435Aj4 interfaceC1435Aj4 = this.A02;
        if (interfaceC1435Aj4 != null) {
            interfaceC1435Aj4.Ahh();
        }
        this.A02 = null;
    }
}
