package com.facebook.aura.vds.compose.contextmenu;

import X.AHD;
import X.AOI;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1110AYw;
import X.C15k;
import X.C1DG;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraContextMenuContentKt$AuraContextMenuContent$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AOI<Boolean> $expandedStates;
    public final /* synthetic */ G0V<BFM, Integer, AHD<AuraContextMenuItem>> $items;
    public final /* synthetic */ C1DG $maxHeight;
    public final /* synthetic */ AuraContextMenuStyle $menuStyle;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ MutableState<C15k> $transformOriginState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraContextMenuContentKt$AuraContextMenuContent$5(AOI<Boolean> aoi, MutableState<C15k> mutableState, C1110AYw c1110AYw, AuraContextMenuStyle auraContextMenuStyle, BRg bRg, C1DG c1dg, G0U<? super AuraContextMenuItem, Unit> g0u, G0V<? super BFM, ? super Integer, ? extends AHD<AuraContextMenuItem>> g0v, int i, int i2) {
        super(2);
        this.$expandedStates = aoi;
        this.$transformOriginState = mutableState;
        this.$scrollState = c1110AYw;
        this.$menuStyle = auraContextMenuStyle;
        this.$modifier = bRg;
        this.$maxHeight = c1dg;
        this.$onItemClick = g0u;
        this.$items = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraContextMenuContentKt.m2511AuraContextMenuContentCHqGF0E(this.$expandedStates, this.$transformOriginState, this.$scrollState, this.$menuStyle, this.$modifier, this.$maxHeight, this.$onItemClick, this.$items, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
