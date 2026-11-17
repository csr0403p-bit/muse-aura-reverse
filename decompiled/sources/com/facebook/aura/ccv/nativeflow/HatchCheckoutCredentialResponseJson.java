package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCheckoutCredentialResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final HatchCredentialMutationJson mutation;

    public final class Companion {
        public final C9hr<HatchCheckoutCredentialResponseJson> serializer() {
            return HatchCheckoutCredentialResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutCredentialResponseJson hatchCheckoutCredentialResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || hatchCheckoutCredentialResponseJson.mutation != null) {
            c9j5.AAP(hatchCheckoutCredentialResponseJson.mutation, HatchCredentialMutationJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchCheckoutCredentialResponseJson) && C7384Etj.areEqual(this.mutation, ((HatchCheckoutCredentialResponseJson) obj).mutation));
    }

    public static /* synthetic */ HatchCheckoutCredentialResponseJson copy$default(HatchCheckoutCredentialResponseJson hatchCheckoutCredentialResponseJson, HatchCredentialMutationJson hatchCredentialMutationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchCredentialMutationJson = hatchCheckoutCredentialResponseJson.mutation;
        }
        return new HatchCheckoutCredentialResponseJson(hatchCredentialMutationJson);
    }

    public final HatchCredentialMutationJson component1() {
        return this.mutation;
    }

    public final HatchCheckoutCredentialResponseJson copy(HatchCredentialMutationJson hatchCredentialMutationJson) {
        return new HatchCheckoutCredentialResponseJson(hatchCredentialMutationJson);
    }

    public final HatchCredentialMutationJson getMutation() {
        return this.mutation;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.mutation);
    }

    public /* synthetic */ HatchCheckoutCredentialResponseJson(int i, HatchCredentialMutationJson hatchCredentialMutationJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.mutation = null;
        } else {
            this.mutation = hatchCredentialMutationJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchCheckoutCredentialResponseJson(HatchCredentialMutationJson hatchCredentialMutationJson) {
        this.mutation = hatchCredentialMutationJson;
    }

    public /* synthetic */ HatchCheckoutCredentialResponseJson(HatchCredentialMutationJson hatchCredentialMutationJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchCredentialMutationJson);
    }

    public HatchCheckoutCredentialResponseJson() {
        this(null);
    }
}
