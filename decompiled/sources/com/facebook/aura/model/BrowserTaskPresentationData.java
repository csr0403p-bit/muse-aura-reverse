package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskPresentationData extends C06G implements HatchPresentationData {
    public final BrowserTaskPresentation browserTask;
    public static final Companion Companion = new Companion();
    public static final int $stable = BrowserTaskPresentation.$stable;

    public final class Companion {
        public final C9hr<BrowserTaskPresentationData> serializer() {
            return BrowserTaskPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final BrowserTaskPresentationData copy(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        return new BrowserTaskPresentationData(browserTaskPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BrowserTaskPresentationData) && C7384Etj.areEqual(this.browserTask, ((BrowserTaskPresentationData) obj).browserTask));
    }

    public /* synthetic */ BrowserTaskPresentationData(int i, BrowserTaskPresentation browserTaskPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(BrowserTaskPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.browserTask = browserTaskPresentation;
    }

    public static /* synthetic */ BrowserTaskPresentationData copy$default(BrowserTaskPresentationData browserTaskPresentationData, BrowserTaskPresentation browserTaskPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            browserTaskPresentation = browserTaskPresentationData.browserTask;
        }
        C7384Etj.A0Y(browserTaskPresentation, 0);
        return new BrowserTaskPresentationData(browserTaskPresentation);
    }

    public final BrowserTaskPresentation component1() {
        return this.browserTask;
    }

    public final BrowserTaskPresentation getBrowserTask() {
        return this.browserTask;
    }

    public int hashCode() {
        return this.browserTask.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public BrowserTaskPresentationData(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        this.browserTask = browserTaskPresentation;
    }
}
