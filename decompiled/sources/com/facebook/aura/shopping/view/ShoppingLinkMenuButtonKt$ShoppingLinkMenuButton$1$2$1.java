package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
    public final /* synthetic */ Function0<Unit> $onOpen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingLinkMenuButtonKt$ShoppingLinkMenuButton$1$2$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(1);
        this.$onOpen = function0;
        this.$menuExpanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        MutableState.A09(false, this.$menuExpanded$delegate);
        this.$onOpen.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
