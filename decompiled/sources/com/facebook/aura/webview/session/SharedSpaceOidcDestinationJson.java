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
public final class SharedSpaceOidcDestinationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String next_url;

    public final class Companion {
        public final C9hr<SharedSpaceOidcDestinationJson> serializer() {
            return SharedSpaceOidcDestinationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SharedSpaceOidcDestinationJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SharedSpaceOidcDestinationJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SharedSpaceOidcDestinationJson) && C7384Etj.areEqual(this.next_url, ((SharedSpaceOidcDestinationJson) obj).next_url));
    }

    public /* synthetic */ SharedSpaceOidcDestinationJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SharedSpaceOidcDestinationJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.next_url = str;
    }

    public static /* synthetic */ SharedSpaceOidcDestinationJson copy$default(SharedSpaceOidcDestinationJson sharedSpaceOidcDestinationJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedSpaceOidcDestinationJson.next_url;
        }
        C7384Etj.A0Y(str, 0);
        return new SharedSpaceOidcDestinationJson(str);
    }

    public final String component1() {
        return this.next_url;
    }

    public final String getNext_url() {
        return this.next_url;
    }

    public int hashCode() {
        return this.next_url.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SharedSpaceOidcDestinationJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.next_url = str;
    }
}
