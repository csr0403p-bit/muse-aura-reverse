package com.facebook.aura.partners.voice.chrome;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class PillTurn {
    public final float callLeft;
    public final float callShift;
    public final List<PillTurnIcon> icons;
    public final float towardsEnd;

    public PillTurn(float f, float f2, List<PillTurnIcon> list, float f3) {
        C7384Etj.A0Y(list, 2);
        this.callLeft = f;
        this.towardsEnd = f2;
        this.icons = list;
        this.callShift = f3;
    }

    public final float getCallShift() {
        return this.callShift;
    }

    public final List<PillTurnIcon> getIcons() {
        return this.icons;
    }

    public final float getTowardsEnd() {
        return this.towardsEnd;
    }

    public final float inset(float f) {
        return this.towardsEnd * (f - this.callLeft);
    }
}
