package com.facebook.aura.nudge;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NudgeControls extends C06G {
    public static final int $stable = 0;
    public final boolean isEnabled;
    public final Function0<Unit> onAccept;
    public final Function0<Unit> onDecline;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NudgeControls) {
                NudgeControls nudgeControls = (NudgeControls) obj;
                if (this.isEnabled != nudgeControls.isEnabled || !C7384Etj.areEqual(this.onAccept, nudgeControls.onAccept) || !C7384Etj.areEqual(this.onDecline, nudgeControls.onDecline)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NudgeControls copy$default(NudgeControls nudgeControls, boolean z, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nudgeControls.isEnabled;
        }
        if ((i & 2) != 0) {
            function0 = nudgeControls.onAccept;
        }
        if ((i & 4) != 0) {
            function02 = nudgeControls.onDecline;
        }
        return nudgeControls.copy(z, function0, function02);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final Function0<Unit> component2() {
        return this.onAccept;
    }

    public final Function0<Unit> component3() {
        return this.onDecline;
    }

    public final Function0<Unit> getOnAccept() {
        return this.onAccept;
    }

    public final Function0<Unit> getOnDecline() {
        return this.onDecline;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.onDecline, AnonymousClass005.A0F(this.onAccept, C0KA.A02(this.isEnabled)));
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public NudgeControls(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass003.A0x(function0, function02);
        this.isEnabled = z;
        this.onAccept = function0;
        this.onDecline = function02;
    }

    public final NudgeControls copy(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass003.A0x(function0, function02);
        return new NudgeControls(z, function0, function02);
    }

    public String toString() {
        return super.toString();
    }
}
