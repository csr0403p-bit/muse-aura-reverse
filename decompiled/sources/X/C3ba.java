package X;

import kotlin.Unit;

/* renamed from: X.3ba, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3ba implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C3ba(BRg bRg, G0V g0v, int i, int i2, int i3) {
        this.$t = i3;
        this.A02 = bRg;
        this.A03 = g0v;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        Object obj3 = this.A02;
        if (i != 0) {
            G0V g0v = (G0V) this.A03;
            int i2 = this.A00;
            C07w.A00((BRg) obj3, g0v, (BFM) obj, AnonymousClass011.A00(i2), this.A01);
        } else {
            G0V g0v2 = (G0V) this.A03;
            int i3 = this.A00;
            AbstractC1913AtY.A01((BRg) obj3, g0v2, (BFM) obj, AnonymousClass011.A00(i3), this.A01);
        }
        return Unit.INSTANCE;
    }
}
