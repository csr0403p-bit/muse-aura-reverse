package X;

import kotlin.Unit;

/* renamed from: X.AXu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1086AXu extends Ab8<AXs> {
    public final C1085AXt A00;
    public final G0U<InterfaceC1497Ak4, AaC> A01;
    public final G0U<HtJ<? super Unit>, Object> A02;
    public final G0U<HtJ<? super Unit>, Object> A03;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1086AXu) {
                C1086AXu c1086AXu = (C1086AXu) obj;
                if (this.A00 != c1086AXu.A00 || this.A03 != c1086AXu.A03 || this.A02 != c1086AXu.A02 || this.A01 != c1086AXu.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new AXs(this.A00, this.A03, this.A02, this.A01);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, (((AnonymousClass005.A0E(this.A00) + C60R.A01(this.A03)) * 31) + C8j4.A0E(this.A02, 0)) * 31);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AXs aXs = (AXs) abstractC1439Aj8;
        C1085AXt c1085AXt = this.A00;
        aXs.A00.A00 = null;
        aXs.A00 = c1085AXt;
        c1085AXt.A00 = aXs;
        c1085AXt.A01 = aXs.isAttached ? C79.A0C : C79.A01;
        aXs.A03 = this.A03;
        aXs.A02 = this.A02;
        aXs.A01 = this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1086AXu(C1085AXt c1085AXt, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, G0U<? super HtJ<? super Unit>, ? extends Object> g0u2, G0U<? super InterfaceC1497Ak4, AaC> g0u3) {
        this.A00 = c1085AXt;
        this.A03 = g0u;
        this.A02 = g0u2;
        this.A01 = g0u3;
    }
}
