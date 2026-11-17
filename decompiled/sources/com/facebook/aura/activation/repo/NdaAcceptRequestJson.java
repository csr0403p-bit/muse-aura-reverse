package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class NdaAcceptRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String email;
    public final String name;

    public final class Companion {
        public final C9hr<NdaAcceptRequestJson> serializer() {
            return NdaAcceptRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(NdaAcceptRequestJson ndaAcceptRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(ndaAcceptRequestJson.name, c9iZ, 0);
        c9j5.AAV(ndaAcceptRequestJson.email, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NdaAcceptRequestJson) {
                NdaAcceptRequestJson ndaAcceptRequestJson = (NdaAcceptRequestJson) obj;
                if (!C7384Etj.areEqual(this.name, ndaAcceptRequestJson.name) || !C7384Etj.areEqual(this.email, ndaAcceptRequestJson.email)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NdaAcceptRequestJson copy$default(NdaAcceptRequestJson ndaAcceptRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ndaAcceptRequestJson.name;
        }
        if ((i & 2) != 0) {
            str2 = ndaAcceptRequestJson.email;
        }
        AnonymousClass003.A0u(str, str2);
        return new NdaAcceptRequestJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.email;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.email, AnonymousClass001.A0G(this.name));
    }

    public NdaAcceptRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.email = str2;
    }

    public final NdaAcceptRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new NdaAcceptRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NdaAcceptRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(NdaAcceptRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.email = str2;
    }
}
