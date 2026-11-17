package com.facebook.aura.confidentialvm.vmswitch;

import X.Ey9;
import X.F3w;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmSwitchDestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmSwitchDestination[] $VALUES;
    public static final ConfidentialVmSwitchDestination CVM_ENCRYPTION_SETTINGS;
    public static final ConfidentialVmSwitchDestination CVM_JOIN_WAITLIST;
    public static final ConfidentialVmSwitchDestination CVM_LOADING;
    public static final ConfidentialVmSwitchDestination CVM_ON_WAITLIST;
    public static final ConfidentialVmSwitchDestination CVM_SUBSCRIBE;
    public static final ConfidentialVmSwitchDestination CVM_SWITCH_INTRO;
    public static final ConfidentialVmSwitchDestination CVM_UNAVAILABLE;
    public static final ConfidentialVmSwitchDestination NONE;

    static {
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination = new ConfidentialVmSwitchDestination(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = confidentialVmSwitchDestination;
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination2 = new ConfidentialVmSwitchDestination("CVM_SUBSCRIBE", 1);
        CVM_SUBSCRIBE = confidentialVmSwitchDestination2;
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination3 = new ConfidentialVmSwitchDestination("CVM_SWITCH_INTRO", 2);
        CVM_SWITCH_INTRO = confidentialVmSwitchDestination3;
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination4 = new ConfidentialVmSwitchDestination("CVM_JOIN_WAITLIST", 3);
        CVM_JOIN_WAITLIST = confidentialVmSwitchDestination4;
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination5 = new ConfidentialVmSwitchDestination("CVM_ON_WAITLIST", 4);
        CVM_ON_WAITLIST = confidentialVmSwitchDestination5;
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination6 = new ConfidentialVmSwitchDestination("CVM_LOADING", 5);
        CVM_LOADING = confidentialVmSwitchDestination6;
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination7 = new ConfidentialVmSwitchDestination("CVM_UNAVAILABLE", 6);
        CVM_UNAVAILABLE = confidentialVmSwitchDestination7;
        ConfidentialVmSwitchDestination confidentialVmSwitchDestination8 = new ConfidentialVmSwitchDestination("CVM_ENCRYPTION_SETTINGS", 7);
        CVM_ENCRYPTION_SETTINGS = confidentialVmSwitchDestination8;
        ConfidentialVmSwitchDestination[] confidentialVmSwitchDestinationArr = {confidentialVmSwitchDestination, confidentialVmSwitchDestination2, confidentialVmSwitchDestination3, confidentialVmSwitchDestination4, confidentialVmSwitchDestination5, confidentialVmSwitchDestination6, confidentialVmSwitchDestination7, confidentialVmSwitchDestination8};
        $VALUES = confidentialVmSwitchDestinationArr;
        $ENTRIES = new F3w(confidentialVmSwitchDestinationArr);
    }

    public static Ey9<ConfidentialVmSwitchDestination> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmSwitchDestination valueOf(String str) {
        return (ConfidentialVmSwitchDestination) Enum.valueOf(ConfidentialVmSwitchDestination.class, str);
    }

    public static ConfidentialVmSwitchDestination[] values() {
        return (ConfidentialVmSwitchDestination[]) $VALUES.clone();
    }

    public ConfidentialVmSwitchDestination(String str, int i) {
    }
}
