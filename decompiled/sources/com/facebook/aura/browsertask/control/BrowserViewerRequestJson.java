package com.facebook.aura.browsertask.control;

import X.C06H;
import X.C2hx;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserViewerRequestJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final BrowserViewerJson viewer;

    public final class Companion {
        public final C9hr<BrowserViewerRequestJson> serializer() {
            return BrowserViewerRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final BrowserViewerRequestJson copy(BrowserViewerJson browserViewerJson) {
        C7384Etj.A0Y(browserViewerJson, 0);
        return new BrowserViewerRequestJson(browserViewerJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BrowserViewerRequestJson) && C7384Etj.areEqual(this.viewer, ((BrowserViewerRequestJson) obj).viewer));
    }

    public /* synthetic */ BrowserViewerRequestJson(int i, BrowserViewerJson browserViewerJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(BrowserViewerRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.viewer = browserViewerJson;
    }

    public static /* synthetic */ BrowserViewerRequestJson copy$default(BrowserViewerRequestJson browserViewerRequestJson, BrowserViewerJson browserViewerJson, int i, Object obj) {
        if ((i & 1) != 0) {
            browserViewerJson = browserViewerRequestJson.viewer;
        }
        C7384Etj.A0Y(browserViewerJson, 0);
        return new BrowserViewerRequestJson(browserViewerJson);
    }

    public final BrowserViewerJson component1() {
        return this.viewer;
    }

    public final BrowserViewerJson getViewer() {
        return this.viewer;
    }

    public int hashCode() {
        return this.viewer.hashCode();
    }

    public String toString() {
        return C3cJ.A0M("BrowserViewerRequestJson(viewer=", this.viewer);
    }

    public BrowserViewerRequestJson(BrowserViewerJson browserViewerJson) {
        C7384Etj.A0Y(browserViewerJson, 0);
        this.viewer = browserViewerJson;
    }
}
