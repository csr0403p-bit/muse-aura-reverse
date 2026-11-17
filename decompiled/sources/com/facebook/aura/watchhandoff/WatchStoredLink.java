package com.facebook.aura.watchhandoff;

import X.AnonymousClass003;

/* loaded from: classes5.dex */
public final class WatchStoredLink {
    public static final int $stable = 0;
    public final String linkId;
    public final String nodeId;
    public final String userId;

    public final String getLinkId() {
        return this.linkId;
    }

    public final String getNodeId() {
        return this.nodeId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public WatchStoredLink(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.userId = str;
        this.linkId = str2;
        this.nodeId = str3;
    }
}
