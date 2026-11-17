package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onExpand;
    public final /* synthetic */ String $pinnedSelection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMarketplaceMapCardKt$HatchMarketplaceMapCard$1$3$1(G0U<? super String, Unit> g0u, String str) {
        super(0);
        this.$onExpand = g0u;
        this.$pinnedSelection = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onExpand.invoke(this.$pinnedSelection);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
