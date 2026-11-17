package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C2LD;
import X.C2Un;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AssistVoicePresentationKt$AssistIdentityPlaceholder$1$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ AssistVoicePresentation $presentation;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        this.$presentation.setIdentityBounds(C2Un.A00(c2ld.A02()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoicePresentationKt$AssistIdentityPlaceholder$1$1(AssistVoicePresentation assistVoicePresentation) {
        super(1);
        this.$presentation = assistVoicePresentation;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
