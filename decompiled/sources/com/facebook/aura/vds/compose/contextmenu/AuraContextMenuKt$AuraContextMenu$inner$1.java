package com.facebook.aura.vds.compose.contextmenu;

import X.AHD;
import X.AOI;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1110AYw;
import X.C15k;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraContextMenuKt$AuraContextMenu$inner$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AOI<Boolean> $expandedStates;
    public final /* synthetic */ G0V<BFM, Integer, AHD<AuraContextMenuItem>> $items;
    public final /* synthetic */ AuraContextMenuStyle $menuStyle;
    public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;
    public final /* synthetic */ AuraContextMenuPlacement $placement;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ MutableState<C15k> $transformOriginState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraContextMenuKt$AuraContextMenu$inner$1(AOI<Boolean> aoi, MutableState<C15k> mutableState, C1110AYw c1110AYw, AuraContextMenuStyle auraContextMenuStyle, AuraContextMenuPlacement auraContextMenuPlacement, G0U<? super AuraContextMenuItem, Unit> g0u, G0V<? super BFM, ? super Integer, ? extends AHD<AuraContextMenuItem>> g0v) {
        super(2);
        this.$expandedStates = aoi;
        this.$transformOriginState = mutableState;
        this.$scrollState = c1110AYw;
        this.$menuStyle = auraContextMenuStyle;
        this.$placement = auraContextMenuPlacement;
        this.$onItemClick = g0u;
        this.$items = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraContextMenuContentKt.m2511AuraContextMenuContentCHqGF0E(this.$expandedStates, this.$transformOriginState, this.$scrollState, this.$menuStyle, null, this.$placement.maxHeight, this.$onItemClick, this.$items, bfm, 48, 16);
        } else {
            bfm.Afo();
        }
    }
}
