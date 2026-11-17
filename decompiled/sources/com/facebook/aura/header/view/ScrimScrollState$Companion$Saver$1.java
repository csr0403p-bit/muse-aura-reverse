package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C1bi;
import X.C7384Etj;
import X.G0V;

/* loaded from: classes4.dex */
public final class ScrimScrollState$Companion$Saver$1 extends AbstractC7559F3s implements G0V<C1bi, ScrimScrollState, Float> {
    public static final ScrimScrollState$Companion$Saver$1 INSTANCE = new ScrimScrollState$Companion$Saver$1();

    public ScrimScrollState$Companion$Saver$1() {
        super(2);
    }

    @Override // X.G0V
    public final Float invoke(C1bi c1bi, ScrimScrollState scrimScrollState) {
        C7384Etj.A0Y(scrimScrollState, 1);
        return Float.valueOf(scrimScrollState.offsetPxState.AFn());
    }
}
