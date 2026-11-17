package X;

/* renamed from: X.CeC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3769CeC {
    public final long A00(Ce5 ce5, int i, long j) {
        Ce9 ce9 = (Ce9) this;
        long jALc = j - ce9.A00.ALc();
        C3768CeB c3768CeB = (C3768CeB) ce9.A01.get(ce5);
        long j2 = c3768CeB.A00;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r9))), jALc), c3768CeB.A01);
    }
}
