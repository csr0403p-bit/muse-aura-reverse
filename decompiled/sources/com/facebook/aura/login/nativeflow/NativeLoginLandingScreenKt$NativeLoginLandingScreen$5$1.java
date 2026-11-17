package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginLandingScreenKt$NativeLoginLandingScreen$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isRemoveProfilesSheetOpen$delegate;
    public final /* synthetic */ Function0<Unit> $onRemoveProfilesDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginLandingScreenKt$NativeLoginLandingScreen$5$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$onRemoveProfilesDismiss = function0;
        this.$isRemoveProfilesSheetOpen$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$isRemoveProfilesSheetOpen$delegate)) {
            MutableState.A09(false, this.$isRemoveProfilesSheetOpen$delegate);
            this.$onRemoveProfilesDismiss.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
