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
public final class SpaceProposalPresentationData extends C06G implements HatchPresentationData {
    public final SpaceProposalPresentation proposal;
    public static final Companion Companion = new Companion();
    public static final int $stable = SpaceProposalPresentation.$stable;

    public final class Companion {
        public final C9hr<SpaceProposalPresentationData> serializer() {
            return SpaceProposalPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SpaceProposalPresentationData copy(SpaceProposalPresentation spaceProposalPresentation) {
        C7384Etj.A0Y(spaceProposalPresentation, 0);
        return new SpaceProposalPresentationData(spaceProposalPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SpaceProposalPresentationData) && C7384Etj.areEqual(this.proposal, ((SpaceProposalPresentationData) obj).proposal));
    }

    public /* synthetic */ SpaceProposalPresentationData(int i, SpaceProposalPresentation spaceProposalPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpaceProposalPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.proposal = spaceProposalPresentation;
    }

    public static /* synthetic */ SpaceProposalPresentationData copy$default(SpaceProposalPresentationData spaceProposalPresentationData, SpaceProposalPresentation spaceProposalPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            spaceProposalPresentation = spaceProposalPresentationData.proposal;
        }
        C7384Etj.A0Y(spaceProposalPresentation, 0);
        return new SpaceProposalPresentationData(spaceProposalPresentation);
    }

    public final SpaceProposalPresentation component1() {
        return this.proposal;
    }

    public final SpaceProposalPresentation getProposal() {
        return this.proposal;
    }

    public int hashCode() {
        return this.proposal.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SpaceProposalPresentationData(SpaceProposalPresentation spaceProposalPresentation) {
        C7384Etj.A0Y(spaceProposalPresentation, 0);
        this.proposal = spaceProposalPresentation;
    }
}
