package X;

import kotlin.Unit;

/* renamed from: X.BSm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2286BSm implements Ht9, G0U {
    public final int $t;
    public final long A00;

    public C2286BSm(long j, int i) {
        this.$t = i;
        this.A00 = j;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        HtJ htJ;
        Object objA0s;
        if (this.$t != 0) {
            long j = this.A00;
            C2270BQi c2270BQi = (C2270BQi) obj;
            G0U<? super Long, ? extends R> g0u = c2270BQi.A00;
            if (g0u != 0 && (htJ = c2270BQi.A01) != null) {
                try {
                    objA0s = g0u.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                htJ.resumeWith(objA0s);
            }
        } else {
            ((InterfaceC0857A6e) obj).Aca(AWu.A00, new AWw(AWv.A02, C79.A01, this.A00, true));
        }
        return Unit.INSTANCE;
    }
}
