package com.facebook.aura.activation.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class NdaAcceptResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Boolean success;

    public final class Companion {
        public final C9hr<NdaAcceptResponseJson> serializer() {
            return NdaAcceptResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(NdaAcceptResponseJson ndaAcceptResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || ndaAcceptResponseJson.success != null) {
            c9j5.AAP(ndaAcceptResponseJson.success, C07839ix.A00, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NdaAcceptResponseJson) && C7384Etj.areEqual(this.success, ((NdaAcceptResponseJson) obj).success));
    }

    public static /* synthetic */ NdaAcceptResponseJson copy$default(NdaAcceptResponseJson ndaAcceptResponseJson, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = ndaAcceptResponseJson.success;
        }
        return new NdaAcceptResponseJson(bool);
    }

    public final Boolean component1() {
        return this.success;
    }

    public final NdaAcceptResponseJson copy(Boolean bool) {
        return new NdaAcceptResponseJson(bool);
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.success);
    }

    public /* synthetic */ NdaAcceptResponseJson(int i, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.success = null;
        } else {
            this.success = bool;
        }
    }

    public String toString() {
        return super.toString();
    }

    public NdaAcceptResponseJson(Boolean bool) {
        this.success = bool;
    }

    public /* synthetic */ NdaAcceptResponseJson(Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool);
    }

    public NdaAcceptResponseJson() {
        this(null);
    }
}
