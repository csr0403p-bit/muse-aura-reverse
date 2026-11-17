package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Cht, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3955Cht implements InterfaceC3959Ci2 {
    public CountDownLatch A00 = new CountDownLatch(1);
    public boolean A01 = true;

    @Override // X.InterfaceC3959Ci2
    public final synchronized void ATk(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}
