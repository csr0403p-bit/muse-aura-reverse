package com.facebook.aura.qpl;

import X.BV4;
import X.C4JM;
import X.C7384Etj;
import X.CFK;
import android.app.Application;
import android.content.Context;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.quicklog.MarkerEditor;

/* loaded from: classes5.dex */
public final class AuraStartupDeviceState {
    public static final AuraStartupDeviceState INSTANCE = new AuraStartupDeviceState();
    public static final String TAG = "AuraStartupDeviceState";

    public final void annotateEnd(MarkerEditor markerEditor) {
        int iIntValue;
        C7384Etj.A0Y(markerEditor, 0);
        Application applicationA00 = C4JM.A00();
        String networkType = AuraNetworkDataProvidersKt.getNetworkType(AuraNetworkMonitor.state.getValue());
        if (networkType != null) {
            markerEditor.annotate("network_type", networkType);
        }
        AuraDataSaverMonitor.INSTANCE.ensureStarted(applicationA00);
        String str = AuraDataSaverMonitor.restrictBackgroundStatus;
        if (str != null) {
            markerEditor.annotate("restrict_background_status", str);
        }
        if (AuraDataSaverMonitor.startFailed) {
            markerEditor.annotate("data_saver_monitor_failed", true);
        }
        Boolean powerSaveMode = readPowerSaveMode(applicationA00);
        if (powerSaveMode != null) {
            markerEditor.annotate("low_power_enabled", powerSaveMode.booleanValue());
        }
        Integer batteryLevel = readBatteryLevel(applicationA00);
        if (batteryLevel != null && (iIntValue = batteryLevel.intValue()) >= 0 && iIntValue < 101) {
            markerEditor.annotate("battery_level", iIntValue);
        }
        Boolean backgroundRestricted = AuraPowerStateMonitor.INSTANCE.readBackgroundRestricted(applicationA00);
        if (backgroundRestricted != null) {
            markerEditor.annotate("bg_restricted_at_end", backgroundRestricted.booleanValue());
        } else {
            markerEditor.annotate("bg_restricted_read_failed", true);
        }
    }

    public final void annotateStart(MarkerEditor markerEditor) {
        C7384Etj.A0Y(markerEditor, 0);
        AuraPowerStateMonitor auraPowerStateMonitor = AuraPowerStateMonitor.INSTANCE;
        auraPowerStateMonitor.ensureStarted(C4JM.A00());
        String dozeMode = auraPowerStateMonitor.getDozeMode();
        if (dozeMode != null) {
            markerEditor.annotate("doze_mode_at_start", dozeMode);
        }
        Long dozeExitMsAgo = auraPowerStateMonitor.getDozeExitMsAgo();
        if (dozeExitMsAgo != null) {
            markerEditor.annotate("doze_exit_ms_before_start", dozeExitMsAgo.longValue());
        }
        if (AuraPowerStateMonitor.startFailed) {
            markerEditor.annotate("doze_monitor_failed", true);
        }
    }

    private final Integer readBatteryLevel(Context context) {
        try {
            Object systemService = context.getSystemService((Class<Object>) BatteryManager.class);
            if (systemService != null) {
                return Integer.valueOf(((BatteryManager) systemService).getIntProperty(4));
            }
            throw BV4.A0U();
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "Battery level read failed", e);
            return null;
        }
    }

    private final Boolean readPowerSaveMode(Context context) {
        try {
            Object systemService = context.getSystemService((Class<Object>) PowerManager.class);
            if (systemService != null) {
                return Boolean.valueOf(((PowerManager) systemService).isPowerSaveMode());
            }
            throw BV4.A0U();
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "isPowerSaveMode read failed", e);
            return null;
        }
    }
}
