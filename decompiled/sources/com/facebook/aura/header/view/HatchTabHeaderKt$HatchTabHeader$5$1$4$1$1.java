package com.facebook.aura.header.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.BL4;
import X.C1DG;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$5$1$4$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ boolean $hasTrailingButtons;
    public final /* synthetic */ MutableState<C1DG> $measuredTrailingChromeWidth$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTabHeaderKt$HatchTabHeader$5$1$4$1$1(boolean z, AXN axn, MutableState<C1DG> mutableState) {
        super(1);
        this.$hasTrailingButtons = z;
        this.$density = axn;
        this.$measuredTrailingChromeWidth$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1020invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1020invokeozmzZPI(long j) {
        C1DG.A06(!this.$hasTrailingButtons ? 0.0f : this.$density.Agy((int) (j >> 32)), this.$measuredTrailingChromeWidth$delegate);
    }
}
