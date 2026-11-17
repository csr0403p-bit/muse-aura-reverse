package androidx.compose.foundation.internal;

import X.C5We;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(C5We.A00);
        return this;
    }
}
