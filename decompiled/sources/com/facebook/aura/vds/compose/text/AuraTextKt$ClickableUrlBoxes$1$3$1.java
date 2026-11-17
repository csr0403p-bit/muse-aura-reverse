package com.facebook.aura.vds.compose.text;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraTextKt$ClickableUrlBoxes$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $annotationStart;
    public final /* synthetic */ G0U<Integer, Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTextKt$ClickableUrlBoxes$1$3$1(G0U<? super Integer, Unit> g0u, int i) {
        super(0);
        this.$onClick = g0u;
        this.$annotationStart = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass005.A0l(this.$annotationStart, this.$onClick);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
