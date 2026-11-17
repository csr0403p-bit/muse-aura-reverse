package com.facebook.aura.gateway;

import X.C7384Etj;
import com.facebook.aura.gateway.store.HatchCvmChipClaim;
import com.facebook.aura.gateway.store.HatchCvmChipDraw;

/* loaded from: classes4.dex */
public final class ResolvedChipClaim {
    public final HatchCvmChipClaim claim;
    public final HatchCvmChipDraw draw;
    public final boolean isRebid;

    public ResolvedChipClaim(HatchCvmChipClaim hatchCvmChipClaim, HatchCvmChipDraw hatchCvmChipDraw, boolean z) {
        C7384Etj.A0Y(hatchCvmChipClaim, 0);
        this.claim = hatchCvmChipClaim;
        this.draw = hatchCvmChipDraw;
        this.isRebid = z;
    }

    public final HatchCvmChipClaim getClaim() {
        return this.claim;
    }

    public final HatchCvmChipDraw getDraw() {
        return this.draw;
    }

    public final boolean isRebid() {
        return this.isRebid;
    }
}
