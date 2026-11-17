package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.C1822Arm;
import X.C1868Asi;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class FittedMuseGadgetNameKt$FittedMuseGadgetName$2$fitted$1$1 extends AbstractC7559F3s implements G0U<String, Boolean> {
    public final /* synthetic */ int $maxWidth;
    public final /* synthetic */ C1868Asi $measurer;
    public final /* synthetic */ C1822Arm $style;

    @Override // X.G0U
    public final Boolean invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return Boolean.valueOf(((int) (C1868Asi.A01(this.$measurer, this.$style, str, 1, 996, 0L).A02 >> 32)) <= this.$maxWidth);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FittedMuseGadgetNameKt$FittedMuseGadgetName$2$fitted$1$1(C1868Asi c1868Asi, C1822Arm c1822Arm, int i) {
        super(1);
        this.$measurer = c1868Asi;
        this.$style = c1822Arm;
        this.$maxWidth = i;
    }
}
