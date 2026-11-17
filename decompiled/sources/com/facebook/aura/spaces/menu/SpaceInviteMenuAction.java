package com.facebook.aura.spaces.menu;

import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceInviteMenuAction {
    public static final int $stable = 0;
    public final boolean loading;
    public final Function0<Unit> onClick;

    public SpaceInviteMenuAction(boolean z, Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 1);
        this.loading = z;
        this.onClick = function0;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
}
