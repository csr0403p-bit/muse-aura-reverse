package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes5.dex */
public final class DyW {
    public final SurfaceTexture A00;
    public final Surface A01;

    public DyW() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        this.A00 = surfaceTexture;
        this.A01 = new Surface(surfaceTexture);
    }
}
