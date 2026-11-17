package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.B6A;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenFrame$1$4$2$1 extends AbstractC7559F3s implements G0U<B6A, Unit> {
    public final /* synthetic */ MutableState<B6A> $headerColor$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceScreenFrame$1$4$2$1(MutableState<B6A> mutableState) {
        super(1);
        this.$headerColor$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(B6A b6a) {
        m2200invoke8_81llA(b6a.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-8_81llA, reason: not valid java name */
    public final void m2200invoke8_81llA(long j) {
        this.$headerColor$delegate.Af8(new B6A(j));
    }
}
