package com.facebook.aura.nudge;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudges$awaitOnDemand$cardOutcome$1", f = "ConversationNudges.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConversationNudges$awaitOnDemand$cardOutcome$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public final /* synthetic */ NudgeActionCardRequest $request;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationNudges$awaitOnDemand$cardOutcome$1(NudgeActionCardRequest nudgeActionCardRequest, HtJ<? super ConversationNudges$awaitOnDemand$cardOutcome$1> htJ) {
        super(1, htJ);
        this.$request = nudgeActionCardRequest;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new ConversationNudges$awaitOnDemand$cardOutcome$1(this.$request, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return new ConversationNudges$awaitOnDemand$cardOutcome$1(this.$request, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            NudgeActionCardRequest nudgeActionCardRequest = this.$request;
            this.label = 1;
            obj = nudgeActionCardRequest.awaitOutcome(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Boolean.valueOf(obj == NudgeOutcome.COMPLETED);
    }
}
