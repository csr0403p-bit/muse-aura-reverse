package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class HatchAttestationRequest extends C06G {
    public final String challenge;
    public final String keyAlias;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAttestationRequest) {
                HatchAttestationRequest hatchAttestationRequest = (HatchAttestationRequest) obj;
                if (!C7384Etj.areEqual(this.keyAlias, hatchAttestationRequest.keyAlias) || !C7384Etj.areEqual(this.challenge, hatchAttestationRequest.challenge)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAttestationRequest copy$default(HatchAttestationRequest hatchAttestationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAttestationRequest.keyAlias;
        }
        if ((i & 2) != 0) {
            str2 = hatchAttestationRequest.challenge;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchAttestationRequest(str, str2);
    }

    public final String component1() {
        return this.keyAlias;
    }

    public final String component2() {
        return this.challenge;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getKeyAlias() {
        return this.keyAlias;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.challenge, AnonymousClass001.A0G(this.keyAlias));
    }

    public HatchAttestationRequest(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.keyAlias = str;
        this.challenge = str2;
    }

    public final HatchAttestationRequest copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchAttestationRequest(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
