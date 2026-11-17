package kotlinx.coroutines.internal;

import X.C78T;

/* loaded from: classes6.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    public final transient C78T A00;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.A00);
    }

    public DiagnosticCoroutineContextException(C78T c78t) {
        this.A00 = c78t;
    }
}
