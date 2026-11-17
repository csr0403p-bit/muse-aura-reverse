package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchVoiceAnnouncementSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$15$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceAnnouncementInteraction $interaction;
    public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$15$2$1(VoiceAnnouncementInteraction voiceAnnouncementInteraction, VoiceAnnouncementViewModel voiceAnnouncementViewModel, C1BO<? extends AuraNavigator> c1bo) {
        super(0);
        this.$interaction = voiceAnnouncementInteraction;
        this.$viewModel = voiceAnnouncementViewModel;
        this.$navigator$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$navigator$delegate.getValue().isInBackStack(HatchVoiceAnnouncementSheetKey.INSTANCE)) {
            this.$interaction.logNotNow();
            this.$viewModel.onSheetShown();
            this.$viewModel.onNotNow();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
