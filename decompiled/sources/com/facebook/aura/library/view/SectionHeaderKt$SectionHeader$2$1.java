package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SectionHeaderKt$SectionHeader$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchComponent $component;
    public final /* synthetic */ Function0<Unit> $onSeeAllClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionHeaderKt$SectionHeader$2$1(HatchComponent hatchComponent, Function0<Unit> function0) {
        super(0);
        this.$component = hatchComponent;
        this.$onSeeAllClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchComponent hatchComponent = this.$component;
        if (hatchComponent != null) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, hatchComponent, null, null, null);
        }
        this.$onSeeAllClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
