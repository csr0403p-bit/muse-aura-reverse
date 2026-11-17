package X;

import kotlin.Unit;

/* renamed from: X.BTc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2302BTc implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        if (this.$t != 0) {
            B1U.A07((BFM) obj, (B1U) this.A01, this.A02, this.A03, this.A04, this.A05, AnonymousClass011.A01(this.A00) | 1);
        } else {
            AOP aop = (AOP) this.A01;
            AOR.A05((AOe) this.A05, (AOQ) this.A02, aop, (BFM) obj, this.A03, this.A04, AnonymousClass011.A00(this.A00));
        }
        return Unit.INSTANCE;
    }

    public C2302BTc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.$t = i2;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj;
        this.A00 = i;
    }
}
