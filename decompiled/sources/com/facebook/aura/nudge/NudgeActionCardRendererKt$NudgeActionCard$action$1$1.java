package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NudgeActionCardRendererKt$NudgeActionCard$action$1$1 extends AbstractC7559F3s implements G0U<NudgeOutcome, Unit> {
    public final /* synthetic */ NudgeActionCardRequest $request;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NudgeOutcome nudgeOutcome) {
        C7384Etj.A0Y(nudgeOutcome, 0);
        this.$request.complete(nudgeOutcome);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NudgeActionCardRendererKt$NudgeActionCard$action$1$1(NudgeActionCardRequest nudgeActionCardRequest) {
        super(1);
        this.$request = nudgeActionCardRequest;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NudgeOutcome nudgeOutcome) {
        invoke2(nudgeOutcome);
        return Unit.INSTANCE;
    }
}
