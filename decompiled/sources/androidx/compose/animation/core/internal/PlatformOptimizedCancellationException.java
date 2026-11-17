package androidx.compose.animation.core.internal;

import X.AbstractC1002AOp;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC1002AOp.A00);
        return this;
    }
}
