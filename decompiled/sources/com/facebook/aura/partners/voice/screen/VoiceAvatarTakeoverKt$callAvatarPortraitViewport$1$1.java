package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.C1390AiL;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.status.view.AvatarViewportShape;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$callAvatarPortraitViewport$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ float $panelProgress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        C1390AiL c1390AiL = (C1390AiL) c2av;
        long j = c1390AiL.A0D;
        float fA00 = AnonymousClass004.A00(j);
        float fA002 = AnonymousClass001.A00(j) / this.$fullScreen.getAspectRatio();
        float progress = this.$fullScreen.getProgress();
        float f = ((1.0f - progress) * fA00) + (progress * fA002);
        float fA003 = (AnonymousClass001.A00(c1390AiL.A0D) * (1.0f - this.$panelProgress)) / 2.0f;
        c2av.Aeg(new AvatarViewportShape(f, fA003, fA003, 0.0f));
        c2av.Ad2(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$callAvatarPortraitViewport$1$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState, float f) {
        super(1);
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$panelProgress = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
