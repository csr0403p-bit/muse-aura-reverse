package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Chs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3954Chs implements InterfaceC4070ClI {
    public final CountDownLatch A00 = BV5.A16();
    public volatile boolean A01;

    @Override // X.InterfaceC4070ClI
    public final void AXM(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}
