package com.facebook.aura.composer.dictation.voyager;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoyagerAsrAuthorizationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String accessToken;

    public final class Companion {
        public final C9hr<VoyagerAsrAuthorizationJson> serializer() {
            return VoyagerAsrAuthorizationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final VoyagerAsrAuthorizationJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new VoyagerAsrAuthorizationJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VoyagerAsrAuthorizationJson) && C7384Etj.areEqual(this.accessToken, ((VoyagerAsrAuthorizationJson) obj).accessToken));
    }

    public /* synthetic */ VoyagerAsrAuthorizationJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(VoyagerAsrAuthorizationJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.accessToken = str;
    }

    public static /* synthetic */ VoyagerAsrAuthorizationJson copy$default(VoyagerAsrAuthorizationJson voyagerAsrAuthorizationJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voyagerAsrAuthorizationJson.accessToken;
        }
        C7384Etj.A0Y(str, 0);
        return new VoyagerAsrAuthorizationJson(str);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public int hashCode() {
        return this.accessToken.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public VoyagerAsrAuthorizationJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.accessToken = str;
    }
}
