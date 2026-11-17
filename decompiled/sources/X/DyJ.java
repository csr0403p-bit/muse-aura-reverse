package X;

import android.view.Surface;

/* loaded from: classes5.dex */
public abstract class DyJ {
    public static void A00(Surface surface, float f) {
        try {
            surface.setFrameRate(f, C8j3.A1S((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))) ? 1 : 0);
        } catch (IllegalStateException e) {
            CNC.A05("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
