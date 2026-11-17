package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistVoiceCallKt$AssistVoiceBubble$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AssistVoicePresentation $presentation;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(AnonymousClass003.A00(C1BO.A01(this.$presentation.progress) * 3.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistVoiceCallKt$AssistVoiceBubble$1$1(AssistVoicePresentation assistVoicePresentation) {
        super(1);
        this.$presentation = assistVoicePresentation;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
