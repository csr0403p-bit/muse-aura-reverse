package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusScreenKt$HatchStatusScreen$5$1$3$4$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ MutableState<Integer> $tabBarHeightPx$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusScreenKt$HatchStatusScreen$5$1$3$4$1(MutableState<Integer> mutableState) {
        super(1);
        this.$tabBarHeightPx$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m2243invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m2243invokeozmzZPI(long j) {
        MutableState.A07(AnonymousClass002.A09(j), this.$tabBarHeightPx$delegate);
    }
}
