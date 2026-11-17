package com.facebook.aura.appupdate;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.nudge.NudgeOutcome;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AppUpdateNudgeKt$rememberPlayUpdateAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<G0U<NudgeOutcome, Unit>> $currentOnOutcome$delegate;

    /* renamed from: com.facebook.aura.appupdate.AppUpdateNudgeKt$rememberPlayUpdateAction$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraPlayFlexibleUpdateResult, Unit> {
        public final /* synthetic */ C1BO<G0U<NudgeOutcome, Unit>> $currentOnOutcome$delegate;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult) {
            C7384Etj.A0Y(auraPlayFlexibleUpdateResult, 0);
            C1BO.A0B(this.$currentOnOutcome$delegate).invoke(AppUpdateNudgeKt.toNudgeOutcome(auraPlayFlexibleUpdateResult));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends G0U<? super NudgeOutcome, Unit>> c1bo) {
            super(1);
            this.$currentOnOutcome$delegate = c1bo;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AuraPlayFlexibleUpdateResult auraPlayFlexibleUpdateResult) {
            invoke2(auraPlayFlexibleUpdateResult);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppUpdateNudgeKt$rememberPlayUpdateAction$1$1(C1BO<? extends G0U<? super NudgeOutcome, Unit>> c1bo) {
        super(0);
        this.$currentOnOutcome$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraPlayFlexibleUpdateRequests.INSTANCE.request(new AnonymousClass1(this.$currentOnOutcome$delegate));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
