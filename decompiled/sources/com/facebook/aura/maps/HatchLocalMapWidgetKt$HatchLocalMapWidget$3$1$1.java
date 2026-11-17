package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchLocalMapWidgetKt$HatchLocalMapWidget$3$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onExpand;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLocalMapWidgetKt$HatchLocalMapWidget$3$1$1(G0U<? super String, Unit> g0u) {
        super(1);
        this.$onExpand = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        HatchMapAnalytics.INSTANCE.logExpand();
        this.$onExpand.invoke(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
