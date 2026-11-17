package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Bhf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2682Bhf implements InterfaceC2783Bl3, C2Kw {
    public final C2603BfF A01;
    public final C1HY A02;
    public final Object A03 = C3cG.A0T();
    public boolean A00 = false;

    public final List<BfD> A00() {
        List<BfD> listUnmodifiableList;
        synchronized (this.A03) {
            listUnmodifiableList = Collections.unmodifiableList(this.A01.A02());
        }
        return listUnmodifiableList;
    }

    public final void A01() {
        synchronized (this.A03) {
            if (!this.A00) {
                onStop(this.A02);
                this.A00 = true;
            }
        }
    }

    @Override // X.InterfaceC2783Bl3
    public final InterfaceC2622Bfo ADF() {
        return this.A01.A0C;
    }

    @Override // X.InterfaceC2783Bl3
    public final InterfaceC2546BdX ADI() {
        return this.A01.A0D;
    }

    @OnLifecycleEvent(EnumC3085Bxl.ON_DESTROY)
    public void onDestroy(C1HY c1hy) {
        synchronized (this.A03) {
            C2603BfF c2603BfF = this.A01;
            c2603BfF.A05(c2603BfF.A02());
        }
    }

    @OnLifecycleEvent(EnumC3085Bxl.ON_PAUSE)
    public void onPause(C1HY c1hy) {
        this.A01.A0B.Ach(false);
    }

    @OnLifecycleEvent(EnumC3085Bxl.ON_RESUME)
    public void onResume(C1HY c1hy) {
        this.A01.A0B.Ach(true);
    }

    @OnLifecycleEvent(EnumC3085Bxl.ON_START)
    public void onStart(C1HY c1hy) {
        synchronized (this.A03) {
            if (!this.A00) {
                this.A01.A03();
            }
        }
    }

    @OnLifecycleEvent(EnumC3085Bxl.ON_STOP)
    public void onStop(C1HY c1hy) {
        synchronized (this.A03) {
            if (!this.A00) {
                this.A01.A04();
            }
        }
    }

    public C2682Bhf(C2603BfF c2603BfF, C1HY c1hy) {
        this.A02 = c1hy;
        this.A01 = c2603BfF;
        if (C8j3.A0m(c1hy).A00(EnumC10573Huf.A06)) {
            c2603BfF.A03();
        } else {
            c2603BfF.A04();
        }
        c1hy.getLifecycle().A04(this);
    }
}
