package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public final class CS0 implements CSQ, CSP, CSZ {
    public final CountDownLatch A00 = BV5.A16();

    @Override // X.CSQ
    public final void AS6() {
        this.A00.countDown();
    }

    @Override // X.CSP
    public final void onFailure(Exception exc) {
        this.A00.countDown();
    }

    @Override // X.CSZ
    public final void onSuccess(T t) {
        this.A00.countDown();
    }

    public /* synthetic */ CS0(CS1 cs1) {
    }

    public CS0() {
    }
}
