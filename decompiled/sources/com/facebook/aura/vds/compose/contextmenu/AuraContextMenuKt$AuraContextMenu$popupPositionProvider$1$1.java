package com.facebook.aura.vds.compose.contextmenu;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.BLU;
import X.C15k;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraContextMenuKt$AuraContextMenu$popupPositionProvider$1$1 extends AbstractC7559F3s implements G0V<BLU, BLU, Unit> {
    public final /* synthetic */ G0U<BLU, Unit> $onMenuBoundsPositioned;
    public final /* synthetic */ MutableState<C15k> $transformOriginState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraContextMenuKt$AuraContextMenu$popupPositionProvider$1$1(MutableState<C15k> mutableState, G0U<? super BLU, Unit> g0u) {
        super(2);
        this.$transformOriginState = mutableState;
        this.$onMenuBoundsPositioned = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BLU blu, BLU blu2) {
        invoke2(blu, blu2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BLU blu, BLU blu2) {
        AnonymousClass003.A0u(blu, blu2);
        this.$transformOriginState.Af8(new C15k(AuraContextMenuContentKt.calculateTransformOrigin(blu, blu2)));
        G0U<BLU, Unit> g0u = this.$onMenuBoundsPositioned;
        if (g0u != null) {
            g0u.invoke(blu2);
        }
    }
}
