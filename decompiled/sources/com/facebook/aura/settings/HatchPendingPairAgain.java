package com.facebook.aura.settings;

import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchPendingPairAgain {
    public static final int $stable = 0;
    public static final HatchPendingPairAgain INSTANCE = new HatchPendingPairAgain();
    public static volatile String autoSelectTarget;
    public static volatile String targetName;

    public final void clearAutoSelectTarget() {
        autoSelectTarget = null;
    }

    public final void set(String str) {
        C7384Etj.A0Y(str, 0);
        targetName = str;
    }

    public final void setAutoSelectTarget(String str) {
        C7384Etj.A0Y(str, 0);
        autoSelectTarget = str;
    }

    public final String consume() {
        String str = targetName;
        targetName = null;
        return str;
    }

    public final String consumeAutoSelectTarget() {
        String str = autoSelectTarget;
        autoSelectTarget = null;
        return str;
    }
}
