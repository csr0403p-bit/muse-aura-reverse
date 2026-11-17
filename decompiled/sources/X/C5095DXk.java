package X;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import com.facebook.rtc.platform.client.androiddevicestats.AndroidDeviceStatsCollector;

/* renamed from: X.DXk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5095DXk extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        C7384Etj.A0Y(telephonyDisplayInfo, 0);
        AndroidDeviceStatsCollector.latestDisplayInfo = telephonyDisplayInfo;
    }
}
