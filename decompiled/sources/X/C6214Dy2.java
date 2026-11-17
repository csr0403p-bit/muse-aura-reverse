package X;

import android.view.Display;

/* renamed from: X.Dy2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C6214Dy2 {
    public final /* synthetic */ C6171DxE A00;

    public final void A00(Display display) {
        long j;
        C6171DxE c6171DxE = this.A00;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c6171DxE.A07 = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            CNC.A04("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            c6171DxE.A07 = -9223372036854775807L;
        }
        c6171DxE.A08 = j;
    }
}
