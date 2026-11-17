package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsActivityItemsKt$ConnectionsActivityMenu$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsActivityItemsKt$ConnectionsActivityMenu$1$2$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(1);
        this.$onDismiss = function0;
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        MutableState.A09(false, this.$expanded$delegate);
        this.$onDismiss.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
