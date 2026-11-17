package X;

import kotlin.Unit;

/* renamed from: X.3bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05483bu extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final long A00;
    public final Object A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0002: IPUT (r2 I:long), (r1 I:X.3bu) (LINE:2) X.3bu.A00 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0004: IPUT (r4 I:java.lang.Object), (r1 I:X.3bu) (LINE:4) X.3bu.A01 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.3bu, X.F3s] */
    public C05483bu(long j, long j2, G0V<? super BFM, ? super Integer, Unit> g0v) {
        long j3;
        Object obj;
        abstractC7559F3s.$t = g0v;
        abstractC7559F3s.A00 = j3;
        abstractC7559F3s.A01 = obj;
        ?? abstractC7559F3s = new AbstractC7559F3s(2);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BFM bfm = (BFM) obj;
        if (AnonymousClass005.A0D(obj2) == 2 && bfm.AKh()) {
            bfm.Afo();
        } else {
            AbstractC046219w.A01(this.A00, (G0V) this.A01, bfm, 0);
        }
        return Unit.INSTANCE;
    }
}
