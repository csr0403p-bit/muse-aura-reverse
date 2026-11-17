package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* renamed from: X.BfU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2607BfU implements BpZ<Void> {
    public final /* synthetic */ Bf9 A00;
    public final /* synthetic */ ListenableFuture A01;
    public final /* synthetic */ boolean A02;

    public C2607BfU(Bf9 bf9, ListenableFuture listenableFuture, boolean z) {
        this.A00 = bf9;
        this.A01 = listenableFuture;
        this.A02 = z;
    }

    @Override // X.BpZ
    public final void onFailure(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        AbstractC2875Bni.A05("VideoCapture", "Surface update completed with unexpected exception", th);
    }

    @Override // X.BpZ
    public final /* bridge */ /* synthetic */ void onSuccess(Void r5) {
        Integer num;
        ListenableFuture<Void> listenableFuture = this.A01;
        Bf9 bf9 = this.A00;
        if (listenableFuture != bf9.A05 || (num = bf9.A06) == C79.A0C) {
            return;
        }
        Integer num2 = this.A02 ? C79.A00 : C79.A01;
        if (num2 != num) {
            bf9.A06 = num2;
            bf9.A0X().AW2(num2);
        }
    }
}
