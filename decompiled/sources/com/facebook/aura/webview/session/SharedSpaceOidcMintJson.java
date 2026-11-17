package com.facebook.aura.webview.session;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SharedSpaceOidcMintJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String uri;

    public final class Companion {
        public final C9hr<SharedSpaceOidcMintJson> serializer() {
            return SharedSpaceOidcMintJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SharedSpaceOidcMintJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SharedSpaceOidcMintJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SharedSpaceOidcMintJson) && C7384Etj.areEqual(this.uri, ((SharedSpaceOidcMintJson) obj).uri));
    }

    public /* synthetic */ SharedSpaceOidcMintJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SharedSpaceOidcMintJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.uri = str;
    }

    public static /* synthetic */ SharedSpaceOidcMintJson copy$default(SharedSpaceOidcMintJson sharedSpaceOidcMintJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedSpaceOidcMintJson.uri;
        }
        C7384Etj.A0Y(str, 0);
        return new SharedSpaceOidcMintJson(str);
    }

    public final String component1() {
        return this.uri;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SharedSpaceOidcMintJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.uri = str;
    }
}
