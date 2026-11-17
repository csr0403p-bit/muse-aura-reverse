package X;

import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.CNp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3444CNp<I, O> extends AbstractC3437CNi implements Runnable {
    public static final String __redex_internal_original_name = "AbstractTransformFuture$TransformFuture";
    public ListenableFuture<? extends I> A00;
    public F A01;

    @Override // X.CQU
    public final void afterDone() {
        maybePropagateCancellationTo(this.A00);
        this.A00 = null;
        this.A01 = null;
    }

    @Override // X.CQU
    public final String pendingToString() {
        StringBuilder sbA0g;
        ListenableFuture<? extends I> listenableFuture = this.A00;
        Object obj = this.A01;
        String strA0t = BV8.A0t(this);
        String strA0v = listenableFuture != null ? AnonymousClass001.A0v("], ", C3cG.A0f(listenableFuture, "inputFuture=[")) : "";
        if (obj != null) {
            sbA0g = C3cG.A0g(strA0v);
            sbA0g.append("function=[");
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
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        ListenableFuture<? extends I> listenableFuture = this.A00;
        F f = this.A01;
        boolean zIsCancelled = isCancelled() | AnonymousClass002.A1Y(listenableFuture);
        if (f == 0 || zIsCancelled) {
            return;
        }
        this.A00 = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objApply = ((Function) f).apply(CQD.A00(listenableFuture));
                this.A01 = null;
                set(objApply);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        BV4.A1A();
                    }
                    setException(th);
                } finally {
                    this.A01 = null;
                }
            }
        } catch (Error | Exception e2) {
            e = e2;
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e3) {
            e = e3.getCause();
            setException(e);
        }
    }
}
