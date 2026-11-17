package androidx.compose.runtime;

/* loaded from: classes4.dex */
public final class ComposeRuntimeError extends IllegalStateException {
    public final String message;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public ComposeRuntimeError(String str) {
        this.message = str;
    }
}
