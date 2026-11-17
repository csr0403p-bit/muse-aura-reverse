package com.facebook.aura.gateway.noise.carrier;

import X.AnonymousClass003;

/* loaded from: classes4.dex */
public final class HatchChipAllowlistVerdict {
    public final String[] chipIds;
    public final String rejection;

    public final String[] getChipIds() {
        return this.chipIds;
    }

    public final String getRejection() {
        return this.rejection;
    }

    public HatchChipAllowlistVerdict(String[] strArr, String str) {
        AnonymousClass003.A0u(strArr, str);
        this.chipIds = strArr;
        this.rejection = str;
    }
}
