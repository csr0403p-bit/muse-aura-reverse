package com.facebook.aura.main;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$HatchAuthenticatedLayers$2$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
    public final /* synthetic */ AbstractC3358CGz $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchActiveSessionHostKt$HatchAuthenticatedLayers$2$3$1$1(G0U<? super AbstractC3358CGz, Unit> g0u, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$onInitialContentRendered = g0u;
        this.$session = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onInitialContentRendered.invoke(this.$session);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
