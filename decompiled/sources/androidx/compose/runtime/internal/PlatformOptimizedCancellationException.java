package androidx.compose.runtime.internal;

import X.AbstractC3072Bwv;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC3072Bwv.A00);
        return this;
    }
}
