package com.facebook.aura.devices.pairing;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason;
import com.facebook.aura.devices.token.LinkDeviceTokenPair;
import com.facebook.aura.devices.token.LinkSdkTokenFailure;

/* loaded from: classes4.dex */
public abstract class LinkEncryptedSetupCoordinatorKt {
    public static final String LINK_API_URL = "https://hatch-api.meta.ai";
    public static final String LINK_API_URL_V2 = "https://api.muse.ai";
    public static final int LINK_APP_CONFIRMATION_ACK_TIMEOUT_SECONDS = 5;
    public static final int LINK_CONFIRM_PRESS_TIMEOUT_SECONDS = 60;
    public static final long LINK_DEVICE_INFO_TIMEOUT_MS = 3000;
    public static final String LINK_NOISE_HOST = "hatch.metaaivm.com";
    public static final long LINK_PAIRING_READY_TIMEOUT_MS = 5000;
    public static final String OTA_ROUND_PLACEHOLDER_TOKEN = "ota-round";
    public static final LinkDeviceTokenPair OTA_ROUND_PLACEHOLDER_TOKENS = new LinkDeviceTokenPair(OTA_ROUND_PLACEHOLDER_TOKEN, OTA_ROUND_PLACEHOLDER_TOKEN);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LinkDeviceKeySetupFailure.values().length];
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.FIRMWARE_UPDATE_REQUIRED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.CVM_UNSUPPORTED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(LinkDeviceKeySetupFailure.REPLACEMENT_DECLINED, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LinkDeviceKeySetupFailure.DEVICE_KEY_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(LinkDeviceKeySetupFailure.DEVICE_ROLE_CONFLICT, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(LinkDeviceKeySetupFailure.NODE_ID_IN_USE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(LinkDeviceKeySetupFailure.PAIRED_NODES_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(LinkDeviceKeySetupFailure.OTA_ROUND_TWO_EXPIRED, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LinkSdkTokenFailure.values().length];
            try {
                AnonymousClass005.A0v(LinkSdkTokenFailure.MISSING, iArr2, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(LinkSdkTokenFailure.INVALID, iArr2, 2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(LinkSdkTokenFailure.DEVICE_LIMIT_REACHED, iArr2, 3);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final HatchDevicePairingFailureReason getPairingFailureReason(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
        switch (linkDeviceKeySetupFailure.ordinal()) {
            case 0:
                return HatchDevicePairingFailureReason.FIRMWARE_UPDATE_REQUIRED;
            case 1:
                return HatchDevicePairingFailureReason.CVM_UNSUPPORTED;
            case 2:
                return HatchDevicePairingFailureReason.DEVICE_KEY_FAILED;
            case 3:
            case 5:
                return HatchDevicePairingFailureReason.DEVICE_ID_IN_USE;
            case 4:
                return null;
            case 6:
                return HatchDevicePairingFailureReason.PAIRED_NODES_UNAVAILABLE;
            case 7:
                return HatchDevicePairingFailureReason.OTA_RECONNECT_FAILED;
            default:
                throw C3cG.A0q();
        }
    }

    public static final HatchDevicePairingFailureReason getPairingFailureReason(LinkSdkTokenFailure linkSdkTokenFailure) {
        int iOrdinal = linkSdkTokenFailure.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return HatchDevicePairingFailureReason.SDK_TOKEN_DEVICE_LIMIT_REACHED;
                }
                throw C3cG.A0q();
            }
            return HatchDevicePairingFailureReason.SDK_TOKEN_INVALID;
        }
        return HatchDevicePairingFailureReason.SDK_TOKEN_MISSING;
    }
}
