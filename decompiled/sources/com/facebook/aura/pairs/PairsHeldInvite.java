package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class PairsHeldInvite {
    public static final int $stable = PairsInvitePreview.$stable;
    public final long expiresAtMs;
    public final String generationId;
    public final PairsInvitePreview preview;
    public final String token;

    public final long getExpiresAtMs() {
        return this.expiresAtMs;
    }

    public final String getGenerationId() {
        return this.generationId;
    }

    public final PairsInvitePreview getPreview() {
        return this.preview;
    }

    public final String getToken() {
        return this.token;
    }

    public PairsHeldInvite(String str, PairsInvitePreview pairsInvitePreview, String str2, long j) {
        AnonymousClass005.A0x(str, pairsInvitePreview, str2);
        this.token = str;
        this.preview = pairsInvitePreview;
        this.generationId = str2;
        this.expiresAtMs = j;
    }
}
