package com.facebook.aura.ageverification;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AgeVerificationUploadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final Long max_bytes;
    public final boolean required;

    public final class Companion {
        public final C9hr<AgeVerificationUploadJson> serializer() {
            return AgeVerificationUploadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AgeVerificationUploadJson(String str, boolean z, Long l) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.required = z;
        this.max_bytes = l;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(AgeVerificationUploadJson ageVerificationUploadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(ageVerificationUploadJson.kind)) {
            c9j5.AAV(ageVerificationUploadJson.kind, c9iZ, 0);
        }
        if (zAfR || !ageVerificationUploadJson.required) {
            c9j5.AA7(c9iZ, 1, ageVerificationUploadJson.required);
        }
        if (zAfR || ageVerificationUploadJson.max_bytes != null) {
            c9j5.AAP(ageVerificationUploadJson.max_bytes, C9j1.A00, c9iZ, 2);
        }
    }

    public final AgeVerificationUploadJson copy(String str, boolean z, Long l) {
        C7384Etj.A0Y(str, 0);
        return new AgeVerificationUploadJson(str, z, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgeVerificationUploadJson) {
                AgeVerificationUploadJson ageVerificationUploadJson = (AgeVerificationUploadJson) obj;
                if (!C7384Etj.areEqual(this.kind, ageVerificationUploadJson.kind) || this.required != ageVerificationUploadJson.required || !C7384Etj.areEqual(this.max_bytes, ageVerificationUploadJson.max_bytes)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgeVerificationUploadJson copy$default(AgeVerificationUploadJson ageVerificationUploadJson, String str, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageVerificationUploadJson.kind;
        }
        if ((i & 2) != 0) {
            z = ageVerificationUploadJson.required;
        }
        if ((i & 4) != 0) {
            l = ageVerificationUploadJson.max_bytes;
        }
        return ageVerificationUploadJson.copy(str, z, l);
    }

    public final String component1() {
        return this.kind;
    }

    public final boolean component2() {
        return this.required;
    }

    public final Long component3() {
        return this.max_bytes;
    }

    public final String getKind() {
        return this.kind;
    }

    public final Long getMax_bytes() {
        return this.max_bytes;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass001.A0G(this.kind), this.required) + AnonymousClass006.A0D(this.max_bytes);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AgeVerificationUploadJson(int i, String str, boolean z, Long l, C2hx c2hx) {
        this.kind = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.required = true;
        } else {
            this.required = z;
        }
        if ((i & 4) == 0) {
            this.max_bytes = null;
        } else {
            this.max_bytes = l;
        }
    }

    public /* synthetic */ AgeVerificationUploadJson(String str, boolean z, Long l, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cG.A1J(i, z), (i & 4) != 0 ? null : l);
    }

    public AgeVerificationUploadJson() {
        this("", true, null);
    }
}
