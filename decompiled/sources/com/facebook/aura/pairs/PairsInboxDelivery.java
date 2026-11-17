package com.facebook.aura.pairs;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PairsInboxDelivery {
    public static final int $stable = 0;
    public final Integer httpStatus;
    public final PairsInboxOutcome outcome;

    public PairsInboxDelivery(PairsInboxOutcome pairsInboxOutcome, Integer num) {
        C7384Etj.A0Y(pairsInboxOutcome, 0);
        this.outcome = pairsInboxOutcome;
        this.httpStatus = num;
    }

    public final Integer getHttpStatus() {
        return this.httpStatus;
    }

    public final PairsInboxOutcome getOutcome() {
        return this.outcome;
    }

    public /* synthetic */ PairsInboxDelivery(PairsInboxOutcome pairsInboxOutcome, Integer num, int i, C06H c06h) {
        this(pairsInboxOutcome, (i & 2) != 0 ? null : num);
    }
}
