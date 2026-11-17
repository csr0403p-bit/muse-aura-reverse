package com.facebook.aura.devices.pairing;

import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.devices.token.LinkSdkTokenFailure;

/* loaded from: classes4.dex */
public abstract class HatchDevicePairingStateMachineKt {
    public static final int LINK_OTA_MAX_RESCAN_ATTEMPTS = 8;
    public static final long LINK_OTA_ROUND_TWO_WINDOW_MS = 270000;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkSdkTokenFailure.values().length];
            try {
                AnonymousClass002.A13(LinkSdkTokenFailure.MISSING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LinkSdkTokenFailure.INVALID, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LinkSdkTokenFailure.DEVICE_LIMIT_REACHED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HatchDevicePairingDialog getPairingDialog(LinkSdkTokenFailure linkSdkTokenFailure) {
        int iOrdinal = linkSdkTokenFailure.ordinal();
        if (iOrdinal == 0) {
            return HatchDevicePairingDialog.SDK_TOKEN_MISSING;
        }
        if (iOrdinal == 1) {
            return HatchDevicePairingDialog.SDK_TOKEN_INVALID;
        }
        if (iOrdinal == 2) {
            return HatchDevicePairingDialog.SDK_TOKEN_DEVICE_LIMIT_REACHED;
        }
        throw C3cG.A0q();
    }
}
