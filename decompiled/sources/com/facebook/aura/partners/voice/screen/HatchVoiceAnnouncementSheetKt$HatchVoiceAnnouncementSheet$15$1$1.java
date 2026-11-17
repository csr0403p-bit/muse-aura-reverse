package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchVoiceAnnouncementSheetKey;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$15$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceAnnouncementInteraction $interaction;
    public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;
    public final /* synthetic */ boolean $replacesVoiceNux;
    public final /* synthetic */ C1BO<AuraSheetState> $sheetState$delegate;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$15$1$1(VoiceAnnouncementViewModel voiceAnnouncementViewModel, boolean z, VoiceAnnouncementInteraction voiceAnnouncementInteraction, C1BO<? extends AuraNavigator> c1bo, C1BO<AuraSheetState> c1bo2) {
        super(0);
        this.$viewModel = voiceAnnouncementViewModel;
        this.$replacesVoiceNux = z;
        this.$interaction = voiceAnnouncementInteraction;
        this.$navigator$delegate = c1bo;
        this.$sheetState$delegate = c1bo2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$navigator$delegate.getValue().isInBackStack(HatchVoiceAnnouncementSheetKey.INSTANCE)) {
            AuraSheetState value = this.$sheetState$delegate.getValue();
            if (value == null || value.isSettled()) {
                if (this.$viewModel.onTalk(this.$replacesVoiceNux)) {
                    this.$interaction.logTalk();
                }
                this.$viewModel.onSheetShown();
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
