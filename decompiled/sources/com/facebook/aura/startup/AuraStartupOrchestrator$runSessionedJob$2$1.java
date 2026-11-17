package com.facebook.aura.startup;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.startup.AuraStartupOrchestrator$runSessionedJob$2$1", f = "AuraStartupOrchestrator.kt", l = {832}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class AuraStartupOrchestrator$runSessionedJob$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ SessionedStartupJob $job;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraStartupOrchestrator$runSessionedJob$2$1(SessionedStartupJob sessionedStartupJob, AbstractC3358CGz abstractC3358CGz, HtJ<? super AuraStartupOrchestrator$runSessionedJob$2$1> htJ) {
        super(2, htJ);
        this.$job = sessionedStartupJob;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraStartupOrchestrator$runSessionedJob$2$1(this.$job, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SessionedStartupJob sessionedStartupJob = this.$job;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.label = 1;
            if (sessionedStartupJob.execute(abstractC3358CGz, this) == enumC10460Hji) {
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
        return ((AuraStartupOrchestrator$runSessionedJob$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
