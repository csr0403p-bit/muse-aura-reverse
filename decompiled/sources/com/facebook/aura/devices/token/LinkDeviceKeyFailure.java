package com.facebook.aura.devices.token;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkDeviceKeyFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkDeviceKeyFailure[] $VALUES;
    public static final LinkDeviceKeyFailure INVALID_REGISTRATION;
    public static final LinkDeviceKeyFailure MALFORMED_RESPONSE;
    public static final LinkDeviceKeyFailure OWNER_SESSION_UNAVAILABLE;
    public static final LinkDeviceKeyFailure REJECTED;
    public static final LinkDeviceKeyFailure REVOCATION_PENDING;
    public static final LinkDeviceKeyFailure TARGET_UNRESOLVED;
    public static final LinkDeviceKeyFailure TRANSPORT_FAILED;

    static {
        LinkDeviceKeyFailure linkDeviceKeyFailure = new LinkDeviceKeyFailure("TARGET_UNRESOLVED", 0);
        TARGET_UNRESOLVED = linkDeviceKeyFailure;
        LinkDeviceKeyFailure linkDeviceKeyFailure2 = new LinkDeviceKeyFailure("OWNER_SESSION_UNAVAILABLE", 1);
        OWNER_SESSION_UNAVAILABLE = linkDeviceKeyFailure2;
        LinkDeviceKeyFailure linkDeviceKeyFailure3 = new LinkDeviceKeyFailure("INVALID_REGISTRATION", 2);
        INVALID_REGISTRATION = linkDeviceKeyFailure3;
        LinkDeviceKeyFailure linkDeviceKeyFailure4 = new LinkDeviceKeyFailure("REJECTED", 3);
        REJECTED = linkDeviceKeyFailure4;
        LinkDeviceKeyFailure linkDeviceKeyFailure5 = new LinkDeviceKeyFailure("TRANSPORT_FAILED", 4);
        TRANSPORT_FAILED = linkDeviceKeyFailure5;
        LinkDeviceKeyFailure linkDeviceKeyFailure6 = new LinkDeviceKeyFailure("MALFORMED_RESPONSE", 5);
        MALFORMED_RESPONSE = linkDeviceKeyFailure6;
        LinkDeviceKeyFailure linkDeviceKeyFailure7 = new LinkDeviceKeyFailure("REVOCATION_PENDING", 6);
        REVOCATION_PENDING = linkDeviceKeyFailure7;
        LinkDeviceKeyFailure[] linkDeviceKeyFailureArr = {linkDeviceKeyFailure, linkDeviceKeyFailure2, linkDeviceKeyFailure3, linkDeviceKeyFailure4, linkDeviceKeyFailure5, linkDeviceKeyFailure6, linkDeviceKeyFailure7};
        $VALUES = linkDeviceKeyFailureArr;
        $ENTRIES = C3cG.A0w(linkDeviceKeyFailureArr);
    }

    public static Ey9<LinkDeviceKeyFailure> getEntries() {
        return $ENTRIES;
    }

    public static LinkDeviceKeyFailure valueOf(String str) {
        return (LinkDeviceKeyFailure) Enum.valueOf(LinkDeviceKeyFailure.class, str);
    }

    public static LinkDeviceKeyFailure[] values() {
        return (LinkDeviceKeyFailure[]) $VALUES.clone();
    }

    public LinkDeviceKeyFailure(String str, int i) {
    }
}
