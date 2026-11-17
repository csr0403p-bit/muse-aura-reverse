package com.facebook.aura.partners.wearables.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class WearablesCommsConsentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean comms_consent_granted;

    public final class Companion {
        public final C9hr<WearablesCommsConsentJson> serializer() {
            return WearablesCommsConsentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof WearablesCommsConsentJson) && this.comms_consent_granted == ((WearablesCommsConsentJson) obj).comms_consent_granted);
    }

    public /* synthetic */ WearablesCommsConsentJson(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(WearablesCommsConsentJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.comms_consent_granted = z;
    }

    public static /* synthetic */ WearablesCommsConsentJson copy$default(WearablesCommsConsentJson wearablesCommsConsentJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wearablesCommsConsentJson.comms_consent_granted;
        }
        return new WearablesCommsConsentJson(z);
    }

    public final boolean component1() {
        return this.comms_consent_granted;
    }

    public final WearablesCommsConsentJson copy(boolean z) {
        return new WearablesCommsConsentJson(z);
    }

    public final boolean getComms_consent_granted() {
        return this.comms_consent_granted;
    }

    public int hashCode() {
        return this.comms_consent_granted ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public WearablesCommsConsentJson(boolean z) {
        this.comms_consent_granted = z;
    }
}
