package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C2av;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$16$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ VoiceNuxTransition $transition;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(C3cH.A00(this.$transition.alpha));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$16$1(VoiceNuxTransition voiceNuxTransition) {
        super(1);
        this.$transition = voiceNuxTransition;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
