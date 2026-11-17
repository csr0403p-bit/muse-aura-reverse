package com.facebook.aura.ageverification;

import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgeStepAction {
    public static final int $stable = 0;
    public final Function0<Unit> onClick;
    public final int textRes;

    public AgeStepAction(int i, Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 1);
        this.textRes = i;
        this.onClick = function0;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final int getTextRes() {
        return this.textRes;
    }
}
