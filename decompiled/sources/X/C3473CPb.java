package X;

import com.facebook.aura.gateway.parser.HatchWidgetTokenParser;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: X.CPb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3473CPb implements ListenableFuture {
    public final Object A00;
    public static final C3473CPb A02 = new C3473CPb(null);
    public static final CPc A01 = new CPc(C3473CPb.class);

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw BV4.A0a("Runnable was null.");
        }
        if (executor == null) {
            throw BV4.A0a("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            A01.A00().log(Level.SEVERE, FGI.A0d("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
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

    public C3473CPb(Object obj) {
        this.A00 = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    public final String toString() {
        return FGI.A0d(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.A00), HatchWidgetTokenParser.HATCH_WIDGET_TOKEN_SUFFIX);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.A00;
    }
}
