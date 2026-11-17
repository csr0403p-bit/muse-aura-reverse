package com.facebook.aura.header.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.C1DG;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$5$1$2$1$2$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ MutableState<C1DG> $measuredLeadingChromeBottom$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        float fAgy = this.$density.Agy((int) c2ld.A00);
        if (C1DG.A09(fAgy, this.$measuredLeadingChromeBottom$delegate.getValue())) {
            return;
        }
        C1DG.A06(fAgy, this.$measuredLeadingChromeBottom$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTabHeaderKt$HatchTabHeader$5$1$2$1$2$1(AXN axn, MutableState<C1DG> mutableState) {
        super(1);
        this.$density = axn;
        this.$measuredLeadingChromeBottom$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
