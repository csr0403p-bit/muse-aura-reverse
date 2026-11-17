package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$5$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ MutableState<Integer> $hitlHeightPx$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$8$5$1(MutableState<Integer> mutableState) {
        super(1);
        this.$hitlHeightPx$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m273invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m273invokeozmzZPI(long j) {
        MutableState.A07(AnonymousClass002.A09(j), this.$hitlHeightPx$delegate);
    }
}
