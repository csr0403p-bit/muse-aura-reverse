package com.facebook.aura.devices.pairing;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LinkDeviceVerification {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkDeviceVerification[] $VALUES;
    public static final LinkDeviceVerification COMMUNITY;
    public static final LinkDeviceVerification VERIFIED_META;

    static {
        LinkDeviceVerification linkDeviceVerification = new LinkDeviceVerification("VERIFIED_META", 0);
        VERIFIED_META = linkDeviceVerification;
        LinkDeviceVerification linkDeviceVerification2 = new LinkDeviceVerification("COMMUNITY", 1);
        COMMUNITY = linkDeviceVerification2;
        LinkDeviceVerification[] linkDeviceVerificationArr = {linkDeviceVerification, linkDeviceVerification2};
        $VALUES = linkDeviceVerificationArr;
        $ENTRIES = new F3w(linkDeviceVerificationArr);
    }

    public static Ey9<LinkDeviceVerification> getEntries() {
        return $ENTRIES;
    }

    public static LinkDeviceVerification valueOf(String str) {
        return (LinkDeviceVerification) Enum.valueOf(LinkDeviceVerification.class, str);
    }

    public static LinkDeviceVerification[] values() {
        return (LinkDeviceVerification[]) $VALUES.clone();
    }

    public LinkDeviceVerification(String str, int i) {
    }
}
