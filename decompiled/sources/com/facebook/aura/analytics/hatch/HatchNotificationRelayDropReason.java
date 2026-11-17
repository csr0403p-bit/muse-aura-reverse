package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchNotificationRelayDropReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchNotificationRelayDropReason[] $VALUES;
    public static final HatchNotificationRelayDropReason FAILED;
    public static final HatchNotificationRelayDropReason MISSING_FLAG;
    public static final HatchNotificationRelayDropReason MISSING_TTS;
    public static final HatchNotificationRelayDropReason NOT_INSTALLED;
    public static final HatchNotificationRelayDropReason OPT_IN_DISABLED;
    public static final HatchNotificationRelayDropReason UNTRUSTED;
    public final String value;

    static {
        HatchNotificationRelayDropReason hatchNotificationRelayDropReason = new HatchNotificationRelayDropReason("MISSING_FLAG", 0, "missing_flag");
        MISSING_FLAG = hatchNotificationRelayDropReason;
        HatchNotificationRelayDropReason hatchNotificationRelayDropReason2 = new HatchNotificationRelayDropReason("MISSING_TTS", 1, "missing_tts");
        MISSING_TTS = hatchNotificationRelayDropReason2;
        HatchNotificationRelayDropReason hatchNotificationRelayDropReason3 = new HatchNotificationRelayDropReason("OPT_IN_DISABLED", 2, "opt_in_disabled");
        OPT_IN_DISABLED = hatchNotificationRelayDropReason3;
        HatchNotificationRelayDropReason hatchNotificationRelayDropReason4 = new HatchNotificationRelayDropReason("NOT_INSTALLED", 3, "not_installed");
        NOT_INSTALLED = hatchNotificationRelayDropReason4;
        HatchNotificationRelayDropReason hatchNotificationRelayDropReason5 = new HatchNotificationRelayDropReason("UNTRUSTED", 4, "untrusted");
        UNTRUSTED = hatchNotificationRelayDropReason5;
        HatchNotificationRelayDropReason hatchNotificationRelayDropReason6 = new HatchNotificationRelayDropReason(CvmMigrationStatusJson.STAGE_FAILED, 5, "failed");
        FAILED = hatchNotificationRelayDropReason6;
        HatchNotificationRelayDropReason[] hatchNotificationRelayDropReasonArr = {hatchNotificationRelayDropReason, hatchNotificationRelayDropReason2, hatchNotificationRelayDropReason3, hatchNotificationRelayDropReason4, hatchNotificationRelayDropReason5, hatchNotificationRelayDropReason6};
        $VALUES = hatchNotificationRelayDropReasonArr;
        $ENTRIES = C3cG.A0w(hatchNotificationRelayDropReasonArr);
    }

    public static Ey9<HatchNotificationRelayDropReason> getEntries() {
        return $ENTRIES;
    }

    public static HatchNotificationRelayDropReason valueOf(String str) {
        return (HatchNotificationRelayDropReason) Enum.valueOf(HatchNotificationRelayDropReason.class, str);
    }

    public static HatchNotificationRelayDropReason[] values() {
        return (HatchNotificationRelayDropReason[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchNotificationRelayDropReason(String str, int i, String str2) {
        this.value = str2;
    }
}
