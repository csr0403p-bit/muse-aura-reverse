package com.facebook.aura.analytics.hatch;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.network.state.Transport;

/* loaded from: classes5.dex */
public abstract class HatchEnvironmentValuesKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transport.values().length];
            try {
                AnonymousClass002.A13(Transport.WIFI, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(Transport.CELLULAR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(Transport.VPN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(Transport.BLUETOOTH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(Transport.OTHER, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String hatchAppStateValue() {
        return AuraAppLifecycleManager.INSTANCE.isAppInForeground() ? "foreground" : "background";
    }

    public static final String hatchNetworkTypeValue() {
        AuraNetworkState value = AuraNetworkMonitor.state.getValue();
        if (C7384Etj.areEqual(value, AuraNetworkState.Unknown.INSTANCE)) {
            return "unknown";
        }
        if (C7384Etj.areEqual(value, AuraNetworkState.Offline.INSTANCE)) {
            return "offline";
        }
        if (!(value instanceof AuraNetworkState.Online)) {
            throw C3cG.A0q();
        }
        int iOrdinal = ((AuraNetworkState.Online) value).transport.ordinal();
        if (iOrdinal == 0) {
            return "wifi";
        }
        if (iOrdinal == 1) {
            return "cellular";
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return DeviceSmsReaderKt.ATTACHMENT_OTHER;
        }
        throw C3cG.A0q();
    }
}
