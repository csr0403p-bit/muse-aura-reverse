package com.facebook.aura.onepassword;

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
/* loaded from: classes3.dex */
public final class OnePasswordResolvedGrantJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final OnePasswordGrantReferenceJson reference;

    public final class Companion {
        public final C9hr<OnePasswordResolvedGrantJson> serializer() {
            return OnePasswordResolvedGrantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword(OnePasswordResolvedGrantJson onePasswordResolvedGrantJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || onePasswordResolvedGrantJson.reference != null) {
            c9j5.AAP(onePasswordResolvedGrantJson.reference, OnePasswordGrantReferenceJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnePasswordResolvedGrantJson) && C7384Etj.areEqual(this.reference, ((OnePasswordResolvedGrantJson) obj).reference));
    }

    public static /* synthetic */ OnePasswordResolvedGrantJson copy$default(OnePasswordResolvedGrantJson onePasswordResolvedGrantJson, OnePasswordGrantReferenceJson onePasswordGrantReferenceJson, int i, Object obj) {
        if ((i & 1) != 0) {
            onePasswordGrantReferenceJson = onePasswordResolvedGrantJson.reference;
        }
        return new OnePasswordResolvedGrantJson(onePasswordGrantReferenceJson);
    }

    public final OnePasswordGrantReferenceJson component1() {
        return this.reference;
    }

    public final OnePasswordResolvedGrantJson copy(OnePasswordGrantReferenceJson onePasswordGrantReferenceJson) {
        return new OnePasswordResolvedGrantJson(onePasswordGrantReferenceJson);
    }

    public final OnePasswordGrantReferenceJson getReference() {
        return this.reference;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.reference);
    }

    public /* synthetic */ OnePasswordResolvedGrantJson(int i, OnePasswordGrantReferenceJson onePasswordGrantReferenceJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.reference = null;
        } else {
            this.reference = onePasswordGrantReferenceJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public OnePasswordResolvedGrantJson(OnePasswordGrantReferenceJson onePasswordGrantReferenceJson) {
        this.reference = onePasswordGrantReferenceJson;
    }

    public /* synthetic */ OnePasswordResolvedGrantJson(OnePasswordGrantReferenceJson onePasswordGrantReferenceJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : onePasswordGrantReferenceJson);
    }

    public OnePasswordResolvedGrantJson() {
        this(null);
    }
}
