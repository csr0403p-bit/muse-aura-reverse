package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgeVerificationHowSelfiesWorkSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SelfieAgeStepIntroKt$SelfieIntroText$bodyText$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ SelfieAgeStepViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieAgeStepIntroKt$SelfieIntroText$bodyText$1$1(SelfieAgeStepViewModel selfieAgeStepViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = selfieAgeStepViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onHowSelfiesWork();
        this.$navigator.navigate((AuraNavKey) AgeVerificationHowSelfiesWorkSheetKey.INSTANCE, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
