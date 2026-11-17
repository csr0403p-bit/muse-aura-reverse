package com.facebook.rtc.platform.client.androiddevicestats;

import X.AbstractC5321DgF;
import X.BV6;
import X.C5095DXk;
import X.C7384Etj;
import X.C79;
import X.F0C;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import java.util.concurrent.ExecutorService;
import org.webrtc.ContextUtils;

/* loaded from: classes5.dex */
public final class AndroidDeviceStatsCollector {
    public static TelephonyCallback callback;
    public static boolean isTelephonyCallbackRegistered;
    public static TelephonyDisplayInfo latestDisplayInfo;
    public static final AndroidDeviceStatsCollector INSTANCE = new AndroidDeviceStatsCollector();
    public static final F0C executor$delegate = AbstractC5321DgF.A00(C79.A0C, 28);

    public static final int getActiveNetworkInfo() {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            Context context = ContextUtils.applicationContext;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                if ((systemService instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) systemService) != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return 2;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return 1;
                    }
                }
            }
            return 0;
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    public static final int getDeviceThermalStatus() {
        try {
            Context context = ContextUtils.applicationContext;
            if (context == null) {
                return -1;
            }
            Object systemService = context.getSystemService("power");
            C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager powerManager = (PowerManager) systemService;
            if (powerManager != null) {
                return powerManager.getCurrentThermalStatus();
            }
            return -1;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static final int getActiveCellularType() {
        TelephonyManager telephonyManager;
        TelephonyDisplayInfo telephonyDisplayInfo;
        Context context = ContextUtils.applicationContext;
        if (context != null) {
            Object systemService = context.getSystemService(HatchLinkOrderSheetKt.PHONE);
            if ((systemService instanceof TelephonyManager) && (telephonyManager = (TelephonyManager) systemService) != null) {
                try {
                    int dataNetworkType = telephonyManager.getDataNetworkType();
                    if (dataNetworkType != 3) {
                        if (dataNetworkType == 13 || dataNetworkType == 20) {
                            if (telephonyManager.getDataNetworkType() == 20) {
                                return 3;
                            }
                            if (Build.VERSION.SDK_INT < 31 || (telephonyDisplayInfo = latestDisplayInfo) == null) {
                                return 2;
                            }
                            int iA02 = BV6.A02(telephonyDisplayInfo.getOverrideNetworkType());
                            return (iA02 == 3 || iA02 == 5) ? 4 : 2;
                        }
                        switch (dataNetworkType) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                return 0;
                        }
                    }
                    return 1;
                } catch (RuntimeException unused) {
                    return 0;
                }
            }
        }
        return 0;
    }

    public static final int getDeviceBatteryPercentage() {
        Intent intentRegisterReceiver;
        Context context = ContextUtils.applicationContext;
        int i = -1;
        if (context != null) {
            try {
                intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            } catch (OutOfMemoryError | RuntimeException unused) {
            }
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra != -1 && intExtra2 != -1) {
                    i = (intExtra * 100) / intExtra2;
                    return i;
                }
                return i;
            }
        }
        return -1;
    }

    public static final boolean getPowerSaveMode() {
        Context context = ContextUtils.applicationContext;
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("power");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }

    public static final boolean isBatteryCharging() {
        Context context = ContextUtils.applicationContext;
        if (context != null) {
            try {
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver != null) {
                    int intExtra = intentRegisterReceiver.getIntExtra(AuraDeeplinkRouteMapper.STATUS_ROUTE, -1);
                    if (intExtra == 2 || intExtra == 5) {
                        return true;
                    }
                }
            } catch (OutOfMemoryError | RuntimeException unused) {
                return false;
            }
        }
        return false;
    }

    public static final void registerTelephonyCallback() {
        TelephonyManager telephonyManager;
        if (Build.VERSION.SDK_INT < 31 || isTelephonyCallbackRegistered) {
            return;
        }
        Context context = ContextUtils.applicationContext;
        Object systemService = context != null ? context.getSystemService(HatchLinkOrderSheetKt.PHONE) : null;
        if (!(systemService instanceof TelephonyManager) || (telephonyManager = (TelephonyManager) systemService) == null) {
            return;
        }
        try {
            C5095DXk c5095DXk = new C5095DXk();
            callback = c5095DXk;
            telephonyManager.registerTelephonyCallback((ExecutorService) C7384Etj.A0G(executor$delegate), c5095DXk);
            isTelephonyCallbackRegistered = true;
        } catch (RuntimeException unused) {
        }
    }

    public static final void unregisterTelephonyCallback() {
        Context context;
        TelephonyManager telephonyManager;
        if (Build.VERSION.SDK_INT < 31 || !isTelephonyCallbackRegistered || (context = ContextUtils.applicationContext) == null) {
            return;
        }
        Object systemService = context.getSystemService(HatchLinkOrderSheetKt.PHONE);
        if (!(systemService instanceof TelephonyManager) || (telephonyManager = (TelephonyManager) systemService) == null) {
            return;
        }
        try {
            TelephonyCallback telephonyCallback = callback;
            if (telephonyCallback != null) {
                telephonyManager.unregisterTelephonyCallback(telephonyCallback);
            }
            isTelephonyCallbackRegistered = false;
            callback = null;
        } catch (RuntimeException unused) {
        }
    }
}
