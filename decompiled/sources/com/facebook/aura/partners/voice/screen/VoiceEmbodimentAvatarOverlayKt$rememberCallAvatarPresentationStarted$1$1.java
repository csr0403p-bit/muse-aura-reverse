package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$rememberCallAvatarPresentationStarted$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $started$delegate;
    public final /* synthetic */ boolean $transitionComplete;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$rememberCallAvatarPresentationStarted$1$1(boolean z, MutableState<Boolean> mutableState) {
        super(1);
        this.$transitionComplete = z;
        this.$started$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$transitionComplete) {
            MutableState.A09(true, this.$started$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$rememberCallAvatarPresentationStarted$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
