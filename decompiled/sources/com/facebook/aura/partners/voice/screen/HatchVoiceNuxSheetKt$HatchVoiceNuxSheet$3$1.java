package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;
    public final /* synthetic */ VoiceNuxSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceNuxSheetKt$HatchVoiceNuxSheet$3$1(VoiceNuxSheetViewModel voiceNuxSheetViewModel, C1BO<? extends AuraNavigator> c1bo) {
        super(0);
        this.$viewModel = voiceNuxSheetViewModel;
        this.$navigator$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onNotNow();
        this.$navigator$delegate.getValue().back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
