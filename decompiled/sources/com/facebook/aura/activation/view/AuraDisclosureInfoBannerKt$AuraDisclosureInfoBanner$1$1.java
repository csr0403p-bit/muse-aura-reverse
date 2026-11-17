package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationInfoSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraDisclosureInfoBannerKt$AuraDisclosureInfoBanner$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AuraDisclosureViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDisclosureInfoBannerKt$AuraDisclosureInfoBanner$1$1(AuraDisclosureViewModel auraDisclosureViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = auraDisclosureViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onInfoBannerClick();
        this.$navigator.navigate((AuraNavKey) ActivationInfoSheetKey.INSTANCE, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
