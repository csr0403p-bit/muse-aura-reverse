package com.facebook.aura.onepassword;

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
public final class OnePasswordGrantReferenceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String reference;

    public final class Companion {
        public final C9hr<OnePasswordGrantReferenceJson> serializer() {
            return OnePasswordGrantReferenceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword(OnePasswordGrantReferenceJson onePasswordGrantReferenceJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(onePasswordGrantReferenceJson.reference)) {
            c9j5.AAV(onePasswordGrantReferenceJson.reference, c9iZ, 0);
        }
    }

    public final OnePasswordGrantReferenceJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new OnePasswordGrantReferenceJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnePasswordGrantReferenceJson) && C7384Etj.areEqual(this.reference, ((OnePasswordGrantReferenceJson) obj).reference));
    }

    public static /* synthetic */ OnePasswordGrantReferenceJson copy$default(OnePasswordGrantReferenceJson onePasswordGrantReferenceJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePasswordGrantReferenceJson.reference;
        }
        C7384Etj.A0Y(str, 0);
        return new OnePasswordGrantReferenceJson(str);
    }

    public final String component1() {
        return this.reference;
    }

    public final String getReference() {
        return this.reference;
    }

    public int hashCode() {
        return this.reference.hashCode();
    }

    public /* synthetic */ OnePasswordGrantReferenceJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.reference = "";
        } else {
            this.reference = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public OnePasswordGrantReferenceJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.reference = str;
    }

    public /* synthetic */ OnePasswordGrantReferenceJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public OnePasswordGrantReferenceJson() {
        this("");
    }
}
