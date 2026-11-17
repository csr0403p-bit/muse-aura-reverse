package X;

import kotlin.Unit;

/* renamed from: X.3cC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3cC extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3cC(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, C1XY c1xy, Long l, Long l2, G0U g0u, int i, long j) {
        super(2);
        this.$t = 1;
        this.A05 = c1xy;
        this.A06 = g0u;
        this.A01 = j;
        this.A09 = l;
        this.A04 = l2;
        this.A07 = null;
        this.A03 = c1x9;
        this.A08 = interfaceC04801Xj;
        this.A02 = c1Wz;
        this.A00 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        if (i != 0) {
            C1XY c1xy = (C1XY) this.A05;
            G0U g0u = (G0U) this.A06;
            long j = this.A01;
            Long l = (Long) this.A09;
            Long l2 = (Long) this.A04;
            C1XA.A04((C1Wz) this.A02, (C1X9) this.A03, (InterfaceC04801Xj) this.A08, c1xy, bfmA0P, l, l2, g0u, AnonymousClass011.A00(this.A00), j);
        } else {
            Long l3 = (Long) this.A08;
            long j2 = this.A01;
            G0U g0u2 = (G0U) this.A05;
            G0U g0u3 = (G0U) this.A06;
            AbstractC04741Xc abstractC04741Xc = (AbstractC04741Xc) this.A02;
            ADq aDq = (ADq) this.A09;
            C1XA.A03((C1Wz) this.A03, (C1X9) this.A04, (InterfaceC04801Xj) this.A07, abstractC04741Xc, bfmA0P, l3, g0u2, g0u3, aDq, AnonymousClass011.A00(this.A00), j2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Long;JLX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/ADq;LX/1X9;LX/1Xj;LX/1Wz;I)V */
    public C3cC(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, Long l, G0U g0u, G0U g0u2, ADq aDq, int i, long j) {
        super(2);
        this.$t = 0;
        this.A08 = l;
        this.A01 = j;
        this.A05 = g0u;
        this.A06 = g0u2;
        this.A02 = abstractC04741Xc;
        this.A09 = aDq;
        this.A04 = c1x9;
        this.A07 = interfaceC04801Xj;
        this.A03 = c1Wz;
        this.A00 = i;
    }
}
