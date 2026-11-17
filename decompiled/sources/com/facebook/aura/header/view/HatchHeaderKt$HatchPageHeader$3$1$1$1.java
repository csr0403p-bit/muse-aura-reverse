package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchHeaderKt$HatchPageHeader$3$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
    public final /* synthetic */ boolean $logBackClick;
    public final /* synthetic */ Function0<Unit> $onBackClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHeaderKt$HatchPageHeader$3$1$1$1(boolean z, HatchBackClickAnalytics hatchBackClickAnalytics, Function0<Unit> function0) {
        super(0);
        this.$logBackClick = z;
        this.$backClickAnalytics = hatchBackClickAnalytics;
        this.$onBackClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$logBackClick) {
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchBackClickAnalytics hatchBackClickAnalytics = this.$backClickAnalytics;
            hatchInteractionLogger.logClick(hatchBackClickAnalytics != null ? hatchBackClickAnalytics.surface : null, HatchSubsurface.HEADER, hatchBackClickAnalytics != null ? hatchBackClickAnalytics.screen : null, HatchComponent.BACK_BUTTON, null, null, null);
        }
        this.$onBackClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
