package com.facebook.aura.devices.intf;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LinkDeviceTokenRevokeOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkDeviceTokenRevokeOutcome[] $VALUES;
    public static final LinkDeviceTokenRevokeOutcome ANSWERED_NOT_REVOKED;
    public static final LinkDeviceTokenRevokeOutcome NOT_SENT;
    public static final LinkDeviceTokenRevokeOutcome REVOKED;
    public static final LinkDeviceTokenRevokeOutcome UNKNOWN;

    static {
        LinkDeviceTokenRevokeOutcome linkDeviceTokenRevokeOutcome = new LinkDeviceTokenRevokeOutcome("REVOKED", 0);
        REVOKED = linkDeviceTokenRevokeOutcome;
        LinkDeviceTokenRevokeOutcome linkDeviceTokenRevokeOutcome2 = new LinkDeviceTokenRevokeOutcome("ANSWERED_NOT_REVOKED", 1);
        ANSWERED_NOT_REVOKED = linkDeviceTokenRevokeOutcome2;
        LinkDeviceTokenRevokeOutcome linkDeviceTokenRevokeOutcome3 = new LinkDeviceTokenRevokeOutcome("NOT_SENT", 2);
        NOT_SENT = linkDeviceTokenRevokeOutcome3;
        LinkDeviceTokenRevokeOutcome linkDeviceTokenRevokeOutcome4 = new LinkDeviceTokenRevokeOutcome("UNKNOWN", 3);
        UNKNOWN = linkDeviceTokenRevokeOutcome4;
        LinkDeviceTokenRevokeOutcome[] linkDeviceTokenRevokeOutcomeArr = {linkDeviceTokenRevokeOutcome, linkDeviceTokenRevokeOutcome2, linkDeviceTokenRevokeOutcome3, linkDeviceTokenRevokeOutcome4};
        $VALUES = linkDeviceTokenRevokeOutcomeArr;
        $ENTRIES = new F3w(linkDeviceTokenRevokeOutcomeArr);
    }

    public static Ey9<LinkDeviceTokenRevokeOutcome> getEntries() {
        return $ENTRIES;
    }

    public static LinkDeviceTokenRevokeOutcome valueOf(String str) {
        return (LinkDeviceTokenRevokeOutcome) Enum.valueOf(LinkDeviceTokenRevokeOutcome.class, str);
    }

    public static LinkDeviceTokenRevokeOutcome[] values() {
        return (LinkDeviceTokenRevokeOutcome[]) $VALUES.clone();
    }

    public LinkDeviceTokenRevokeOutcome(String str, int i) {
    }
}
