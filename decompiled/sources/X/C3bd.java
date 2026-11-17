package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.Unit;

/* renamed from: X.3bd, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bd implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;

    public C3bd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2, int i3, boolean z, boolean z2) {
        this.$t = i3;
        this.A02 = obj7;
        this.A03 = obj5;
        this.A04 = obj4;
        this.A0A = z;
        this.A05 = obj3;
        this.A06 = obj6;
        this.A07 = obj2;
        this.A0B = z2;
        this.A08 = obj;
        this.A09 = obj8;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                BRg bRg = (BRg) this.A02;
                LazyListState lazyListState = (LazyListState) this.A03;
                C3TQ c3tq = (C3TQ) this.A04;
                boolean z = this.A0A;
                InterfaceC1185Ado interfaceC1185Ado = (InterfaceC1185Ado) this.A05;
                C3TH c3th = (C3TH) this.A06;
                BLD bld = (BLD) this.A07;
                boolean z2 = this.A0B;
                InterfaceC1260Afz interfaceC1260Afz = (InterfaceC1260Afz) this.A08;
                G0U g0u = (G0U) this.A09;
                int i = this.A00;
                C1YY.A01(interfaceC1260Afz, bld, interfaceC1185Ado, c3tq, lazyListState, (BFM) obj, c3th, bRg, g0u, AnonymousClass011.A00(i), this.A01, z, z2);
                break;
            case 1:
                BRg bRg2 = (BRg) this.A02;
                LazyListState lazyListState2 = (LazyListState) this.A03;
                C3TQ c3tq2 = (C3TQ) this.A04;
                boolean z3 = this.A0A;
                InterfaceC04981Yd interfaceC04981Yd = (InterfaceC04981Yd) this.A05;
                C1AC c1ac = (C1AC) this.A06;
                BLD bld2 = (BLD) this.A07;
                boolean z4 = this.A0B;
                InterfaceC1260Afz interfaceC1260Afz2 = (InterfaceC1260Afz) this.A08;
                G0U g0u2 = (G0U) this.A09;
                int i2 = this.A00;
                C1YY.A00(interfaceC1260Afz2, bld2, interfaceC04981Yd, c3tq2, lazyListState2, (BFM) obj, c1ac, bRg2, g0u2, AnonymousClass011.A00(i2), this.A01, z3, z4);
                break;
            default:
                C0to c0to = (C0to) this.A02;
                BRg bRg3 = (BRg) this.A03;
                LazyGridState lazyGridState = (LazyGridState) this.A04;
                C3TQ c3tq3 = (C3TQ) this.A05;
                boolean z5 = this.A0A;
                InterfaceC1185Ado interfaceC1185Ado2 = (InterfaceC1185Ado) this.A06;
                InterfaceC04981Yd interfaceC04981Yd2 = (InterfaceC04981Yd) this.A07;
                BLD bld3 = (BLD) this.A08;
                boolean z6 = this.A0B;
                G0U g0u3 = (G0U) this.A09;
                int i3 = this.A00;
                C1YZ.A01(bld3, interfaceC04981Yd2, interfaceC1185Ado2, c3tq3, c0to, lazyGridState, (BFM) obj, bRg3, g0u3, AnonymousClass011.A00(i3), this.A01, z5, z6);
                break;
        }
        return Unit.INSTANCE;
    }
}
