package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthRegistrationAttestationJson extends C06G {
    public final List<String> errors;
    public final String evidence;
    public final String proof;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, AuthRegistrationAttestationJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AuthRegistrationAttestationJson> serializer() {
            return AuthRegistrationAttestationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthRegistrationAttestationJson) {
                AuthRegistrationAttestationJson authRegistrationAttestationJson = (AuthRegistrationAttestationJson) obj;
                if (!C7384Etj.areEqual(this.evidence, authRegistrationAttestationJson.evidence) || !C7384Etj.areEqual(this.proof, authRegistrationAttestationJson.proof) || !C7384Etj.areEqual(this.errors, authRegistrationAttestationJson.errors)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthRegistrationAttestationJson copy$default(AuthRegistrationAttestationJson authRegistrationAttestationJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authRegistrationAttestationJson.evidence;
        }
        if ((i & 2) != 0) {
            str2 = authRegistrationAttestationJson.proof;
        }
        if ((i & 4) != 0) {
            list = authRegistrationAttestationJson.errors;
        }
        return new AuthRegistrationAttestationJson(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthRegistrationAttestationJson authRegistrationAttestationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || authRegistrationAttestationJson.evidence != null) {
            c9j5.AAP(authRegistrationAttestationJson.evidence, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || authRegistrationAttestationJson.proof != null) {
            c9j5.AAP(authRegistrationAttestationJson.proof, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || authRegistrationAttestationJson.errors != null) {
            c9j5.AAP(authRegistrationAttestationJson.errors, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.evidence;
    }

    public final String component2() {
        return this.proof;
    }

    public final List<String> component3() {
        return this.errors;
    }

    public final AuthRegistrationAttestationJson copy(String str, String str2, List<String> list) {
        return new AuthRegistrationAttestationJson(str, str2, list);
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final String getEvidence() {
        return this.evidence;
    }

    public final String getProof() {
        return this.proof;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.evidence) * 31) + AnonymousClass006.A0G(this.proof)) * 31) + C3cH.A02(this.errors);
    }

    public AuthRegistrationAttestationJson(String str, String str2, List<String> list) {
        this.evidence = str;
        this.proof = str2;
        this.errors = list;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthRegistrationAttestationJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.evidence = null;
        } else {
            this.evidence = str;
        }
        if ((i & 2) == 0) {
            this.proof = null;
        } else {
            this.proof = str2;
        }
        if ((i & 4) == 0) {
            this.errors = null;
        } else {
            this.errors = list;
        }
    }

    public /* synthetic */ AuthRegistrationAttestationJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    public AuthRegistrationAttestationJson() {
        this(null, null, null);
    }
}
