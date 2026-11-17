package com.facebook.aura.vds.compose.contextmenu;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraContextMenuContentKt$AuraContextMenuContent$3$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraContextMenuItem $menuItem;
    public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraContextMenuContentKt$AuraContextMenuContent$3$1$1$1$1(G0U<? super AuraContextMenuItem, Unit> g0u, AuraContextMenuItem auraContextMenuItem) {
        super(0);
        this.$onItemClick = g0u;
        this.$menuItem = auraContextMenuItem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemClick.invoke(this.$menuItem);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
