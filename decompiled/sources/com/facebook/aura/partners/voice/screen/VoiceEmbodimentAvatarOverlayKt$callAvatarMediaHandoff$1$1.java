package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $mediaReady;
    public final /* synthetic */ MutableState<Boolean> $revealed$delegate;
    public final /* synthetic */ boolean $transitionComplete;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$1$1(boolean z, boolean z2, MutableState<Boolean> mutableState) {
        super(1);
        this.$mediaReady = z;
        this.$transitionComplete = z2;
        this.$revealed$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$mediaReady && this.$transitionComplete) {
            MutableState.A09(true, this.$revealed$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
