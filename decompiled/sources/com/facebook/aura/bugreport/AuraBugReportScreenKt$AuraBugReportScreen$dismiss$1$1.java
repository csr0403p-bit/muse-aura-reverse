package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$dismiss$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ AuraBugReportReviewViewModel $reviewViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$dismiss$1$1(AuraBugReportReviewViewModel auraBugReportReviewViewModel, Function0<Unit> function0) {
        super(0);
        this.$reviewViewModel = auraBugReportReviewViewModel;
        this.$onBack = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SETTINGS, HatchSubsurface.BUG_REPORT, HatchScreen.BUG_REPORT, HatchComponent.CLOSE_BUTTON, null, null);
        this.$reviewViewModel.onFlowDismissed();
        this.$onBack.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
