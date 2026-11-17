package com.facebook.aura.settings;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ChannelPairingLinkFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ChannelPairingLinkFailure[] $VALUES;
    public static final ChannelPairingLinkFailure CONSENT_FAILED;
    public static final ChannelPairingLinkFailure FAILED;
    public static final ChannelPairingLinkFailure MISSING_URL;
    public final String result;
    public final String step;

    static {
        ChannelPairingLinkFailure channelPairingLinkFailure = new ChannelPairingLinkFailure("CONSENT_FAILED", 0, "consent_request", "consent_failed");
        CONSENT_FAILED = channelPairingLinkFailure;
        ChannelPairingLinkFailure channelPairingLinkFailure2 = new ChannelPairingLinkFailure(CvmMigrationStatusJson.STAGE_FAILED, 1, "link_request", "failed");
        FAILED = channelPairingLinkFailure2;
        ChannelPairingLinkFailure channelPairingLinkFailure3 = new ChannelPairingLinkFailure("MISSING_URL", 2, "link_request", "missing_url");
        MISSING_URL = channelPairingLinkFailure3;
        ChannelPairingLinkFailure[] channelPairingLinkFailureArr = {channelPairingLinkFailure, channelPairingLinkFailure2, channelPairingLinkFailure3};
        $VALUES = channelPairingLinkFailureArr;
        $ENTRIES = C3cG.A0w(channelPairingLinkFailureArr);
    }

    public static Ey9<ChannelPairingLinkFailure> getEntries() {
        return $ENTRIES;
    }

    public static ChannelPairingLinkFailure valueOf(String str) {
        return (ChannelPairingLinkFailure) Enum.valueOf(ChannelPairingLinkFailure.class, str);
    }

    public static ChannelPairingLinkFailure[] values() {
        return (ChannelPairingLinkFailure[]) $VALUES.clone();
    }

    public final String getResult() {
        return this.result;
    }

    public final String getStep() {
        return this.step;
    }

    public ChannelPairingLinkFailure(String str, int i, String str2, String str3) {
        this.step = str2;
        this.result = str3;
    }
}
