package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class PairsRepositoryKt$groupedPeople$2$ordered$3 extends AbstractC7559F3s implements G0U<TrustedCircleSource, Comparable<?>> {
    public static final PairsRepositoryKt$groupedPeople$2$ordered$3 INSTANCE = new PairsRepositoryKt$groupedPeople$2$ordered$3();

    public PairsRepositoryKt$groupedPeople$2$ordered$3() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Comparable<?> invoke(TrustedCircleSource trustedCircleSource) {
        TrustedCircleSource trustedCircleSource2 = trustedCircleSource;
        C7384Etj.A0Y(trustedCircleSource2, 0);
        return trustedCircleSource2.json.recipient_id;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Comparable<?> invoke2(TrustedCircleSource trustedCircleSource) {
        C7384Etj.A0Y(trustedCircleSource, 0);
        return trustedCircleSource.json.recipient_id;
    }
}
