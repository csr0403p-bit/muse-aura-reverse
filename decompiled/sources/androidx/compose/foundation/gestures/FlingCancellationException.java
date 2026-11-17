package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.PlatformOptimizedCancellationException;

/* loaded from: classes4.dex */
public final class FlingCancellationException extends PlatformOptimizedCancellationException {
    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }
}
