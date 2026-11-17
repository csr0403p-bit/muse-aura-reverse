package X;

/* loaded from: classes4.dex */
public final class A82 implements A84 {
    public final /* synthetic */ A84 A00;
    public final /* synthetic */ A7z A01;

    @Override // X.A84
    public final void onFailure(Throwable th) {
        C7384Etj.A0Y(th, 0);
        this.A01.A03.A04();
        this.A00.onFailure(th);
    }

    @Override // X.A84
    public final void onSuccess(A8F a8f) {
        C7384Etj.A0Y(a8f, 0);
        this.A00.onSuccess(a8f);
    }

    public A82(A84 a84, A7z a7z) {
        this.A00 = a84;
        this.A01 = a7z;
    }
}
