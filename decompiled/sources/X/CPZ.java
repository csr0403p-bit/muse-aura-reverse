package X;

import com.facebook.aura.gateway.parser.HatchWidgetTokenParser;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class CPZ<V> implements ListenableFuture<V> {
    public static final ListenableFuture<?> A01 = new CPZ(null);
    public static final CPa A02 = new CPa(CPZ.class);
    public final V A00;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        Preconditions.checkNotNull(listener, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(listener);
        } catch (Exception e) {
            A02.A00().log(Level.SEVERE, AnonymousClass006.A0y(executor, " with executor ", C3cG.A0f(listener, "RuntimeException while executing runnable ")), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.A00;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public CPZ(V value) {
        this.A00 = value;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        sbA0w.append("[status=SUCCESS, result=[");
        sbA0w.append(this.A00);
        return AnonymousClass001.A0v(HatchWidgetTokenParser.HATCH_WIDGET_TOKEN_SUFFIX, sbA0w);
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) {
        unit.getClass();
        return get();
    }
}
