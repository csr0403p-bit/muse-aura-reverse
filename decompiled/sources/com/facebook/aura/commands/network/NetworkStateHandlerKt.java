package com.facebook.aura.commands.network;

import X.C7BY;
import X.CFK;
import X.FGI;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class NetworkStateHandlerKt {
    public static final String SCRUBBED_BSSID = "02:00:00:00:00:00";
    public static final String TAG = "NetworkStateHandler";
    public static final String UNKNOWN_SSID = "<unknown ssid>";

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[PHI: r4
  0x0035: PHI (r4v1 boolean) = (r4v0 boolean), (r4v5 boolean), (r4v5 boolean) binds: [B:6:0x0021, B:8:0x002a, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[PHI: r4 r5
  0x0038: PHI (r4v4 boolean) = (r4v1 boolean), (r4v5 boolean) binds: [B:12:0x0036, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r5v3 boolean) = (r5v0 boolean), (r5v4 boolean) binds: [B:12:0x0036, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[PHI: r4 r5
  0x0041: PHI (r4v3 boolean) = (r4v1 boolean), (r4v4 boolean) binds: [B:12:0x0036, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r5v2 boolean) = (r5v0 boolean), (r5v3 boolean) binds: [B:12:0x0036, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.commands.network.NetworkState readCurrentNetworkState(android.content.Context r9) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
            java.lang.Class<android.net.ConnectivityManager> r0 = android.net.ConnectivityManager.class
            java.lang.Object r0 = r9.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            com.facebook.aura.commands.network.NetworkStateHandlerKt$readCurrentNetworkState$caps$1 r1 = new com.facebook.aura.commands.network.NetworkStateHandlerKt$readCurrentNetworkState$caps$1
            r1.<init>(r0)
            java.lang.String r0 = "getNetworkCapabilities"
            java.lang.Object r2 = readOrNullIfDenied(r0, r1)
            android.net.NetworkCapabilities r2 = (android.net.NetworkCapabilities) r2
            if (r2 == 0) goto L63
            java.lang.String r3 = transportOf(r2)
        L1f:
            r1 = 1
            r4 = 0
            if (r2 == 0) goto L35
            r4 = 1
            r0 = 12
            boolean r0 = r2.hasCapability(r0)
            if (r0 != r1) goto L35
            r0 = 16
            boolean r0 = r2.hasCapability(r0)
            r5 = 1
            if (r0 != 0) goto L38
        L35:
            r5 = 0
            if (r2 == 0) goto L41
        L38:
            r0 = 11
            boolean r0 = r2.hasCapability(r0)
            r6 = 1
            if (r0 == 0) goto L42
        L41:
            r6 = 0
        L42:
            java.lang.String r0 = "wifi"
            boolean r0 = r3.equals(r0)
            r8 = 0
            if (r0 == 0) goto L61
            com.facebook.aura.commands.network.WifiDetails r7 = readWifi(r9)
        L4f:
            java.lang.String r0 = "cellular"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5b
            com.facebook.aura.commands.network.CellularDetails r8 = readCellular(r9)
        L5b:
            com.facebook.aura.commands.network.NetworkState r2 = new com.facebook.aura.commands.network.NetworkState
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L61:
            r7 = r8
            goto L4f
        L63:
            java.lang.String r3 = "none"
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.network.NetworkStateHandlerKt.readCurrentNetworkState(android.content.Context):com.facebook.aura.commands.network.NetworkState");
    }

    public static final String transportOf(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(4) ? "vpn" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : networkCapabilities.hasTransport(3) ? "ethernet" : DeviceSmsReaderKt.ATTACHMENT_OTHER;
    }

    public static final CellularDetails readCellular(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
        String str = null;
        if (telephonyManager == null) {
            return null;
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        if (networkOperatorName != null && !C7BY.A0j(networkOperatorName)) {
            str = networkOperatorName;
        }
        Boolean bool = (Boolean) readOrNullIfDenied("isNetworkRoaming", new NetworkStateHandlerKt$readCellular$roaming$1(telephonyManager));
        return new CellularDetails(str, bool != null ? bool.booleanValue() : false);
    }

    public static final WifiDetails readWifi(Context context) {
        WifiInfo wifiInfo;
        WifiManager wifiManager = (WifiManager) context.getSystemService(WifiManager.class);
        if (wifiManager == null || (wifiInfo = (WifiInfo) readOrNullIfDenied("connectionInfo", new NetworkStateHandlerKt$readWifi$info$1(wifiManager))) == null) {
            return null;
        }
        String ssid = wifiInfo.getSSID();
        String strA0Y = ssid != null ? C7BY.A0Y(ssid, '\"') : null;
        String bssid = wifiInfo.getBSSID();
        boolean z = context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        if (strA0Y == null || !z || C7BY.A0j(strA0Y) || strA0Y.equals(UNKNOWN_SSID)) {
            strA0Y = null;
        }
        if (bssid == null || !z || bssid.equals(SCRUBBED_BSSID)) {
            bssid = null;
        }
        return new WifiDetails(strA0Y, bssid, wifiInfo.getRssi(), wifiInfo.getFrequency(), wifiInfo.getLinkSpeed());
    }

    public static final <T> T readOrNullIfDenied(String str, Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (SecurityException e) {
            CFK.A06(TAG, FGI.A0U(str, " denied: ", e.getMessage()));
            return null;
        }
    }
}
