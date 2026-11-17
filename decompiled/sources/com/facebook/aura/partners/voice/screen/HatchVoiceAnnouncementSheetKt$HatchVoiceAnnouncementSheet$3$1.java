package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.app.Activity;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchVoiceAnnouncementSheetKey;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;

/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Activity> $hostActivity$delegate;
    public final /* synthetic */ VoiceAnnouncementInteraction $interaction;
    public final /* synthetic */ C1BO<AuraNavigator> $navigator$delegate;
    public final /* synthetic */ C1BO<AuraSheetState> $sheetState$delegate;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$3$1(VoiceAnnouncementViewModel voiceAnnouncementViewModel, VoiceAnnouncementInteraction voiceAnnouncementInteraction, C1BO<? extends Activity> c1bo, C1BO<AuraSheetState> c1bo2, C1BO<? extends AuraNavigator> c1bo3) {
        super(1);
        this.$viewModel = voiceAnnouncementViewModel;
        this.$interaction = voiceAnnouncementInteraction;
        this.$hostActivity$delegate = c1bo;
        this.$sheetState$delegate = c1bo2;
        this.$navigator$delegate = c1bo3;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onSheetOpened();
        final VoiceAnnouncementViewModel voiceAnnouncementViewModel = this.$viewModel;
        final VoiceAnnouncementInteraction voiceAnnouncementInteraction = this.$interaction;
        final C1BO<Activity> c1bo = this.$hostActivity$delegate;
        final C1BO<AuraSheetState> c1bo2 = this.$sheetState$delegate;
        final C1BO<AuraNavigator> c1bo3 = this.$navigator$delegate;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity = (Activity) c1bo.getValue();
                if (activity == null || !activity.isFinishing()) {
                    Activity activity2 = (Activity) c1bo.getValue();
                    if (activity2 == null || !activity2.isChangingConfigurations()) {
                        AuraSheetState auraSheetState = (AuraSheetState) c1bo2.getValue();
                        if ((auraSheetState == null || !auraSheetState.isVisible()) && !((AuraNavigator) c1bo3.getValue()).isInBackStack(HatchVoiceAnnouncementSheetKey.INSTANCE)) {
                            voiceAnnouncementViewModel.onSheetShown();
                            voiceAnnouncementViewModel.onSheetGone();
                            voiceAnnouncementInteraction.logDismissIfNeeded();
                        }
                    }
                }
            }
        };
    }
}
