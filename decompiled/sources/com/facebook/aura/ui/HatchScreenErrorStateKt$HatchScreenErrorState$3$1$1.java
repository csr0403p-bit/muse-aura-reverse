package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchScreenErrorStateKt$HatchScreenErrorState$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $componentId;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ HatchSubsurface $subsurface;
    public final /* synthetic */ HatchSurface $surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchScreenErrorStateKt$HatchScreenErrorState$3$1$1(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen, String str, Function0<Unit> function0) {
        super(0);
        this.$surface = hatchSurface;
        this.$subsurface = hatchSubsurface;
        this.$screen = hatchScreen;
        this.$componentId = str;
        this.$onRetry = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchScreenErrorStateKt.logRetryClick(this.$surface, this.$subsurface, this.$screen, this.$componentId);
        this.$onRetry.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
