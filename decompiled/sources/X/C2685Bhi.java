package X;

/* renamed from: X.Bhi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2685Bhi<T> implements InterfaceC2655Bgn<T> {
    public final BeM<T> A00;

    @Override // X.InterfaceC2655Bgn
    public final void AUJ(T t) {
        this.A00.accept(t);
    }

    @Override // X.InterfaceC2655Bgn
    public final void onError(Throwable th) {
        AbstractC2875Bni.A05("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    public C2685Bhi(BeM<T> beM) {
        this.A00 = beM;
    }
}
