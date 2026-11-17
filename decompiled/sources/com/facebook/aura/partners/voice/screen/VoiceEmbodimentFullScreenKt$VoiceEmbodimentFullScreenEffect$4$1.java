package com.facebook.aura.partners.voice.screen;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$4$1", f = "VoiceEmbodimentFullScreen.kt", l = {121, 127, 130, 132}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $allowed;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ boolean $fullScreenDisabled;
    public final /* synthetic */ boolean $isCallActive;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ boolean $navigationAllowsEmbodiment;
    public float F$0;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$4$1(boolean z, VoiceAvatarFullScreenState voiceAvatarFullScreenState, HatchStatusPillMetrics hatchStatusPillMetrics, boolean z2, boolean z3, boolean z4, boolean z5, HtJ<? super VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$4$1> htJ) {
        super(2, htJ);
        this.$isCallActive = z;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$metrics = hatchStatusPillMetrics;
        this.$fullScreenDisabled = z2;
        this.$navigationAllowsEmbodiment = z3;
        this.$allowed = z4;
        this.$expanded = z5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$4$1(this.$isCallActive, this.$fullScreen, this.$metrics, this.$fullScreenDisabled, this.$navigationAllowsEmbodiment, this.$allowed, this.$expanded, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
