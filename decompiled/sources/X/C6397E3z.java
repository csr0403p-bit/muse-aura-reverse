package X;

import java.math.BigInteger;

/* renamed from: X.E3z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6397E3z implements InterfaceC5509Djl {
    public final /* synthetic */ C6394E3w A00;

    public C6397E3z(C6394E3w c6394E3w) {
        this.A00 = c6394E3w;
    }

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return (this.A00.A05 * 1000000) / r0.A0B.A00;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        C6394E3w c6394E3w = this.A00;
        long jA05 = BV4.A05(c6394E3w.A0B.A00 * j);
        long j2 = c6394E3w.A09;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jA05);
        long j3 = c6394E3w.A08;
        E29 e29 = new E29(j, Math.max(j2, Math.min((j2 + bigIntegerValueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(c6394E3w.A05)).longValue()) - 30000, j3 - 1)));
        return new DkQ(e29, e29);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }
}
