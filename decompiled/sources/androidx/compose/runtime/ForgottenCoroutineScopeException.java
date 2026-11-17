package androidx.compose.runtime;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;

/* loaded from: classes3.dex */
public final class ForgottenCoroutineScopeException extends PlatformOptimizedCancellationException {
    public ForgottenCoroutineScopeException() {
        super("rememberCoroutineScope left the composition");
    }
}
