package com.facebook.aura.ageverification;

import X.AnonymousClass003;
import java.util.List;

/* loaded from: classes6.dex */
public final class AgeVerificationAttempt {
    public static final int $stable = 8;
    public final String id;
    public final List<AgeVerificationUpload> uploads;

    public final String getId() {
        return this.id;
    }

    public final List<AgeVerificationUpload> getUploads() {
        return this.uploads;
    }

    public AgeVerificationAttempt(String str, List<AgeVerificationUpload> list) {
        AnonymousClass003.A0u(str, list);
        this.id = str;
        this.uploads = list;
    }
}
