package com.facebook.aura.startup;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3$1$1", f = "AuraStartupOrchestrator.kt", l = {611}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $key;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3$1$1(int i, HtJ<? super AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3$1$1> htJ) {
        super(2, htJ);
        this.$key = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3$1$1(this.$key, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraStartupOrchestrator auraStartupOrchestrator = AuraStartupOrchestrator.INSTANCE;
            int i2 = this.$key;
            this.label = 1;
            if (auraStartupOrchestrator.runSessionlessJob(i2, "sessionless/low-priority", this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new AuraStartupOrchestrator$launchLowPrioritySessionlessJobs$3$1$1(this.$key, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
