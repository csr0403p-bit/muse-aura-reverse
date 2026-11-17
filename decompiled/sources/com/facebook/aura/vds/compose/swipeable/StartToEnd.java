package com.facebook.aura.vds.compose.swipeable;

import X.C06G;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class StartToEnd extends C06G implements AuraSwipeDirectionAction {
    public static final int $stable = 0;
    public final Function0<Unit> action;

    public StartToEnd(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.action = function0;
    }

    public final StartToEnd copy(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        return new StartToEnd(function0);
    }

    public static /* synthetic */ StartToEnd copy$default(StartToEnd startToEnd, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = startToEnd.action;
        }
        C7384Etj.A0Y(function0, 0);
        return new StartToEnd(function0);
    }

    public final Function0<Unit> component1() {
        return this.action;
    }

    @Override // com.facebook.aura.vds.compose.swipeable.AuraSwipeDirectionAction
    public Function0<Unit> getAction() {
        return this.action;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
