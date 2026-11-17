package X;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: X.DoO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5729DoO {
    public WifiManager.WifiLock A00;
    public boolean A01;
    public boolean A02;
    public final WifiManager A03;
    public final boolean A04;

    public static void A00(C5729DoO c5729DoO) {
        WifiManager.WifiLock wifiLock = c5729DoO.A00;
        if (wifiLock != null) {
            try {
                if (c5729DoO.A01 && c5729DoO.A02) {
                    wifiLock.acquire();
                } else {
                    wifiLock.release();
                }
            } catch (SecurityException e) {
                CNC.A06("WifiLockManager", "WifiLock operation failed due to SecurityException", e);
            }
        }
    }

    public C5729DoO(Context context, boolean z) {
        this.A04 = z;
        this.A03 = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
