package X;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.WindowManager;
import androidx.media3.common.util.Util;

/* renamed from: X.DxM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6178DxM {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final DyH A0A;
    public final ChoreographerFrameCallbackC6189DxZ A0B;

    public static void A00(C6178DxM c6178DxM) {
        if (c6178DxM.A09.getDefaultDisplay() != null) {
            long refreshRate = (long) (1.0E9d / r0.getRefreshRate());
            c6178DxM.A06 = refreshRate;
            c6178DxM.A07 = (refreshRate * 80) / 100;
        }
    }

    public C6178DxM(Context context) {
        ChoreographerFrameCallbackC6189DxZ choreographerFrameCallbackC6189DxZ = null;
        if (context != null && (!AbstractC5653Dmh.A03(EnumC5618Dlz.A1b) || Util.A00 < 31 || (context instanceof Activity))) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            this.A09 = windowManager;
            if (windowManager != null) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                this.A0A = displayManager == null ? null : new DyH(displayManager, this);
                choreographerFrameCallbackC6189DxZ = ChoreographerFrameCallbackC6189DxZ.A05;
            }
            this.A0B = choreographerFrameCallbackC6189DxZ;
            this.A06 = -9223372036854775807L;
            this.A07 = -9223372036854775807L;
        }
        this.A09 = null;
        this.A0A = null;
        this.A0B = choreographerFrameCallbackC6189DxZ;
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public C6178DxM() {
        this(null);
    }
}
