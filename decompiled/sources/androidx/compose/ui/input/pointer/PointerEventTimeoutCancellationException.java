package androidx.compose.ui.input.pointer;

import X.AaV;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AaV.A00);
        return this;
    }
}
