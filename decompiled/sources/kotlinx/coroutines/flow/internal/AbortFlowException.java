package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class AbortFlowException extends CancellationException {
    public final transient Object A00;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.A00 = obj;
    }
}
