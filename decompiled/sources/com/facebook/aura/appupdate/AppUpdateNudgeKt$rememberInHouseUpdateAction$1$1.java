package com.facebook.aura.appupdate;

import X.AbstractC7559F3s;
import X.C1BO;
import X.G0U;
import android.content.Context;
import com.facebook.aura.nudge.NudgeOutcome;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AppUpdateNudgeKt$rememberInHouseUpdateAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<G0U<NudgeOutcome, Unit>> $currentOnOutcome$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppUpdateNudgeKt$rememberInHouseUpdateAction$1$1(Context context, C1BO<? extends G0U<? super NudgeOutcome, Unit>> c1bo) {
        super(0);
        this.$context = context;
        this.$currentOnOutcome$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AppUpdateChecker.INSTANCE.openUpdate(this.$context);
        C1BO.A0B(this.$currentOnOutcome$delegate).invoke(NudgeOutcome.UNKNOWN);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
