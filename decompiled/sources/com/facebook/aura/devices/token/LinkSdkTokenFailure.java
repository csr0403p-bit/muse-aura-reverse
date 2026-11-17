package com.facebook.aura.devices.token;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LinkSdkTokenFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkSdkTokenFailure[] $VALUES;
    public static final LinkSdkTokenFailure DEVICE_LIMIT_REACHED;
    public static final LinkSdkTokenFailure INVALID;
    public static final LinkSdkTokenFailure MISSING;

    static {
        LinkSdkTokenFailure linkSdkTokenFailure = new LinkSdkTokenFailure("MISSING", 0);
        MISSING = linkSdkTokenFailure;
        LinkSdkTokenFailure linkSdkTokenFailure2 = new LinkSdkTokenFailure("INVALID", 1);
        INVALID = linkSdkTokenFailure2;
        LinkSdkTokenFailure linkSdkTokenFailure3 = new LinkSdkTokenFailure("DEVICE_LIMIT_REACHED", 2);
        DEVICE_LIMIT_REACHED = linkSdkTokenFailure3;
        LinkSdkTokenFailure[] linkSdkTokenFailureArr = {linkSdkTokenFailure, linkSdkTokenFailure2, linkSdkTokenFailure3};
        $VALUES = linkSdkTokenFailureArr;
        $ENTRIES = C3cG.A0w(linkSdkTokenFailureArr);
    }

    public static Ey9<LinkSdkTokenFailure> getEntries() {
        return $ENTRIES;
    }

    public static LinkSdkTokenFailure valueOf(String str) {
        return (LinkSdkTokenFailure) Enum.valueOf(LinkSdkTokenFailure.class, str);
    }

    public static LinkSdkTokenFailure[] values() {
        return (LinkSdkTokenFailure[]) $VALUES.clone();
    }

    public LinkSdkTokenFailure(String str, int i) {
    }
}
