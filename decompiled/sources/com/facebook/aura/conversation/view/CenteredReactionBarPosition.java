package com.facebook.aura.conversation.view;

import X.AeE;
import X.AnonymousClass002;
import X.BLU;
import X.EnumC1820Arj;

/* loaded from: classes.dex */
public final class CenteredReactionBarPosition implements AeE {
    public final int windowY;

    @Override // X.AeE
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo11calculatePositionllwVHH4(BLU blu, long j, EnumC1820Arj enumC1820Arj, long j2) {
        return AnonymousClass002.A0G(this.windowY, ((((int) (j >> 32)) - ((int) (j2 >> 32))) / 2) << 32);
    }

    public CenteredReactionBarPosition(int i) {
        this.windowY = i;
    }
}
