package X;

import android.os.Handler;

/* renamed from: X.FNu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC7978FNu extends Handler implements FO9 {
    @Override // X.FO9
    public final boolean AOp() {
        return AnonymousClass002.A1Z(Thread.currentThread(), super.getLooper().getThread());
    }

    @Override // X.FO9
    public final void AYE(Runnable runnable) {
        super.post(runnable);
    }
}
