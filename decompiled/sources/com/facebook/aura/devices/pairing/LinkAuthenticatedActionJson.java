package com.facebook.aura.devices.pairing;

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
public final class LinkAuthenticatedActionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String action;

    public final class Companion {
        public final C9hr<LinkAuthenticatedActionJson> serializer() {
            return LinkAuthenticatedActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final LinkAuthenticatedActionJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new LinkAuthenticatedActionJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LinkAuthenticatedActionJson) && C7384Etj.areEqual(this.action, ((LinkAuthenticatedActionJson) obj).action));
    }

    public /* synthetic */ LinkAuthenticatedActionJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LinkAuthenticatedActionJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.action = str;
    }

    public static /* synthetic */ LinkAuthenticatedActionJson copy$default(LinkAuthenticatedActionJson linkAuthenticatedActionJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkAuthenticatedActionJson.action;
        }
        C7384Etj.A0Y(str, 0);
        return new LinkAuthenticatedActionJson(str);
    }

    public final String component1() {
        return this.action;
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public LinkAuthenticatedActionJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.action = str;
    }
}
