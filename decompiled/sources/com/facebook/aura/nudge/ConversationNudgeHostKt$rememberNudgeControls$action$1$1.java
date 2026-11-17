package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ConversationNudgeHostKt$rememberNudgeControls$action$1$1 extends AbstractC7559F3s implements G0U<NudgeOutcome, Unit> {
    public final /* synthetic */ ConversationNudge $nudge;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NudgeOutcome nudgeOutcome) {
        C7384Etj.A0Y(nudgeOutcome, 0);
        ConversationNudgeCoordinator.INSTANCE.onOutcome(this.$nudge, nudgeOutcome);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationNudgeHostKt$rememberNudgeControls$action$1$1(ConversationNudge conversationNudge) {
        super(1);
        this.$nudge = conversationNudge;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NudgeOutcome nudgeOutcome) {
        invoke2(nudgeOutcome);
        return Unit.INSTANCE;
    }
}
