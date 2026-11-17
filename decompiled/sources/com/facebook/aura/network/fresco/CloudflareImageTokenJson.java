package com.facebook.aura.network.fresco;

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
public final class CloudflareImageTokenJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String viewer_assertion;

    public final class Companion {
        public final C9hr<CloudflareImageTokenJson> serializer() {
            return CloudflareImageTokenJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final CloudflareImageTokenJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new CloudflareImageTokenJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CloudflareImageTokenJson) && C7384Etj.areEqual(this.viewer_assertion, ((CloudflareImageTokenJson) obj).viewer_assertion));
    }

    public /* synthetic */ CloudflareImageTokenJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(CloudflareImageTokenJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.viewer_assertion = str;
    }

    public static /* synthetic */ CloudflareImageTokenJson copy$default(CloudflareImageTokenJson cloudflareImageTokenJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudflareImageTokenJson.viewer_assertion;
        }
        C7384Etj.A0Y(str, 0);
        return new CloudflareImageTokenJson(str);
    }

    public final String component1() {
        return this.viewer_assertion;
    }

    public final String getViewer_assertion() {
        return this.viewer_assertion;
    }

    public int hashCode() {
        return this.viewer_assertion.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public CloudflareImageTokenJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.viewer_assertion = str;
    }
}
