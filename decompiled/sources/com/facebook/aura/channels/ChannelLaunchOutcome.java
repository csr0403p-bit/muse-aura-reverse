package com.facebook.aura.channels;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ChannelLaunchOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ChannelLaunchOutcome[] $VALUES;
    public static final ChannelLaunchOutcome FAILED;
    public static final ChannelLaunchOutcome OPENED_APP;
    public static final ChannelLaunchOutcome OPENED_DEEPLINK;
    public static final ChannelLaunchOutcome OPENED_WEB;
    public static final ChannelLaunchOutcome SENT_TO_STORE;

    static {
        ChannelLaunchOutcome channelLaunchOutcome = new ChannelLaunchOutcome("OPENED_DEEPLINK", 0);
        OPENED_DEEPLINK = channelLaunchOutcome;
        ChannelLaunchOutcome channelLaunchOutcome2 = new ChannelLaunchOutcome("OPENED_APP", 1);
        OPENED_APP = channelLaunchOutcome2;
        ChannelLaunchOutcome channelLaunchOutcome3 = new ChannelLaunchOutcome("OPENED_WEB", 2);
        OPENED_WEB = channelLaunchOutcome3;
        ChannelLaunchOutcome channelLaunchOutcome4 = new ChannelLaunchOutcome("SENT_TO_STORE", 3);
        SENT_TO_STORE = channelLaunchOutcome4;
        ChannelLaunchOutcome channelLaunchOutcome5 = new ChannelLaunchOutcome(CvmMigrationStatusJson.STAGE_FAILED, 4);
        FAILED = channelLaunchOutcome5;
        ChannelLaunchOutcome[] channelLaunchOutcomeArr = {channelLaunchOutcome, channelLaunchOutcome2, channelLaunchOutcome3, channelLaunchOutcome4, channelLaunchOutcome5};
        $VALUES = channelLaunchOutcomeArr;
        $ENTRIES = new F3w(channelLaunchOutcomeArr);
    }

    public static Ey9<ChannelLaunchOutcome> getEntries() {
        return $ENTRIES;
    }

    public static ChannelLaunchOutcome valueOf(String str) {
        return (ChannelLaunchOutcome) Enum.valueOf(ChannelLaunchOutcome.class, str);
    }

    public static ChannelLaunchOutcome[] values() {
        return (ChannelLaunchOutcome[]) $VALUES.clone();
    }

    public final boolean getReachedChannel() {
        return this == OPENED_DEEPLINK || this == OPENED_APP || this == OPENED_WEB;
    }

    public ChannelLaunchOutcome(String str, int i) {
    }
}
