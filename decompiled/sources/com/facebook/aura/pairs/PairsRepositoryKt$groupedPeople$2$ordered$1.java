package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class PairsRepositoryKt$groupedPeople$2$ordered$1 extends AbstractC7559F3s implements G0U<TrustedCircleSource, Comparable<?>> {
    public static final PairsRepositoryKt$groupedPeople$2$ordered$1 INSTANCE = new PairsRepositoryKt$groupedPeople$2$ordered$1();

    public PairsRepositoryKt$groupedPeople$2$ordered$1() {
        super(1);
    }

    @Override // X.G0U
    public final Comparable<?> invoke(TrustedCircleSource trustedCircleSource) {
        C7384Etj.A0Y(trustedCircleSource, 0);
        return Integer.valueOf(trustedCircleSource.sourceRank);
    }
}
