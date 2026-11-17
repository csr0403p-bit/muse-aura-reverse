package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GCu extends AbstractC9293GCv<C9290GCr<?>> {
    public long A00 = -1;
    public HtJ<? super Unit> A01;

    @Override // X.AbstractC9293GCv
    public final /* bridge */ /* synthetic */ boolean A00(C9290GCr<?> c9290GCr) {
        C9290GCr<?> c9290GCr2 = c9290GCr;
        if (this.A00 >= 0) {
            return false;
        }
        long j = c9290GCr2.A03;
        if (j < c9290GCr2.A02) {
            c9290GCr2.A02 = j;
        }
        this.A00 = j;
        return true;
    }
}
