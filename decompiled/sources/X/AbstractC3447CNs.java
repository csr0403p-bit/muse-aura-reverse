package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.CNs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3447CNs<V> extends AbstractFutureC3448CNt<V> implements ListenableFuture<V> {
    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor exec) {
        ((ScheduledFutureC3449CNu) this).A00.addListener(listener, exec);
    }
}
