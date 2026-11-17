package com.facebook.aura.ageverification.intf;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.user.provider.AgeCheckMethod;

/* loaded from: classes3.dex */
public final class AgeCheckFunnelLogging$onStatus$keys$1$3 extends AbstractC7559F3s implements G0U<AgeCheckMethod, CharSequence> {
    public static final AgeCheckFunnelLogging$onStatus$keys$1$3 INSTANCE = new AgeCheckFunnelLogging$onStatus$keys$1$3();

    public AgeCheckFunnelLogging$onStatus$keys$1$3() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(AgeCheckMethod ageCheckMethod) {
        C7384Etj.A0Y(ageCheckMethod, 0);
        int i = AgeCheckFunnelLogging.$stable;
        return AnonymousClass006.A0x(ageCheckMethod);
    }
}
