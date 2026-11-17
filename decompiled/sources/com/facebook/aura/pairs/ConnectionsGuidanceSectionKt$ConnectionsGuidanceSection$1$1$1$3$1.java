package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $edit;
    public final /* synthetic */ G0V<HatchComponent, HatchSubsurface, Unit> $logClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$3$1(G0V<? super HatchComponent, ? super HatchSubsurface, Unit> g0v, Function0<Unit> function0) {
        super(0);
        this.$logClick = g0v;
        this.$edit = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$logClick.invoke(HatchComponent.EDIT_BUTTON, HatchSubsurface.DOT_MENU);
        this.$edit.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
