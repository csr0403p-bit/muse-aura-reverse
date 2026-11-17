package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PairsAcceptLinks {
    public static final int $stable = 0;
    public static final PairsAcceptLinks INSTANCE = new PairsAcceptLinks();

    public final String stage(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return PairsRepository.Companion.getInstance(abstractC3358CGz).stageAcceptLink(str);
    }
}
