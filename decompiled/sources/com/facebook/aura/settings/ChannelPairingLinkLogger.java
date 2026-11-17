package com.facebook.aura.settings;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.CFK;
import com.facebook.aura.activation.model.HatchInviteLogging;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.channels.ChannelLaunchOutcome;
import com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ChannelPairingLinkLogger {
    public static final int $stable = 8;
    public ChannelPairingEntryPoint entryPoint;
    public Long openedLaunchAtMs;
    public final String provider;

    public ChannelPairingLinkLogger(String str) {
        C7384Etj.A0Y(str, 0);
        this.provider = str;
        this.entryPoint = ChannelPairingEntryPoint.SETTINGS;
    }

    public final void logLaunch(ChannelLaunchOutcome channelLaunchOutcome) {
        C7384Etj.A0Y(channelLaunchOutcome, 0);
        this.openedLaunchAtMs = channelLaunchOutcome.getReachedChannel() ? C3cI.A0O() : null;
        log(MAHatchNativeAuthAppStartLoggerKt.STAGE_LAUNCH, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), loggedResult(channelLaunchOutcome)), !channelLaunchOutcome.getReachedChannel());
    }

    public final void logLinkRequestFailure(ChannelPairingLinkFailure channelPairingLinkFailure) {
        C7384Etj.A0Y(channelPairingLinkFailure, 0);
        log(channelPairingLinkFailure.getStep(), AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), channelPairingLinkFailure.getResult()), true);
    }

    public final void startAttempt(ChannelPairingEntryPoint channelPairingEntryPoint) {
        C7384Etj.A0Y(channelPairingEntryPoint, 0);
        this.entryPoint = channelPairingEntryPoint;
        this.openedLaunchAtMs = null;
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChannelLaunchOutcome.values().length];
            try {
                AnonymousClass002.A13(ChannelLaunchOutcome.OPENED_DEEPLINK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ChannelLaunchOutcome.OPENED_APP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ChannelLaunchOutcome.OPENED_WEB, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ChannelLaunchOutcome.SENT_TO_STORE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ChannelLaunchOutcome.FAILED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(String str, Map<String, String> map, boolean z) {
        LinkedHashMap linkedHashMapA02 = AGH.A02(map, C3cH.A0m("step", str, C3cG.A0r(HatchMetadataKey.PROVIDER.getValue(), this.provider), C3cG.A0r(HatchMetadataKey.ENTRY_POINT.getValue(), this.entryPoint.getValue())));
        HatchAppEventLogger.INSTANCE.logEvent(ChannelPairingLinkLoggerKt.EVENT_NAME, this.entryPoint.getSurface().getValue(), "channels", HatchInviteLogging.EVENT_TYPE_STATUS_CHECK, null, linkedHashMapA02, null);
        String strA0L = AbstractC0878AGe.A0L(InviteCodeScratcherKt.CODE_SEPARATOR, "", "", AbstractC0878AGe.A0c(linkedHashMapA02.entrySet(), new Comparator() { // from class: com.facebook.aura.settings.ChannelPairingLinkLogger$log$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00((String) ((Map.Entry) t).getKey(), (String) ((Map.Entry) t2).getKey());
            }
        }), ChannelPairingLinkLogger$log$summary$2.INSTANCE);
        if (z) {
            CFK.A06(ChannelPairingLinkLoggerKt.TAG, strA0L);
        } else {
            CFK.A05(ChannelPairingLinkLoggerKt.TAG, strA0L);
        }
    }

    public final void logReturnIfLaunched() {
        Long l = this.openedLaunchAtMs;
        if (l != null) {
            long jLongValue = l.longValue();
            this.openedLaunchAtMs = null;
            long jA04 = C3cG.A04(jLongValue);
            if (jA04 < 0) {
                jA04 = 0;
            }
            log("returned", AnonymousClass006.A10(HatchMetadataKey.DURATION_MS.getValue(), String.valueOf(jA04)), false);
        }
    }

    private final String loggedResult(ChannelLaunchOutcome channelLaunchOutcome) {
        int iOrdinal = channelLaunchOutcome.ordinal();
        if (iOrdinal == 0) {
            return "opened";
        }
        if (iOrdinal == 1) {
            return "opened_app";
        }
        if (iOrdinal == 2) {
            return "opened_web";
        }
        if (iOrdinal == 3) {
            return "sent_to_store";
        }
        if (iOrdinal == 4) {
            return ConfidentialVmAnalytics.SWITCH_RESULT_REFUSED;
        }
        throw C3cG.A0q();
    }
}
