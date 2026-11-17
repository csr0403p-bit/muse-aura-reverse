package com.facebook.aura.qpl;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.network.state.Transport;

/* loaded from: classes5.dex */
public abstract class AuraNetworkDataProvidersKt {
    public static final String getNetworkType(AuraNetworkState auraNetworkState) {
        C7384Etj.A0Y(auraNetworkState, 0);
        if (auraNetworkState.equals(AuraNetworkState.Unknown.INSTANCE)) {
            return null;
        }
        if (auraNetworkState.equals(AuraNetworkState.Offline.INSTANCE)) {
            return "none";
        }
        if (!(auraNetworkState instanceof AuraNetworkState.Online)) {
            throw C3cG.A0q();
        }
        int iOrdinal = ((AuraNetworkState.Online) auraNetworkState).transport.ordinal();
        if (iOrdinal == 0) {
            return "WIFI";
        }
        if (iOrdinal == 1) {
            return "MOBILE";
        }
        if (iOrdinal == 2) {
            return "VPN";
        }
        if (iOrdinal == 3) {
            return "BLUETOOTH";
        }
        if (iOrdinal == 4) {
            return "OTHER";
        }
        throw C3cG.A0q();
    }

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
}
