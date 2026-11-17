package com.facebook.aura.vds.compose.contextmenu;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BLU;
import X.BRg;
import X.C1110AYw;
import X.C1DG;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraContextMenuKt$AuraContextMenu$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ boolean $focusable;
    public final /* synthetic */ boolean $forceCenterHorizontalAlignment;
    public final /* synthetic */ G0V<BFM, Integer, AHD<AuraContextMenuItem>> $items;
    public final /* synthetic */ C1DG $maxHeight;
    public final /* synthetic */ AuraContextMenuStyle $menuStyle;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;
    public final /* synthetic */ G0U<BLU, Unit> $onMenuBoundsPositioned;
    public final /* synthetic */ boolean $screenshotTest;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ AHD<AuraContextMenuVerticalBand> $verticalBands;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraContextMenuKt$AuraContextMenu$2(BRg bRg, G0U<? super AuraContextMenuItem, Unit> g0u, Function0<Unit> function0, boolean z, AuraContextMenuStyle auraContextMenuStyle, long j, C1110AYw c1110AYw, boolean z2, G0V<? super BFM, ? super Integer, ? extends AHD<AuraContextMenuItem>> g0v, boolean z3, AHD<AuraContextMenuVerticalBand> ahd, C1DG c1dg, G0U<? super BLU, Unit> g0u2, boolean z4, int i, int i2, int i3) {
        super(2);
        this.$modifier = bRg;
        this.$onItemClick = g0u;
        this.$onDismissRequest = function0;
        this.$expanded = z;
        this.$menuStyle = auraContextMenuStyle;
        this.$offset = j;
        this.$scrollState = c1110AYw;
        this.$focusable = z2;
        this.$items = g0v;
        this.$forceCenterHorizontalAlignment = z3;
        this.$verticalBands = ahd;
        this.$maxHeight = c1dg;
        this.$onMenuBoundsPositioned = g0u2;
        this.$screenshotTest = z4;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraContextMenuKt.m2519AuraContextMenukiaLOpA(this.$modifier, this.$onItemClick, this.$onDismissRequest, this.$expanded, this.$menuStyle, this.$offset, this.$scrollState, this.$focusable, this.$items, this.$forceCenterHorizontalAlignment, this.$verticalBands, this.$maxHeight, this.$onMenuBoundsPositioned, this.$screenshotTest, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
