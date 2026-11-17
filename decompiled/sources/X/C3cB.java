package X;

import kotlin.Unit;

/* renamed from: X.3cB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3cB extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3cB(Object obj, AOP<T> aop, BRg bRg, AOe<Float> aOe, G0U<? super T, ? extends Object> g0u, G0W<? super T, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$t = i2;
        this.A06 = aop;
        this.A05 = bRg;
        this.A02 = obj;
        this.A04 = aOe;
        this.A03 = g0u;
        this.A00 = g0w;
        this.A01 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$t != 0) {
            AbstractC1532Ako.A03(AnonymousClass005.A0P(obj, obj2), (BRg) this.A03, (G0U) this.A02, (G0U) this.A05, (G0U) this.A04, (G0U) this.A06, AnonymousClass011.A00(this.A00), this.A01);
        } else {
            BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
            C1Dt.A00((AOe) this.A02, (AOP) this.A06, bfmA0P, (BRg) this.A05, (G0U) this.A04, (G0W) this.A03, AnonymousClass011.A00(this.A00), this.A01);
        }
        return Unit.INSTANCE;
    }
}
