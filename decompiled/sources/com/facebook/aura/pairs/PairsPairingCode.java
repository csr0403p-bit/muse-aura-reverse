package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class PairsPairingCode {
    public static final int $stable = 0;
    public final String ceremonyId;
    public final String confirmRequestId;
    public final String digits;
    public final String generationId;

    public final String getCeremonyId() {
        return this.ceremonyId;
    }

    public final String getConfirmRequestId() {
        return this.confirmRequestId;
    }

    public final String getDigits() {
        return this.digits;
    }

    public final String getGenerationId() {
        return this.generationId;
    }

    public PairsPairingCode(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.generationId = str;
        this.ceremonyId = str2;
        this.digits = str3;
        this.confirmRequestId = str4;
    }
}
