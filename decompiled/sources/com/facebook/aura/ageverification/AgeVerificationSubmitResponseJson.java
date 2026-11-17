package com.facebook.aura.ageverification;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class AgeVerificationSubmitResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String status;

    public final class Companion {
        public final C9hr<AgeVerificationSubmitResponseJson> serializer() {
            return AgeVerificationSubmitResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(AgeVerificationSubmitResponseJson ageVerificationSubmitResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(ageVerificationSubmitResponseJson.status)) {
            c9j5.AAV(ageVerificationSubmitResponseJson.status, c9iZ, 0);
        }
    }

    public final AgeVerificationSubmitResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AgeVerificationSubmitResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AgeVerificationSubmitResponseJson) && C7384Etj.areEqual(this.status, ((AgeVerificationSubmitResponseJson) obj).status));
    }

    public static /* synthetic */ AgeVerificationSubmitResponseJson copy$default(AgeVerificationSubmitResponseJson ageVerificationSubmitResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageVerificationSubmitResponseJson.status;
        }
        C7384Etj.A0Y(str, 0);
        return new AgeVerificationSubmitResponseJson(str);
    }

    public final String component1() {
        return this.status;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public /* synthetic */ AgeVerificationSubmitResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.status = "";
        } else {
            this.status = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AgeVerificationSubmitResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.status = str;
    }

    public /* synthetic */ AgeVerificationSubmitResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public AgeVerificationSubmitResponseJson() {
        this("");
    }
}
