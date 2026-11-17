package X;

/* renamed from: X.GBa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9247GBa<T> extends GBL<T> {
    public static final String __redex_internal_original_name = "JobSupport$AwaitContinuation";
    public final GBM A00;

    public C9247GBa(HtJ<? super T> htJ, GBM gbm) {
        super(1, htJ);
        this.A00 = gbm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GBL
    public final Throwable A0G(HoC hoC) {
        Throwable th;
        Object obj = GBM.A01.get(this.A00);
        return (!(obj instanceof GBS) || (th = (Throwable) GBS.A03.get(obj)) == null) ? obj instanceof C10474Hkl ? ((C10474Hkl) obj).A00 : hoC.ADQ() : th;
    }
}
