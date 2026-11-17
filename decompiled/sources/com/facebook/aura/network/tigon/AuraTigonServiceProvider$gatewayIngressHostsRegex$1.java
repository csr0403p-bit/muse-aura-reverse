package com.facebook.aura.network.tigon;

import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes5.dex */
public final class AuraTigonServiceProvider$gatewayIngressHostsRegex$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final AuraTigonServiceProvider$gatewayIngressHostsRegex$1 INSTANCE = new AuraTigonServiceProvider$gatewayIngressHostsRegex$1();

    public AuraTigonServiceProvider$gatewayIngressHostsRegex$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return AbstractC2159Azp.A0z(str, ".", "\\.");
    }
}
