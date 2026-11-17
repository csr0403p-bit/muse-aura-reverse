package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkSetupRefusal {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkSetupRefusal[] $VALUES;
    public static final LinkSetupRefusal BUTTON_PRESS_TIMED_OUT;
    public static final LinkSetupRefusal GADGET_FIRMWARE_UPDATE_REQUIRED;

    static {
        LinkSetupRefusal linkSetupRefusal = new LinkSetupRefusal("GADGET_FIRMWARE_UPDATE_REQUIRED", 0);
        GADGET_FIRMWARE_UPDATE_REQUIRED = linkSetupRefusal;
        LinkSetupRefusal linkSetupRefusal2 = new LinkSetupRefusal("BUTTON_PRESS_TIMED_OUT", 1);
        BUTTON_PRESS_TIMED_OUT = linkSetupRefusal2;
        LinkSetupRefusal[] linkSetupRefusalArr = {linkSetupRefusal, linkSetupRefusal2};
        $VALUES = linkSetupRefusalArr;
        $ENTRIES = C3cG.A0w(linkSetupRefusalArr);
    }

    public static Ey9<LinkSetupRefusal> getEntries() {
        return $ENTRIES;
    }

    public static LinkSetupRefusal valueOf(String str) {
        return (LinkSetupRefusal) Enum.valueOf(LinkSetupRefusal.class, str);
    }

    public static LinkSetupRefusal[] values() {
        return (LinkSetupRefusal[]) $VALUES.clone();
    }

    public LinkSetupRefusal(String str, int i) {
    }
}
