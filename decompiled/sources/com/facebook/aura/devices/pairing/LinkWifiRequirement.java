package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkWifiRequirement {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkWifiRequirement[] $VALUES;
    public static final LinkWifiRequirement NONE;
    public static final LinkWifiRequirement OPTIONAL;
    public static final LinkWifiRequirement REQUIRED;

    static {
        LinkWifiRequirement linkWifiRequirement = new LinkWifiRequirement("REQUIRED", 0);
        REQUIRED = linkWifiRequirement;
        LinkWifiRequirement linkWifiRequirement2 = new LinkWifiRequirement("OPTIONAL", 1);
        OPTIONAL = linkWifiRequirement2;
        LinkWifiRequirement linkWifiRequirement3 = new LinkWifiRequirement(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 2);
        NONE = linkWifiRequirement3;
        LinkWifiRequirement[] linkWifiRequirementArr = {linkWifiRequirement, linkWifiRequirement2, linkWifiRequirement3};
        $VALUES = linkWifiRequirementArr;
        $ENTRIES = C3cG.A0w(linkWifiRequirementArr);
    }

    public static Ey9<LinkWifiRequirement> getEntries() {
        return $ENTRIES;
    }

    public static LinkWifiRequirement valueOf(String str) {
        return (LinkWifiRequirement) Enum.valueOf(LinkWifiRequirement.class, str);
    }

    public static LinkWifiRequirement[] values() {
        return (LinkWifiRequirement[]) $VALUES.clone();
    }

    public LinkWifiRequirement(String str, int i) {
    }
}
