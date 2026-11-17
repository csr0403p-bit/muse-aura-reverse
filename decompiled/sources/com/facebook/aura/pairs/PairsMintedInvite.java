package com.facebook.aura.pairs;

import X.AnonymousClass003;

/* loaded from: classes3.dex */
public final class PairsMintedInvite {
    public static final int $stable = 0;
    public final Long expiresAtMs;
    public final String inviteB64;
    public final String inviteId;
    public final String url;

    public final Long getExpiresAtMs() {
        return this.expiresAtMs;
    }

    public final String getInviteB64() {
        return this.inviteB64;
    }

    public final String getInviteId() {
        return this.inviteId;
    }

    public final String getUrl() {
        return this.url;
    }

    public PairsMintedInvite(String str, String str2, String str3, Long l) {
        AnonymousClass003.A0u(str, str2);
        this.inviteId = str;
        this.url = str2;
        this.inviteB64 = str3;
        this.expiresAtMs = l;
    }
}
