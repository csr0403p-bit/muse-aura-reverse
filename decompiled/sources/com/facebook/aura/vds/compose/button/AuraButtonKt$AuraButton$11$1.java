package com.facebook.aura.vds.compose.button;

import X.AbstractC7559F3s;
import X.C0dx;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraButtonKt$AuraButton$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $clickHaptic;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraButtonKt$AuraButton$11$1(C0dx c0dx, int i, Function0<Unit> function0) {
        super(0);
        this.$haptic = c0dx;
        this.$clickHaptic = i;
        this.$onClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptic.AXr(this.$clickHaptic);
        this.$onClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
