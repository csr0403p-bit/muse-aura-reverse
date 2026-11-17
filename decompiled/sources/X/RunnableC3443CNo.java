package X;

import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* JADX WARN: Unknown type variable: F in type: F */
/* renamed from: X.CNo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3443CNo<V, X extends Throwable> extends AbstractC3437CNi implements Runnable {
    public static final String __redex_internal_original_name = "AbstractCatchingFuture$CatchingFuture";
    public ListenableFuture<? extends V> A00;
    public Class<X> A01;
    public F A02;

    @Override // X.CQU
    public final void afterDone() {
        maybePropagateCancellationTo(this.A00);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    @Override // X.CQU
    public final String pendingToString() {
        StringBuilder sbA0g;
        ListenableFuture<? extends V> listenableFuture = this.A00;
        Class<X> cls = this.A01;
        Object obj = this.A02;
        String strA0t = BV8.A0t(this);
        String strA0v = listenableFuture != null ? AnonymousClass001.A0v("], ", C3cG.A0f(listenableFuture, "inputFuture=[")) : "";
        if (cls != null && obj != null) {
            sbA0g = C3cG.A0g(strA0v);
            sbA0g.append("exceptionType=[");
            sbA0g.append(cls);
            sbA0g.append("], fallback=[");
            sbA0g.append(obj);
            sbA0g.append("]");
        } else {
            if (strA0t == null) {
                return null;
            }
            sbA0g = C3cG.A0g(strA0v);
            sbA0g.append(strA0t);
        }
        return sbA0g.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objApply;
        ListenableFuture<? extends V> listenableFuture = this.A00;
        Class<X> cls = this.A01;
        F f = this.A02;
        boolean zA1Y = AnonymousClass002.A1Y(listenableFuture) | AnonymousClass002.A1Y(cls);
        if (f == 0 || zA1Y || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.A00 = null;
        try {
        } catch (ExecutionException e) {
            th = e.getCause();
            if (th == null) {
                StringBuilder sbA13 = BV8.A13(listenableFuture, "Future type ");
                BV7.A1C(e, " threw ", sbA13);
                th = BV4.A0a(AnonymousClass001.A0v(" without a cause", sbA13));
            }
        } catch (Throwable th) {
            th = th;
        }
        if (!(listenableFuture instanceof AbstractC3445CNq) || (th = ((AbstractC3445CNq) listenableFuture).tryInternalFastPathGetFailure()) == null) {
            objApply = CQD.A00(listenableFuture);
        } else {
            if (!cls.isInstance(th)) {
                setFuture(listenableFuture);
                return;
            }
            try {
                objApply = ((Function) f).apply(th);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        BV4.A1A();
                    }
                    setException(th2);
                    return;
                } finally {
                    this.A01 = null;
                    this.A02 = null;
                }
            }
        }
        set(objApply);
    }
}
