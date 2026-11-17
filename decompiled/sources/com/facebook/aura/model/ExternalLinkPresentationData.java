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
/* loaded from: classes3.dex */
public final class ExternalLinkPresentationData extends C06G implements HatchPresentationData {
    public final ExternalLinkPresentation externalLink;
    public static final Companion Companion = new Companion();
    public static final int $stable = ExternalLinkPresentation.$stable;

    public final class Companion {
        public final C9hr<ExternalLinkPresentationData> serializer() {
            return ExternalLinkPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ExternalLinkPresentationData copy(ExternalLinkPresentation externalLinkPresentation) {
        C7384Etj.A0Y(externalLinkPresentation, 0);
        return new ExternalLinkPresentationData(externalLinkPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ExternalLinkPresentationData) && C7384Etj.areEqual(this.externalLink, ((ExternalLinkPresentationData) obj).externalLink));
    }

    public /* synthetic */ ExternalLinkPresentationData(int i, ExternalLinkPresentation externalLinkPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ExternalLinkPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.externalLink = externalLinkPresentation;
    }

    public static /* synthetic */ ExternalLinkPresentationData copy$default(ExternalLinkPresentationData externalLinkPresentationData, ExternalLinkPresentation externalLinkPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            externalLinkPresentation = externalLinkPresentationData.externalLink;
        }
        C7384Etj.A0Y(externalLinkPresentation, 0);
        return new ExternalLinkPresentationData(externalLinkPresentation);
    }

    public final ExternalLinkPresentation component1() {
        return this.externalLink;
    }

    public final ExternalLinkPresentation getExternalLink() {
        return this.externalLink;
    }

    public int hashCode() {
        return this.externalLink.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ExternalLinkPresentationData(ExternalLinkPresentation externalLinkPresentation) {
        C7384Etj.A0Y(externalLinkPresentation, 0);
        this.externalLink = externalLinkPresentation;
    }
}
