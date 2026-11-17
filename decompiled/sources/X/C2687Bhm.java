package X;

import java.util.Set;

/* renamed from: X.Bhm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2687Bhm implements InterfaceC2655Bgn<Boolean> {
    public final /* synthetic */ C2823Bm4 A00;

    public C2687Bhm(C2823Bm4 c2823Bm4) {
        this.A00 = c2823Bm4;
    }

    @Override // X.InterfaceC2655Bgn
    public final /* bridge */ /* synthetic */ void AUJ(Boolean bool) {
        C2823Bm4 c2823Bm4 = this.A00;
        Set<BmF> set = C2823Bm4.A0t;
        C2680Bhd.A01(c2823Bm4.A0c, bool);
    }

    @Override // X.InterfaceC2655Bgn
    public final void onError(Throwable th) {
        C2823Bm4 c2823Bm4 = this.A00;
        Set<BmF> set = C2823Bm4.A0t;
        C2680Bhd.A01(c2823Bm4.A0c, new C2444BbX(th));
    }
}
