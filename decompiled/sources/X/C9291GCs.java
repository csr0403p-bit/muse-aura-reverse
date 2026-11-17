package X;

import kotlin.Unit;

/* renamed from: X.GCs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9291GCs implements HsS {
    public long A00;
    public final Object A01;
    public final HtJ<Unit> A02;
    public final C9290GCr<?> A03;

    @Override // X.HsS
    public final void dispose() {
        C9290GCr<?> c9290GCr = this.A03;
        synchronized (c9290GCr) {
            long j = this.A00;
            if (j >= Math.min(c9290GCr.A02, c9290GCr.A03)) {
                Object[] objArr = c9290GCr.A04;
                C7384Etj.A0X(objArr);
                int length = (objArr.length - 1) & ((int) j);
                if (objArr[length] == this) {
                    objArr[length] = AbstractC9294GCw.A00;
                    C9290GCr.A05(c9290GCr);
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GCr<*>;JLjava/lang/Object;LX/HtJ<-Lkotlin/Unit;>;)V */
    public C9291GCs(Object obj, HtJ htJ, C9290GCr c9290GCr, long j) {
        this.A03 = c9290GCr;
        this.A00 = j;
        this.A01 = obj;
        this.A02 = htJ;
    }
}
