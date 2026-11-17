package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class PairsInvite {
    public static final int $stable = 0;
    public final String createRequestId;
    public final long expiresAtMs;
    public final String id;
    public final String label;
    public final String offeredPreset;
    public final boolean sentOnMuse;

    public PairsInvite(String str, String str2, String str3, String str4, long j, boolean z) {
        AnonymousClass005.A11(str, str3, str4, 0);
        this.id = str;
        this.createRequestId = str2;
        this.label = str3;
        this.offeredPreset = str4;
        this.expiresAtMs = j;
        this.sentOnMuse = z;
    }

    public final String getCreateRequestId() {
        return this.createRequestId;
    }

    public final long getExpiresAtMs() {
        return this.expiresAtMs;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOfferedPreset() {
        return this.offeredPreset;
    }

    public final boolean getSentOnMuse() {
        return this.sentOnMuse;
    }
}
