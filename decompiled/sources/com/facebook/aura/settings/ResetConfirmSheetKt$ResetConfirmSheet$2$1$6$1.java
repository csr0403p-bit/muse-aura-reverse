package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ResetConfirmSheetKt$ResetConfirmSheet$2$1$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isExitLogged$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSurface $surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetConfirmSheetKt$ResetConfirmSheet$2$1$6$1(HatchSurface hatchSurface, AuraNavigator auraNavigator, MutableState<Boolean> mutableState) {
        super(0);
        this.$surface = hatchSurface;
        this.$navigator = auraNavigator;
        this.$isExitLogged$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$isExitLogged$delegate);
        ResetConfirmSheetKt.logDismiss(this.$surface, HatchComponent.CANCEL_BUTTON);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
