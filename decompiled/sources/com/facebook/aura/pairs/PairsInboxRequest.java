package com.facebook.aura.pairs;

import X.AnonymousClass003;

/* loaded from: classes3.dex */
public final class PairsInboxRequest {
    public static final int $stable = 0;
    public final String deliveryId;
    public final long expiresAtMs;
    public final String museId;
    public final String personName;
    public final PairsImageRef photo;
    public final long receivedAtMs;

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final long getExpiresAtMs() {
        return this.expiresAtMs;
    }

    public final String getMuseId() {
        return this.museId;
    }

    public final String getPersonName() {
        return this.personName;
    }

    public final PairsImageRef getPhoto() {
        return this.photo;
    }

    public final long getReceivedAtMs() {
        return this.receivedAtMs;
    }

    public PairsInboxRequest(String str, String str2, String str3, long j, PairsImageRef pairsImageRef, long j2) {
        AnonymousClass003.A0v(str, str3);
        this.deliveryId = str;
        this.personName = str2;
        this.museId = str3;
        this.expiresAtMs = j;
        this.photo = pairsImageRef;
        this.receivedAtMs = j2;
    }
}
