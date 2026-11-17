package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.app.Activity;

/* loaded from: classes.dex */
public final class HatchVoiceNuxSheetKt$HatchVoiceNuxContent$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Activity> $hostActivity$delegate;
    public final /* synthetic */ VoiceNuxInteraction $loggingState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceNuxSheetKt$HatchVoiceNuxContent$2$1(VoiceNuxInteraction voiceNuxInteraction, C1BO<? extends Activity> c1bo) {
        super(1);
        this.$loggingState = voiceNuxInteraction;
        this.$hostActivity$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final VoiceNuxInteraction voiceNuxInteraction = this.$loggingState;
        final C1BO<Activity> c1bo = this.$hostActivity$delegate;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt$HatchVoiceNuxContent$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity = (Activity) c1bo.getValue();
                if (activity == null || !activity.isFinishing()) {
                    Activity activity2 = (Activity) c1bo.getValue();
                    if (activity2 == null || !activity2.isChangingConfigurations()) {
                        voiceNuxInteraction.logDismissIfNeeded();
                    }
                }
            }
        };
    }
}
