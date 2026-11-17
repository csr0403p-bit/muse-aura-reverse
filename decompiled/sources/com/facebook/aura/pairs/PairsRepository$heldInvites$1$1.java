package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import java.util.Set;

/* loaded from: classes3.dex */
public final class PairsRepository$heldInvites$1$1 extends AbstractC7559F3s implements G0U<PairsHeldInvite, Boolean> {
    public final /* synthetic */ long $now;
    public final /* synthetic */ Set<String> $settled;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.facebook.aura.pairs.PairsHeldInvite r6) {
        /*
            r5 = this;
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            long r3 = r6.expiresAtMs
            long r1 = r5.$now
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            java.util.Set<java.lang.String> r1 = r5.$settled
            java.lang.String r0 = r6.generationId
            boolean r1 = r1.contains(r0)
            r0 = 0
            if (r1 == 0) goto L18
        L17:
            r0 = 1
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsRepository$heldInvites$1$1.invoke(com.facebook.aura.pairs.PairsHeldInvite):java.lang.Boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsRepository$heldInvites$1$1(long j, Set<String> set) {
        super(1);
        this.$now = j;
        this.$settled = set;
    }
}
