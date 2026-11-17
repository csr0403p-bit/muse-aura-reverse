package X;

import android.os.Handler;

/* renamed from: X.BrQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2997BrQ implements BWf {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ Runnable A02;

    public C2997BrQ(Handler handler, Runnable runnable, long j) {
        this.A01 = handler;
        this.A02 = runnable;
        this.A00 = j;
    }

    @Override // X.BWf
    public final void ARj() {
        this.A01.postDelayed(this.A02, this.A00);
    }
}
