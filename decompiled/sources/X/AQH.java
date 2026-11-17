package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AQH extends AbstractC1439Aj8 implements InterfaceC1448AjH {
    public G0U<? super C2Um, Unit> A00;
    public C2Um A01;

    @Override // X.InterfaceC1448AjH
    public final void ATP(C2Um c2Um) {
        if (C7384Etj.areEqual(this.A01, c2Um)) {
            return;
        }
        this.A01 = c2Um;
        this.A00.invoke(c2Um);
    }
}
