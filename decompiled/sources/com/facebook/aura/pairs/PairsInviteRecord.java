package com.facebook.aura.pairs;

import X.AnonymousClass003;
import X.C06H;
import X.C3cI;

/* loaded from: classes3.dex */
public final class PairsInviteRecord {
    public static final int $stable = 0;
    public final String claimedByMuse;
    public final long expiresAtMs;
    public final String id;
    public final String label;
    public final boolean sentOnMuse;

    public final String getClaimedByMuse() {
        return this.claimedByMuse;
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

    public final boolean getSentOnMuse() {
        return this.sentOnMuse;
    }

    public PairsInviteRecord(String str, String str2, long j, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.label = str2;
        this.expiresAtMs = j;
        this.claimedByMuse = str3;
        this.sentOnMuse = z;
    }

    public /* synthetic */ PairsInviteRecord(String str, String str2, long j, String str3, boolean z, int i, C06H c06h) {
        this(str, str2, j, str3, C3cI.A1S(i, z));
    }
}
