package com.facebook.aura.ageverification;

import X.C7384Etj;

/* loaded from: classes6.dex */
public final class AgeVerificationUpload {
    public static final int $stable = 0;
    public final AgeVerificationUploadKind kind;
    public final Long maxBytes;
    public final boolean required;

    public AgeVerificationUpload(AgeVerificationUploadKind ageVerificationUploadKind, Long l, boolean z) {
        C7384Etj.A0Y(ageVerificationUploadKind, 0);
        this.kind = ageVerificationUploadKind;
        this.maxBytes = l;
        this.required = z;
    }

    public final AgeVerificationUploadKind getKind() {
        return this.kind;
    }

    public final Long getMaxBytes() {
        return this.maxBytes;
    }

    public final boolean getRequired() {
        return this.required;
    }
}
