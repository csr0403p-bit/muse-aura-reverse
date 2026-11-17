package com.facebook.aura.vds.font.api;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.F0C;
import X.FGI;
import com.facebook.aura.R;

/* loaded from: classes4.dex */
public final class AuraAppTypeface {
    public static final AuraAppTypeface INSTANCE = new AuraAppTypeface();
    public static final F0C optimisticAi$delegate = AbstractC5321DgF.A03(AuraAppTypeface$optimisticAi$2.INSTANCE);

    public final int getOptimisticAi() {
        return AnonymousClass001.A0F(optimisticAi$delegate.getValue());
    }

    public final String getCacheKeySuffix() {
        return getOptimisticAi() == R.font.optimistic_ai_vf ? "" : FGI.A0H(":font=", getOptimisticAi());
    }
}
