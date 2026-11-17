package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import X.HxE;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceScreenFrame$1$4$1$1 extends AbstractC7559F3s implements G0V<Boolean, Function0<? extends Unit>, Unit> {
    public final /* synthetic */ MutableState<HxE<Boolean, Function0<Unit>>> $webBackState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceScreenFrame$1$4$1$1(MutableState<HxE<Boolean, Function0<Unit>>> mutableState) {
        super(2);
        this.$webBackState$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Function0<? extends Unit> function0) {
        invoke(AnonymousClass001.A1X(bool), (Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 1);
        this.$webBackState$delegate.Af8(new HxE<>(Boolean.valueOf(z), function0));
    }
}
