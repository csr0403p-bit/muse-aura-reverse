package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;

/* renamed from: X.DXm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5097DXm {
    public static void A00(Context context, C5103DXu c5103DXu) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HatchLinkOrderSheetKt.PHONE);
            telephonyManager.getClass();
            C5096DXl c5096DXl = new C5096DXl(c5103DXu);
            telephonyManager.registerTelephonyCallback(c5103DXu.A04, c5096DXl);
            telephonyManager.unregisterTelephonyCallback(c5096DXl);
        } catch (RuntimeException unused) {
            C5103DXu.A03(c5103DXu, 5);
        }
    }
}
