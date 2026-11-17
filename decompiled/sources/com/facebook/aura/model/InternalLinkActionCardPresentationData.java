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
public final class InternalLinkActionCardPresentationData extends C06G implements HatchPresentationData {
    public final InternalLinkActionCardPresentation card;
    public static final Companion Companion = new Companion();
    public static final int $stable = InternalLinkActionCardPresentation.$stable;

    public final class Companion {
        public final C9hr<InternalLinkActionCardPresentationData> serializer() {
            return InternalLinkActionCardPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final InternalLinkActionCardPresentationData copy(InternalLinkActionCardPresentation internalLinkActionCardPresentation) {
        C7384Etj.A0Y(internalLinkActionCardPresentation, 0);
        return new InternalLinkActionCardPresentationData(internalLinkActionCardPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InternalLinkActionCardPresentationData) && C7384Etj.areEqual(this.card, ((InternalLinkActionCardPresentationData) obj).card));
    }

    public /* synthetic */ InternalLinkActionCardPresentationData(int i, InternalLinkActionCardPresentation internalLinkActionCardPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(InternalLinkActionCardPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.card = internalLinkActionCardPresentation;
    }

    public static /* synthetic */ InternalLinkActionCardPresentationData copy$default(InternalLinkActionCardPresentationData internalLinkActionCardPresentationData, InternalLinkActionCardPresentation internalLinkActionCardPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            internalLinkActionCardPresentation = internalLinkActionCardPresentationData.card;
        }
        C7384Etj.A0Y(internalLinkActionCardPresentation, 0);
        return new InternalLinkActionCardPresentationData(internalLinkActionCardPresentation);
    }

    public final InternalLinkActionCardPresentation component1() {
        return this.card;
    }

    public final InternalLinkActionCardPresentation getCard() {
        return this.card;
    }

    public int hashCode() {
        return this.card.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public InternalLinkActionCardPresentationData(InternalLinkActionCardPresentation internalLinkActionCardPresentation) {
        C7384Etj.A0Y(internalLinkActionCardPresentation, 0);
        this.card = internalLinkActionCardPresentation;
    }
}
