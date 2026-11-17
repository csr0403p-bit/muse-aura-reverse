package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AaF extends AbstractC1439Aj8 implements InterfaceC1407Aic {
    public long A00;
    public G0U<? super BL4, Unit> A01;

    @Override // X.InterfaceC1407Aic
    public final void AVH(long j) {
        if (this.A00 != j) {
            this.A01.invoke(BL4.A00(j));
            this.A00 = j;
        }
    }
}
