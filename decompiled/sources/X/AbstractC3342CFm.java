package X;

import java.io.Writer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CFm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3342CFm {
    public AbstractC3342CFm A00;
    public C3339CFj A01;
    public InterfaceC3346CFr A02;
    public boolean A03;
    public final AtomicInteger A05 = new AtomicInteger(0);
    public boolean A04 = false;

    public abstract void A06();

    public abstract void A07();

    public abstract void A08();

    public abstract void A09(int i);

    private final void A02() {
        if (this.A05.get() != 0) {
            throw new IllegalStateException("Releasing object with non-zero refCount.");
        }
        A08();
        if (this.A01 != null) {
            A09(32);
        }
        A06();
        this.A03 = false;
        this.A04 = false;
        this.A02 = null;
        this.A00 = null;
        if (this.A01 != null) {
            A07();
        }
    }

    public final void A03() {
        int iDecrementAndGet = this.A05.decrementAndGet();
        if (iDecrementAndGet != 1) {
            if (iDecrementAndGet < 0) {
                throw new IllegalStateException(FGI.A0H("release() has been called with refCount < 0. Ref count: ", iDecrementAndGet));
            }
            AbstractC3342CFm abstractC3342CFm = this.A00;
            if (abstractC3342CFm == null) {
                A02();
            } else {
                StringBuilder sb = new StringBuilder("Trying to release, when added to ");
                sb.append(abstractC3342CFm);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public final void A04() {
        if (this.A04) {
            throw new IllegalStateException("Attempting to re-attach a detached ParamsCollection");
        }
        AbstractC3342CFm abstractC3342CFm = this.A00;
        if (abstractC3342CFm == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("Already added to ");
        sb.append(abstractC3342CFm);
        throw new IllegalStateException(sb.toString());
    }

    public final void A05() {
        int iDecrementAndGet = this.A05.decrementAndGet();
        if (iDecrementAndGet == 1) {
            this.A04 = true;
            this.A00 = null;
        } else {
            if (iDecrementAndGet < 0) {
                throw new IllegalStateException(FGI.A0H("releaseFromParent() has been called with refCount < 0. Ref count: ", iDecrementAndGet));
            }
            A02();
        }
    }

    public final void A0A(C3339CFj c3339CFj) {
        int iIncrementAndGet = this.A05.incrementAndGet();
        if (iIncrementAndGet != 1) {
            throw new IllegalStateException(FGI.A0H("Acquired object with non-zero initial refCount current = ", iIncrementAndGet));
        }
        this.A01 = c3339CFj;
        if (this.A03) {
            throw new IllegalStateException("Internal bug, expected object to be immutable");
        }
        this.A03 = true;
    }

    public final void A0B(Writer writer) {
        C1H.A01(writer, "Writer is null!");
        C1H.A01(this.A02, "No encoder set, please call setEncoder() first!");
        this.A02.AA5(this, writer);
    }
}
