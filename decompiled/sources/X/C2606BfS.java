package X;

/* renamed from: X.BfS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2606BfS implements InterfaceC2655Bgn<Boolean> {
    public BfV A00;
    public boolean A01;

    @Override // X.InterfaceC2655Bgn
    public final void onError(Throwable th) {
        AbstractC2875Bni.A06("VideoCapture", "SourceStreamRequirementObserver#onError", th);
    }

    public final void A00() {
        BeS.A07(AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread()), "SourceStreamRequirementObserver can be closed from main thread only");
        AbstractC2875Bni.A01("VideoCapture", FGI.A0r("SourceStreamRequirementObserver#close: mIsSourceStreamRequired = ", this.A01));
        BfV bfV = this.A00;
        if (bfV == null) {
            AbstractC2875Bni.A01("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            return;
        }
        if (this.A01) {
            this.A01 = false;
            bfV.A8h();
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC2655Bgn
    public final /* bridge */ /* synthetic */ void AUJ(Boolean bool) {
        BeS.A07(AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread()), "SourceStreamRequirementObserver can be updated from main thread only");
        boolean zEquals = Boolean.TRUE.equals(bool);
        if (this.A01 != zEquals) {
            this.A01 = zEquals;
            BfV bfV = this.A00;
            if (bfV == null) {
                AbstractC2875Bni.A01("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (zEquals) {
                bfV.ANU();
            } else {
                bfV.A8h();
            }
        }
    }
}
