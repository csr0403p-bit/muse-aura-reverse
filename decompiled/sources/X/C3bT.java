package X;

import kotlin.Unit;

/* renamed from: X.3bT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bT implements Ht9, G0V {
    public final int $t;
    public final long A00;
    public final Object A01;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        long j = this.A00;
        G0V g0v = (G0V) this.A01;
        BFM bfm = (BFM) obj;
        int iA0F = AnonymousClass001.A0F(obj2);
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(iA0F), bfm, iA0F)) {
            C19W.A02(bfm, null, null, g0v, 0, 6, j);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public C3bT(long j, G0V g0v, int i) {
        this.$t = i;
        this.A00 = j;
        this.A01 = g0v;
    }
}
