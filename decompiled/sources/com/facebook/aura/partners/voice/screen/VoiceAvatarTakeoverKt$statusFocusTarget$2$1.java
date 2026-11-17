package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1518AkS;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$statusFocusTarget$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isCallStarting;
    public final /* synthetic */ boolean $isWindowFocused;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$statusFocusTarget$2$1(VoiceAvatarTakeoverState voiceAvatarTakeoverState, boolean z, boolean z2) {
        super(1);
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$isCallStarting = z;
        this.$isWindowFocused = z2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (MutableState.A0A(this.$takeoverState.isStatusFocusPending$delegate) && this.$isCallStarting && this.$isWindowFocused) {
            this.$takeoverState.setStatusFocusPending$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(false);
            C1518AkS.A00(this.$takeoverState.statusFocus);
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$statusFocusTarget$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
