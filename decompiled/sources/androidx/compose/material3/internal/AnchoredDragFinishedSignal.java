package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class AnchoredDragFinishedSignal extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
