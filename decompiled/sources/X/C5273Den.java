package X;

import androidx.health.platform.client.impl.ipc.ApiVersionException;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Den, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5273Den implements CQG<Integer> {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C5272Dem A01;
    public final /* synthetic */ InterfaceC5268Dei A02;
    public final /* synthetic */ SettableFuture A03;

    public C5273Den(C5272Dem c5272Dem, InterfaceC5268Dei interfaceC5268Dei, SettableFuture settableFuture, int i) {
        this.A01 = c5272Dem;
        this.A00 = i;
        this.A03 = settableFuture;
        this.A02 = interfaceC5268Dei;
    }

    @Override // X.CQG
    public final void onFailure(Throwable th) {
        this.A03.setException(th);
    }

    @Override // X.CQG
    public final /* bridge */ /* synthetic */ void onSuccess(Integer num) {
        int iA0F = AnonymousClass001.A0F(num);
        int i = this.A00;
        C5272Dem c5272Dem = this.A01;
        C5285Df0 c5285Df0 = c5272Dem.A04;
        if (iA0F < i) {
            BV4.A1D(c5285Df0.A01, new C5276Deq(c5272Dem.A03), 3);
            this.A03.setException(new ApiVersionException(iA0F, i));
        } else {
            BV4.A1D(c5285Df0.A01, new C5274Deo(c5272Dem, this.A02, c5272Dem.A03, this.A03), 3);
        }
    }
}
