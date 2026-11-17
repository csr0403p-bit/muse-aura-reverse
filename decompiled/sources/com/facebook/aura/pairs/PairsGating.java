package com.facebook.aura.pairs;

import com.facebook.aura.utils.HatchUtil;

/* loaded from: classes.dex */
public final class PairsGating {
    public static final int $stable = 0;
    public static final PairsGating INSTANCE = new PairsGating();

    public final boolean isEnabled() {
        return HatchUtil.INSTANCE.isConnectionsTabEnabled();
    }
}
