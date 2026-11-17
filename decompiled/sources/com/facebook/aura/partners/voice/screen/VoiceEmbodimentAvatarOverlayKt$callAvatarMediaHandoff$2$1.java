package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C3cH;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ boolean $isCompactHost;
    public final /* synthetic */ MutableState<Boolean> $revealed$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$2$1(VoiceCallStateHolder voiceCallStateHolder, boolean z, long j, MutableState<Boolean> mutableState) {
        super(1);
        this.$stateHolder = voiceCallStateHolder;
        this.$isCompactHost = z;
        this.$callGeneration = j;
        this.$revealed$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C3cH.A1R(this.$stateHolder.isCompactPresentationActive) == this.$isCompactHost) {
            this.$stateHolder.setEmbodimentMediaRevealed(this.$callGeneration, MutableState.A0A((MutableState) this.$revealed$delegate));
        }
        final VoiceCallStateHolder voiceCallStateHolder = this.$stateHolder;
        final boolean z = this.$isCompactHost;
        final long j = this.$callGeneration;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (C3cH.A1R(voiceCallStateHolder.isCompactPresentationActive) == z) {
                    voiceCallStateHolder.setEmbodimentMediaRevealed(j, false);
                }
            }
        };
    }
}
