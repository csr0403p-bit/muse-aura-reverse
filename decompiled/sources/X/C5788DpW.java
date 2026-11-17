package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.DpW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5788DpW {
    public PowerManager.WakeLock A00;
    public boolean A01;
    public boolean A02;
    public final PowerManager A03;
    public final boolean A04;

    public static void A00(C5788DpW c5788DpW) {
        PowerManager.WakeLock wakeLock = c5788DpW.A00;
        if (wakeLock != null) {
            if (c5788DpW.A01 && c5788DpW.A02) {
                wakeLock.acquire();
            } else if (wakeLock.isHeld()) {
                c5788DpW.A00.release();
            }
        }
    }

    public C5788DpW(Context context, boolean z) {
        this.A04 = z;
        this.A03 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
