package androidx.compose.ui.internal;

import X.AaT;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AaT.A00);
        return this;
    }
}
