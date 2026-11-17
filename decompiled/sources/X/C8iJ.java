package X;

import kotlin.Unit;

/* renamed from: X.8iJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iJ implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        if (this.$t != 0) {
            Object obj3 = this.A02;
            Object obj4 = this.A03;
            C1HY c1hy = (C1HY) this.A04;
            G0U g0u = (G0U) this.A05;
            int i = this.A00;
            C7bA.A03((BFM) obj, c1hy, obj3, obj4, g0u, AnonymousClass011.A00(i), this.A01);
        } else {
            Object obj5 = this.A02;
            Object obj6 = this.A03;
            C1HY c1hy2 = (C1HY) this.A04;
            G0U g0u2 = (G0U) this.A05;
            int i2 = this.A00;
            C7bA.A04((BFM) obj, c1hy2, obj5, obj6, g0u2, AnonymousClass011.A00(i2), this.A01);
        }
        return Unit.INSTANCE;
    }

    public C8iJ(C1HY c1hy, Object obj, Object obj2, G0U g0u, int i, int i2, int i3) {
        this.$t = i3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = c1hy;
        this.A05 = g0u;
        this.A00 = i;
        this.A01 = i2;
    }
}
