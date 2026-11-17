package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;

/* renamed from: X.CFe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3335CFe {
    public final Context A00;
    public final String A01;

    public C3335CFe(Context context, String str) {
        this.A00 = context.getApplicationContext();
        this.A01 = str;
    }

    public final void A00(C3341CFl c3341CFl) {
        C3341CFl.A00(c3341CFl, this.A01, "tier");
        C3341CFl.A00(c3341CFl, Double.valueOf(AbstractC2383BXp.A00(System.currentTimeMillis())), "sent_time");
        Context context = this.A00;
        Object systemService = context.getSystemService(HatchLinkOrderSheetKt.PHONE);
        systemService.getClass();
        String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            networkOperatorName = "n/a";
        }
        C3341CFl.A00(c3341CFl, networkOperatorName, "carrier");
        Object systemService2 = context.getSystemService("connectivity");
        systemService2.getClass();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService2).getActiveNetworkInfo();
        C3341CFl.A00(c3341CFl, activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : "none", "conn");
    }
}
