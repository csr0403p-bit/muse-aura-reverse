package X;

import kotlin.Unit;

/* renamed from: X.8iE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iE implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        Object obj3 = this.A04;
        if (i != 0) {
            int i2 = this.A00;
            int i3 = this.A01;
            G0W g0w = (G0W) this.A05;
            int i4 = this.A02;
            BFM bfm = (BFM) obj;
            C72Z.A00(bfm, (C76B) obj3, g0w, i2, i3, AnonymousClass011.A00(i4), this.A03);
        } else {
            int i5 = this.A00;
            int i6 = this.A01;
            G0W g0w2 = (G0W) this.A05;
            int i7 = this.A02;
            BFM bfm2 = (BFM) obj;
            C72Y.A00(bfm2, (C76B) obj3, g0w2, i5, i6, AnonymousClass011.A00(i7), this.A03);
        }
        return Unit.INSTANCE;
    }

    public C8iE(C76B c76b, G0W g0w, int i, int i2, int i3, int i4, int i5) {
        this.$t = i5;
        this.A04 = c76b;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = g0w;
        this.A02 = i3;
        this.A03 = i4;
    }
}
