package com.facebook.aura.localbrowser;

import X.C7384Etj;
import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.facebook.aura.nodes.api.HatchNodeCapabilityContributor;

/* loaded from: classes2.dex */
public final class LocalBrowserCapabilities implements HatchNodeCapabilityContributor {
    public static final int $stable = 0;
    public static final LocalBrowserCapabilities INSTANCE = new LocalBrowserCapabilities();

    public final String deviceIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(Context context) {
        C7384Etj.A0Y(context, 0);
        String strDevicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser = devicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(context);
        return strDevicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser == null ? networkIneligibility(context) : strDevicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser;
    }

    public final String devicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(Context context) {
        int intProperty;
        C7384Etj.A0Y(context, 0);
        BatteryManager batteryManager = (BatteryManager) context.getSystemService(BatteryManager.class);
        if (batteryManager == null) {
            return "battery_unavailable";
        }
        if (!batteryManager.isCharging() && (intProperty = batteryManager.getIntProperty(4)) >= 0 && intProperty < 16) {
            return "low_battery";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
        if (powerManager == null) {
            return "power_unavailable";
        }
        if (powerManager.isPowerSaveMode()) {
            return "power_saver";
        }
        if (powerManager.getCurrentThermalStatus() >= 3) {
            return "thermal_pressure";
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        if (activityManager == null) {
            return "memory_unavailable";
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        if (memoryInfo.lowMemory) {
            return LocalBrowserDeviceConditionsKt.LOW_MEMORY;
        }
        return null;
    }

    public final String wakeIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(Context context) {
        C7384Etj.A0Y(context, 0);
        String strDevicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser = devicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(context);
        if (strDevicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser != null) {
            return strDevicePowerIneligibility$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser;
        }
        if (LocalBrowserCapacity.INSTANCE.isLowRam(context)) {
            return "low_ram";
        }
        return null;
    }

    private final String networkIneligibility(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return "network_unavailable";
        }
        if (!networkCapabilities.hasCapability(12)) {
            return "no_internet";
        }
        if (!networkCapabilities.hasCapability(16)) {
            return "unvalidated_network";
        }
        int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
        if (1 <= linkDownstreamBandwidthKbps && linkDownstreamBandwidthKbps < 512) {
            return "low_downstream_bandwidth";
        }
        int linkUpstreamBandwidthKbps = networkCapabilities.getLinkUpstreamBandwidthKbps();
        if (1 > linkUpstreamBandwidthKbps || linkUpstreamBandwidthKbps >= 128) {
            return null;
        }
        return "low_upstream_bandwidth";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    @Override // com.facebook.aura.nodes.api.HatchNodeCapabilityContributor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson contribute(com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson r20, X.AbstractC3358CGz r21, long r22) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserCapabilities.contribute(com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson, X.CGz, long):com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson");
    }
}
