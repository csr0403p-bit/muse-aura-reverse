package androidx.compose.ui.input.pointer;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;

/* loaded from: classes4.dex */
public final class PointerInputResetException extends PlatformOptimizedCancellationException {
    public PointerInputResetException() {
        super("Pointer input was reset");
    }
}
