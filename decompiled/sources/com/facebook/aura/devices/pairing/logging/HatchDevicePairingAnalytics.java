package com.facebook.aura.devices.pairing.logging;

import X.AIW;
import X.AnonymousClass003;
import X.C0924AIa;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.Ey9;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchDevicePairingAnalytics {
    public static final HatchDevicePairingAnalytics INSTANCE = new HatchDevicePairingAnalytics();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason BLE_SCAN_FAILED;
        public static final FailureReason BLUETOOTH_DENIED;
        public static final FailureReason BLUETOOTH_OFF;
        public static final FailureReason BLUETOOTH_RESTRICTED;
        public static final FailureReason DEVICE_NOT_FOUND;
        public static final FailureReason LOCATION_DENIED;
        public static final FailureReason LOCATION_RESTRICTED;
        public final String value;

        static {
            FailureReason failureReason = new FailureReason("DEVICE_NOT_FOUND", 0, "device_not_found");
            DEVICE_NOT_FOUND = failureReason;
            FailureReason failureReason2 = new FailureReason("BLUETOOTH_OFF", 1, "bluetooth_off");
            BLUETOOTH_OFF = failureReason2;
            FailureReason failureReason3 = new FailureReason("BLE_SCAN_FAILED", 2, "ble_scan_failed");
            BLE_SCAN_FAILED = failureReason3;
            FailureReason failureReason4 = new FailureReason("BLUETOOTH_DENIED", 3, "bluetooth_denied");
            BLUETOOTH_DENIED = failureReason4;
            FailureReason failureReason5 = new FailureReason("BLUETOOTH_RESTRICTED", 4, "bluetooth_restricted");
            BLUETOOTH_RESTRICTED = failureReason5;
            FailureReason failureReason6 = new FailureReason("LOCATION_DENIED", 5, "location_denied");
            LOCATION_DENIED = failureReason6;
            FailureReason failureReason7 = new FailureReason("LOCATION_RESTRICTED", 6, "location_restricted");
            LOCATION_RESTRICTED = failureReason7;
            FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3, failureReason4, failureReason5, failureReason6, failureReason7};
            $VALUES = failureReasonArr;
            $ENTRIES = C3cG.A0w(failureReasonArr);
        }

        public static Ey9<FailureReason> getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public FailureReason(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final void recordScanAttempt() {
        HatchAppEventLogger.INSTANCE.logEvent("device_prepairing_started", "device_setup", null, HatchCcvLoggingKt.EVENT_TYPE_ATTEMPT, "ble_discovery", null, null);
    }

    public final void recordDiscoveryFailure(FailureReason failureReason, List<String> list) {
        AnonymousClass003.A0u(failureReason, list);
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(C3cF.A00(39), failureReason.getValue());
        if (!list.isEmpty()) {
            c0924AIaA0u.put("missing_permissions", C3cH.A0e(",", list));
        }
        hatchAppEventLogger.logEvent("device_prepairing_failed", "device_setup", null, "error", "ble_discovery", AIW.A0K(c0924AIaA0u), null);
    }
}
