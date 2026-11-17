package X;

import kotlin.Unit;

/* renamed from: X.8iD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iD implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public C8iD(C059672t c059672t, G0V g0v, int i, long j) {
        this.$t = 2;
        this.A01 = j;
        this.A02 = c059672t;
        this.A03 = g0v;
        this.A00 = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                BFM bfm = (BFM) obj;
                C73F.A01(bfm, (C70B) this.A02, (G0V) this.A03, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 1:
                BFM bfm2 = (BFM) obj;
                C73F.A00(bfm2, (C70B) this.A02, (G0V) this.A03, AnonymousClass011.A00(this.A00), this.A01);
                break;
            default:
                BFM bfm3 = (BFM) obj;
                C71d.A01(bfm3, (C059672t) this.A02, (G0V) this.A03, AnonymousClass011.A00(this.A00), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }

    public C8iD(C70B c70b, G0V g0v, int i, int i2, long j) {
        this.$t = i2;
        if (i2 != 0) {
            this.A02 = c70b;
            this.A01 = j;
        } else {
            this.A01 = j;
            this.A02 = c70b;
        }
        this.A03 = g0v;
        this.A00 = i;
    }
}
