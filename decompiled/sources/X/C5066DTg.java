package X;

import bolts.ExecutorException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.DTg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5066DTg<TResult> {
    public static C5066DTg<Boolean> A06;
    public static C5066DTg<Boolean> A07;
    public static C5066DTg<?> A08;
    public static C5066DTg<?> A09;
    public static final Executor A0A;
    public static final Executor A0B;
    public static final ExecutorService A0C;
    public Exception A00;
    public TResult A01;
    public boolean A03;
    public boolean A04;
    public final Object A05 = C3cG.A0T();
    public List<InterfaceC5071DTl<TResult, Void>> A02 = C3cG.A0h();

    static {
        C4871D9r c4871D9r = C4871D9r.A03;
        A0C = c4871D9r.A01;
        A0A = c4871D9r.A00;
        A0B = C4873D9t.A03.A00;
        A09 = new C5066DTg<>((Object) null);
        A07 = new C5066DTg<>(true);
        A06 = new C5066DTg<>(AnonymousClass001.A0h());
        A08 = new C5066DTg<>(true);
    }

    public static C5066DTg A00(Callable callable, Executor executor) {
        C5067DTh c5067DTh = new C5067DTh();
        try {
            executor.execute(new RunnableC5069DTj(c5067DTh, callable));
        } catch (Exception e) {
            c5067DTh.A00(new ExecutorException("An exception was thrown by an Executor", e));
        }
        return c5067DTh.A00;
    }

    public static void A01(C5066DTg c5066DTg) {
        synchronized (c5066DTg.A05) {
            Iterator<InterfaceC5071DTl<TResult, Void>> it = c5066DTg.A02.iterator();
            while (it.hasNext()) {
                try {
                    try {
                        it.next().Agq(c5066DTg);
                    } catch (Exception e) {
                        throw BV4.A0e(e);
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
            c5066DTg.A02 = null;
        }
    }

    public final boolean A02() {
        boolean zA1X;
        synchronized (this.A05) {
            zA1X = AnonymousClass002.A1X(this.A00);
        }
        return zA1X;
    }

    public final boolean A03() {
        boolean z;
        Object obj = this.A05;
        synchronized (obj) {
            z = false;
            if (!this.A04) {
                z = true;
                this.A04 = true;
                this.A03 = true;
                obj.notifyAll();
                A01(this);
            }
        }
        return z;
    }

    public final boolean A04(TResult tresult) {
        boolean z;
        Object obj = this.A05;
        synchronized (obj) {
            z = false;
            if (!this.A04) {
                z = true;
                this.A04 = true;
                this.A01 = tresult;
                obj.notifyAll();
                A01(this);
            }
        }
        return z;
    }

    public C5066DTg(TResult tresult) {
        A04(tresult);
    }

    public C5066DTg(boolean z) {
        A03();
    }

    public C5066DTg() {
    }
}
