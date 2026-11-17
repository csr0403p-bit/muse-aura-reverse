package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GAc extends GBP {
    public final HtJ<Unit> A00;

    @Override // X.GBP
    public final void A06(Throwable th) {
        this.A00.resumeWith(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GAc(HtJ<? super Unit> htJ) {
        this.A00 = htJ;
    }
}
