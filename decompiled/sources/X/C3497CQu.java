package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CQu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3497CQu implements ListenableFuture {
    public final C3499CQw A00 = new C3499CQw(this);
    public final WeakReference A01;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C3498CQv c3498CQv = (C3498CQv) this.A01.get();
        boolean zCancel = this.A00.cancel(z);
        if (zCancel && c3498CQv != null) {
            c3498CQv.A02 = null;
            c3498CQv.A01 = null;
            CR5 cr5 = c3498CQv.A00;
            if (AbstractC3496CQt.A00.A02(cr5, AbstractC3496CQt.A01)) {
                AbstractC3496CQt.A02(cr5);
            }
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A00.a instanceof CR1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A00.isDone();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C3497CQu(C3498CQv c3498CQv) {
        this.A01 = BV4.A0q(c3498CQv);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }
}
