package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PairsLevelCardsKt$PairsLevelCards$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PairsLevel $level;
    public final /* synthetic */ G0U<PairsLevel, Unit> $onLevelSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairsLevelCardsKt$PairsLevelCards$1$1$1$1(G0U<? super PairsLevel, Unit> g0u, PairsLevel pairsLevel) {
        super(0);
        this.$onLevelSelected = g0u;
        this.$level = pairsLevel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onLevelSelected.invoke(this.$level);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
