package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ SystemPipModeObserver $observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$1$1(SystemPipModeObserver systemPipModeObserver) {
        super(1);
        this.$observer = systemPipModeObserver;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        SystemPipModeObserver systemPipModeObserver = this.$observer;
        if (systemPipModeObserver != null) {
            systemPipModeObserver.register();
        }
        final SystemPipModeObserver systemPipModeObserver2 = this.$observer;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt$rememberIsInPictureInPictureMode$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                SystemPipModeObserver systemPipModeObserver3 = systemPipModeObserver2;
                if (systemPipModeObserver3 != null) {
                    systemPipModeObserver3.dispose();
                }
            }
        };
    }
}
