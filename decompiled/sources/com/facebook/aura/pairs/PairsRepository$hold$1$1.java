package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes3.dex */
public final class PairsRepository$hold$1$1 extends AbstractC7559F3s implements G0U<PairsHeldInvite, Boolean> {
    public final /* synthetic */ PairsHeldInvite $invite;

    @Override // X.G0U
    public final Boolean invoke(PairsHeldInvite pairsHeldInvite) {
        C7384Etj.A0Y(pairsHeldInvite, 0);
        return C60O.A0h(pairsHeldInvite.generationId, this.$invite.generationId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsRepository$hold$1$1(PairsHeldInvite pairsHeldInvite) {
        super(1);
        this.$invite = pairsHeldInvite;
    }
}
