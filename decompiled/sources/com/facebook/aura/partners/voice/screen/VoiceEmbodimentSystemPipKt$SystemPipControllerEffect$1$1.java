package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.activity.ComponentActivity;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$SystemPipControllerEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ComponentActivity $componentActivity;
    public final /* synthetic */ HatchSystemPipController $pipController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentSystemPipKt$SystemPipControllerEffect$1$1(ComponentActivity componentActivity, HatchSystemPipController hatchSystemPipController) {
        super(1);
        this.$componentActivity = componentActivity;
        this.$pipController = hatchSystemPipController;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchSystemPipController hatchSystemPipController;
        if (this.$componentActivity == null || (hatchSystemPipController = this.$pipController) == null) {
            return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$SystemPipControllerEffect$1$1$invoke$$inlined$onDispose$1
                @Override // X.C78g
                public void dispose() {
                }
            };
        }
        HatchSystemPipRuntime hatchSystemPipRuntime = HatchSystemPipRuntime.INSTANCE;
        hatchSystemPipRuntime.registerHideAvatarHandler(hatchSystemPipController.hideAvatarHandler);
        hatchSystemPipRuntime.registerCallEndDismissHandler(this.$pipController.callEndDismissHandler);
        final HatchSystemPipController hatchSystemPipController2 = this.$pipController;
        final ComponentActivity componentActivity = this.$componentActivity;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$SystemPipControllerEffect$1$1$invoke$$inlined$onDispose$2
            @Override // X.C78g
            public void dispose() {
                HatchSystemPipRuntime hatchSystemPipRuntime2 = HatchSystemPipRuntime.INSTANCE;
                hatchSystemPipRuntime2.unregisterHideAvatarHandler(hatchSystemPipController2.hideAvatarHandler);
                boolean zUnregisterCallEndDismissHandler = hatchSystemPipRuntime2.unregisterCallEndDismissHandler(hatchSystemPipController2.callEndDismissHandler, componentActivity.isFinishing());
                if (VoiceEmbodimentSystemPipKt.isInPipWindow(componentActivity)) {
                    return;
                }
                if (zUnregisterCallEndDismissHandler) {
                    hatchSystemPipRuntime2.cancelPipTransition();
                }
                hatchSystemPipController2.disable();
            }
        };
    }
}
