package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceMenuPresentationKt$SpaceMenuSheetContent$3$1$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraContextMenuItem $item;
    public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceMenuPresentationKt$SpaceMenuSheetContent$3$1$2$2$1(G0U<? super AuraContextMenuItem, Unit> g0u, AuraContextMenuItem auraContextMenuItem) {
        super(0);
        this.$onItemClick = g0u;
        this.$item = auraContextMenuItem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemClick.invoke(this.$item);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
