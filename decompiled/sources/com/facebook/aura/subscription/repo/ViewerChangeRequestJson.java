package com.facebook.aura.subscription.repo;

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
public final class ViewerChangeRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String action;

    public final class Companion {
        public final C9hr<ViewerChangeRequestJson> serializer() {
            return ViewerChangeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ViewerChangeRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ViewerChangeRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ViewerChangeRequestJson) && C7384Etj.areEqual(this.action, ((ViewerChangeRequestJson) obj).action));
    }

    public /* synthetic */ ViewerChangeRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ViewerChangeRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.action = str;
    }

    public static /* synthetic */ ViewerChangeRequestJson copy$default(ViewerChangeRequestJson viewerChangeRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerChangeRequestJson.action;
        }
        C7384Etj.A0Y(str, 0);
        return new ViewerChangeRequestJson(str);
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

    public ViewerChangeRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.action = str;
    }
}
